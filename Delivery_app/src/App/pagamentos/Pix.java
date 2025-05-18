package App.pagamentos;

import App.FormaPagamento;

public class Pix implements FormaPagamento {
	private String chavePix;

	 public Pix(String chavePix) {
	        this.setChavePix(chavePix);
	    }

	@Override
	public void realizarPagamento(double valor) {
		System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
		
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

}
