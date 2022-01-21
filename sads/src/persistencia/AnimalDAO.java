package persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dominio.Animal;

public class AnimalDAO {
	public void saveAnimal(Animal animal) throws SQLException {
		String sql = "insert into animal(CPF_dono, nome_anim, sexo_anim, raça, espécie, nascimento_anim, estado) values (?, ?, ?, ?, ?, ?, ?)"; 

		Connection con=null;
		PreparedStatement prep = null;
		
		try {
			con = Conexão.conectar();
			prep = con.prepareStatement(sql);
			
			prep.setString(1, animal.getCPF_dono());
			prep.setString(2, animal.getNome());
			prep.setString(3, animal.getSexo());
			prep.setString(4, animal.getRaça());
			prep.setString(5, animal.getEspecie());
			prep.setString(6, animal.getNascimento());
			prep.setString(7, animal.getEstado());
			
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

	public List<Animal> getAnimal(){
		String sql = "SELECT * FROM animal";
		List <Animal> anim = new ArrayList<Animal>();
		Connection con=null;
		PreparedStatement prep = null;
			
		ResultSet lista = null;
		
		try {
			con= Conexão.conectar();

			prep = con.prepareStatement(sql);
			
			lista= prep.executeQuery();
			
			
			while(lista.next()) {
				Animal anima = new Animal();
				anima.setEstado(lista.getString("estado"));
				anima.setNome(lista.getString("nome_anim"));
				anima.setRaça(lista.getString("raça"));
				anima.setSexo(lista.getString("sexo_anim"));
				anima.setNascimento(lista.getString("nascimento_anim"));
				anima.setEspecie(lista.getString("espécie"));
				anima.setCPF_dono(lista.getString("CPF_dono"));
				anim.add(anima);
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
		return anim;
		}

}
