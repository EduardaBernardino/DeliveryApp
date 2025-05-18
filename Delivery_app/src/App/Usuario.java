package App;

public class Usuario extends Pessoa{
	private String cpf;
	private String email;
	private String senha;

	
	public Usuario(String nome, String endereco, String telefone, String cpf, String email, String senha) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}

		public void alterarSenha(String novaSenha) {
			this.senha = novaSenha;
	}
		
		public void alterarEmail(String novoEmail) {
			this.email = novoEmail;
		}
		
		public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
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

	  
	    public boolean alterarSenha(String senhaAtual, String novaSenha) {
	        if (this.senha.equals(senhaAtual)) {
	            this.senha = novaSenha;
	            return true;
	        }
	        return false;
	    }

	  
	    public boolean autenticar(String email, String senha) {
	        return this.email.equals(email) && this.senha.equals(senha);
	    }

}