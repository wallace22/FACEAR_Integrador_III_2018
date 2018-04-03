package br.edu.unifacear.projeto.dao;	
	import java.sql.Date;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import br.edu.unifacear.projeto.model.Cliente;


	public class ClienteDao extends Dao {
			
		private String SQL_INSERT ="INSERT INTO TB_CLIENTE(cpf,email,senha, nome, dataNasc, status)values(?,?,?,?,?,?);";
		private String SQL_UPDATE ="UPDATE TB_CLIENTE SET email =?, senha = ?, nome = ?, dataNasc = ?, status = ? WHERE cpf = ?;";
		private String SQL_DELETE ="UPDATE TB_CLIENTE SET status = ? WHERE cpf = ?;";
		private String SQL_SELECT ="SELECT * FROM TB_CLIENTE;";
		private String SQL_BUSCARCPF = "SELECT * FROM TB_CLIENTE WHERE cpf=?;";
		
		public void inserir(Cliente c) {
			try {
				//Abrir conexão
				conectar();
				
				// inserir comenado SQL de insert
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_INSERT);
				ps.setInt(1, c.getCpf());
				ps.setString(2, c.getEmail());
				ps.setString(3, c.getSenha());
				ps.setString(4, c.getNome());
				ps.setDate(5, (Date) c.getDataNasc());
				ps.setBoolean(6,c.isStatus());
				ps.executeUpdate();
				
				
				// fechar conexão
				desconectar();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void alterar(Cliente c) {
			try {
				//Abrir conexão
				conectar();
			
				//inserir comando SQL de UPDATE
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_UPDATE);
				ps.setString(1, c.getEmail());
				ps.setString(2, c.getSenha());
				ps.setString(3, c.getNome());
				ps.setDate(4, (Date) c.getDataNasc());
				ps.setBoolean(5, c.isStatus());
				ps.setInt(6, c.getCpf());
				
			
				ps.executeUpdate();
			
				//Fechar conexão
				desconectar();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void excluir(Cliente c) {
			try {
				//Abrir conexão
				conectar();
				
				//inserir comando SQL de DELETE
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_DELETE);
				ps.setBoolean(1, false);
				ps.setInt(2, c.getCpf());
				//Fechar conexão
				desconectar();
				
				ps.executeUpdate(SQL_DELETE);
				
				//Fechar conexão
				desconectar();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public List<Cliente> listarTodos() {
			List<Cliente> lista = new ArrayList<Cliente>();
			try{
					//Abrir conexão
					conectar();
					
					//inserir comando SQL de SELECT
					PreparedStatement ps = db.getConnection().prepareStatement(SQL_SELECT);
					ResultSet rs =ps.executeQuery();
					
					while(rs.next()) {
						Cliente c = new Cliente(rs.getInt("cpf"),
													  rs.getString("email"),
													  rs.getString("senha"),
													  rs.getString("nome"),
													  rs.getDate("dataNasc"),
													  rs.getBoolean("status"));
						lista.add(c);
						
					}
					
					//Fechar conexão
					desconectar();
			}catch(Exception e) {
				e.printStackTrace();
			}
			return lista;
		}

		
	public Cliente obterPorCpf(int cpf) {
			
			Cliente retorno = new Cliente();
			try{
				//Abrir conexão
				conectar();
				

				//inserir comando SQL de SELECT
				PreparedStatement ps = db.getConnection().prepareStatement(SQL_BUSCARCPF);
				ps.setInt(1, cpf);
				ResultSet rs =ps.executeQuery();
				
				while(rs.next()) {
					retorno.setEmail(rs.getString("email"));
					retorno.setNome(rs.getString("nome"));
					retorno.setStatus(rs.getBoolean("status"));
					
					
				}
				
				//Fechar conexão
				desconectar();
		}catch(Exception e) {
			e.printStackTrace();
		}
			
			
			
			
			return retorno;
		}
	}


