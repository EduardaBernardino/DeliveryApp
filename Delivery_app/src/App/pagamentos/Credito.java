package App.pagamentos;

import App.FormaPagamento;

public class Credito implements FormaPagamento {
	private String numeroCartao;
	private String nomeTitular;
	private String validade;
	private String codigoSeguranca;
	
	public Credito(String numeroCartao, String nomeTitular, String validade, String codigoSeguranca) {
		super();
		this.setNumeroCartao(numeroCartao);
		this.setNomeTitular(nomeTitular);
		this.setValidade(validade);
		this.setCodigoSeguranca(codigoSeguranca);
	}

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito.");
		
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(String codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

}
