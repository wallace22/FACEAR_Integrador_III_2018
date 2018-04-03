package br.edu.unifacear.projeto.session;
	import java.util.List;

	import br.edu.unifacear.projeto.dao.ClienteDao;
	import br.edu.unifacear.projeto.model.Cliente;
public class ClienteSession {


		private ClienteDao cldao;
		
		public ClienteSession() {
			cldao = new ClienteDao();
		}
		
		public void inserirCliente(Cliente c) {
			
			cldao.inserir(c);
		}
		public List<Cliente> obterPorCpf(int cpf) {
			
			return listarTodos();
		}
		
		public List<Cliente> listarTodos() {
			
			
			return cldao.listarTodos();
		}
		
		
	}

