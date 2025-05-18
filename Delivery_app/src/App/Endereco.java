package App;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private int numero;
    private String cep;
    


	public Endereco(String rua, String bairro, String cidade, String estado, int numero, String cep) {
		super();
		this.setRua(rua);
		this.setBairro(bairro);
		this.setCidade(cidade);
		this.setEstado(estado);
		this.setNumero(numero);
		this.setCep1(cep);
	}



	public void atualizarEndereco(String rua, String bairro, String cidade, String estado, int numero, String cep) {
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.numero = numero;
		 setCep1(cep);
	}
	 private boolean validarCep(String cep) {
	        return cep.matches("\\d{5}-\\d{3}");
	    }

	public String getRua() {
		return rua;
	}



	public void setRua(String rua) {
		this.rua = rua;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getCep() {
		return cep;
	}



	public void setCep1(String cep) {
		this.cep = cep;
	}


public void setCep(String cep) {
    if (validarCep(cep)) {
        this.cep = cep;
    } else {
        throw new IllegalArgumentException("CEP inválido. O formato correto é: 00000-000");
    }
}
}