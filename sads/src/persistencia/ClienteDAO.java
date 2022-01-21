package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Cliente;

public class ClienteDAO {
	public void saveCliente(Cliente cliente) throws SQLException {

		String sql = "INSERT INTO cliente (CPF_clien, nome_clien, telefone_clien, nascimento_clien, sexo_clien) VALUES (?, ?, ?, ?, ?)";
		
		Connection con=null;
		PreparedStatement prep = null;
		
		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);
			
			prep.setString(1, cliente.getCPF());
			prep.setString(2, cliente.getNome());
			prep.setString(3, cliente.getTelefone());
			prep.setString(4, cliente.getNascimento());
			prep.setString(5, cliente.getSexo());
			
			prep.execute();
			
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
			
		}finally {
		try {
			if(prep!=null) {
				prep.close();
			}
			if (con!=null) {
				con.close();
			}
			
		}catch(Exception e){
			System.out.println("erro: " + e);
		}
		
		}
		
	}

	
public List<Cliente> getCliente(){
	
	String sql = "SELECT * FROM cliente";
	List <Cliente> clientes = new ArrayList<Cliente>();
	Connection con=null;
	PreparedStatement prep = null;
	ResultSet lista = null;
	
	try {
		con= Conexão.conectar();

		prep = con.prepareStatement(sql);
		
		lista= prep.executeQuery();
		
		
		while(lista.next()) {
			Cliente clien = new Cliente();
			clien.setCPF(lista.getString("CPF_clien"));
			clien.setNome(lista.getString("nome_clien"));
			clien.setTelefone( lista.getString("telefone_clien"));
			clien.setSexo(lista.getString("sexo_clien"));
			clien.setNascimento(lista.getString("nascimento_clien"));
			clientes.add(clien);
		}
		
		
		
		
	} catch (Exception e) {
		System.out.println("erro: " + e.getMessage());
	}finally {

	    //////fecha conexões
		try {
			if(lista!=null) {
				prep.close();
				con.close();
			}if (prep!=null) {
				prep.close();
			}if(con!=null) {
				con.close();
			}
		} catch (Exception e2) {
		 System.out.println("erro: " + e2.getMessage());
		}
	
	}
	return clientes;
	}

}
