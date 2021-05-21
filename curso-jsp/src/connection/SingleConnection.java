package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/*Responsável por fazer a conexão com o banco de dados*/
public class SingleConnection {
	
	private static String banco = "jdbc:postgresql://localhost:5432/curso-jsp";
	private static String pwd = "qwe123";
	private static String user = "postgres";
	private static Connection connection = null;
	
	static {
		conectar();
	}
	
	public SingleConnection() {
		// TODO Auto-generated constructor stub
		conectar();
	}
	
	private static void conectar() {
		
		try {
			if(connection == null) {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection(banco,user,pwd);
				connection.setAutoCommit(false);
			}
			
			
		} catch (Exception e) {
			throw new RuntimeException("YOU SHALL NOT PASS!!");
		}
	}
	
	public static Connection getConnection() {
		return connection;
	}

}
