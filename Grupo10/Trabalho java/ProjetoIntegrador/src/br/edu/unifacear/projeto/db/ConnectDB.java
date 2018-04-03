package br.edu.unifacear.projeto.db;
	
	import java.io.IOException;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class ConnectDB {

		private String driver;
		private String url;
		private String username;
		private String password;
		
		public ConnectDB() {
			
			
			//PESQUISAR SOBRE.
			
			driver = "com.mysql.jdbc.Driver";
			url = "jdbc:mysql://localhost:3306/yourcodelab?useSSL=true";
			username = "root";
			password = "douglas05069809";
			
		}
		public Connection getConnection() throws IOException, ClassNotFoundException, SQLException{
			Class.forName(driver);
			return DriverManager.getConnection(url, username, password);
			
		}
	}


