package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Funcionario;

public class FuncionarioDAO {
public void saveFuncionario(Funcionario funcionario) throws SQLException {
	
String sql = "insert into funcionario(CPF_func, nome_func, endereço_func, telefone_func, nascimento_func, sexo_func, funcao, salario)values(?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection con=null;
		PreparedStatement prep = null;
		
		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);
			
			prep.setString(1, funcionario.getCPF());
			prep.setString(2, funcionario.getNome());
			prep.setString(3, funcionario.getEndereço());
			prep.setString(4, funcionario.getTelefone());
			prep.setString(5, funcionario.getNascimento());
			prep.setString(6, funcionario.getSexo());
			prep.setString(7, funcionario.getFunção());
			prep.setString(8, funcionario.getSalario());
			
			prep.execute();
			
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
			
		}finally {
		
			//////fecha conexões
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

public List<Funcionario> getFuncionario(){
	String sql = "SELECT * FROM funcionario";
	List <Funcionario> funcionario = new ArrayList<Funcionario>();
	Connection con=null;
	PreparedStatement prep = null;
		
	ResultSet lista = null;
	
	try {
		con= Conexão.conectar();

		prep = con.prepareStatement(sql);
		
		lista= prep.executeQuery();
		
		
		while(lista.next()) {
			Funcionario func = new Funcionario();
			func.setCPF(lista.getString("CPF_func"));
			func.setNome(lista.getString("nome_func"));
			func.setTelefone(lista.getString("telefone_func"));
			func.setSexo(lista.getString("sexo_func"));
			func.setNascimento(lista.getString("nascimento_func"));
			func.setEndereço(lista.getString("endereço_func"));
			func.setFunção(lista.getString("funcao"));
			func.setSalario(lista.getString("salario"));
			funcionario.add(func);
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
	return funcionario;
	}

}
