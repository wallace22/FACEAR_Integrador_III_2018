package br.edu.unifacear.projeto.model;
import java.util.Date;

public class Cliente {
	
		private int cpf;
		private String email;
		private String senha;
		private String nome;
		private Date dataNasc;
		private boolean status;
		
		public Cliente(int cpf, String email, String senha, String nome,Date dataNasc, boolean status) {
			super();
			this.cpf = cpf;
			this.email = email;
			this.senha = senha;
			this.nome = nome;
			this.dataNasc = dataNasc;
			this.status = status;
		}
		
		public Cliente() {
			
		}

		public int getCpf() {
			return cpf;
		}

		public void setCpf(int cpf) {
			this.cpf = cpf;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Date getDataNasc() {
			return dataNasc;
		}

		public void setDataNasc(Date dataNasc) {
			this.dataNasc = dataNasc;
		}

		public boolean isStatus() {
			// TODO Auto-generated method stub
			return false;
		}

		public void setStatus(boolean boolean1) {
			// TODO Auto-generated method stub
			
		}

		
	}
