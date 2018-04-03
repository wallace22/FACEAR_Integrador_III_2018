package br.edu.unifacear.projeto.dao;
import java.sql.Connection;

import br.edu.unifacear.projeto.db.ConnectDB;

public class Dao {


//encode64

		
		protected ConnectDB db;
		private Connection connection;
		public Dao() {
			db = new ConnectDB();
		}
		
		public void conectar() {
			// realizar conexão com o BD
			
		}
		public void desconectar() {
			// realizar desconecxão com o BD
		}
		

	}



