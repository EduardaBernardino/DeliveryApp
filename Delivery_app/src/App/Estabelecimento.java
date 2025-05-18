package App;

public class Estabelecimento extends Pessoa{
	private String cnpj;
	private String ramo;
	private boolean ativo;

	public Estabelecimento(String nome, String endereco, String telefone, String cnpj, String ramo, boolean ativo) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.ramo = ramo;
		this.ativo = true;
	}
	public void ativar() {
		this.ativo = true;
	}
	public void desativar() {
		this.ativo = false;
	}
	public void atualizarEndereco(String novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void atualizarTelefone (String novoTelefone) {
		this.telefone = novoTelefone;
	}
	
	public String getCnpj() {
		return cnpj;
}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRamo() {
		return ramo;
	}
	public void SetRamo(String ramo) {
		this.ramo = ramo;
	}
	public boolean Ativo() {
		return ativo;
	}
}
