package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexão {
	private static final String user = "root";
	private static final String senha = "venishel";
	private static final String caminho = "jdbc:mysql://localhost:3306/veterinaria";
	
	
	public static Connection conectar() {
		Connection conexão = null;
		
		//conecta com o banco
		try {
			
			conexão = DriverManager.getConnection(caminho, user, senha);
	     		}
		//mostra erro
		catch (SQLException e) 
			{
				e.getMessage();}
		return conexão;}
	
	
	
	public static Connection desconectar() {
		
		Connection conn = conectar();
		
		//checa conexão
		if(conn!=null) {
			
			//desconecta
			try {
				conn.close();
				//mostra erro
			} catch (Exception e) {
				System.out.println("erro: "+e.getMessage());
			}
		}
		return conn;
		
		
	}
	
}