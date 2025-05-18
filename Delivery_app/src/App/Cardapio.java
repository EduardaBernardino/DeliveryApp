package App;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	private List<String> itens;
    private List<Double> precos;
    
	public Cardapio() {
	    this.itens = new ArrayList<>();
        this.precos = new ArrayList<>();
	}
	public void adicionarItem(String item, double preco) {
		this.itens.add(item);
		this.precos.add(preco);
	}
	 public void removerItem(int index) {
	        this.itens.remove(index);
	        this.precos.remove(index);
}

	 public void atualizarItem(int index, String novoItem, double novoPreco) {
		 this.itens.set(index, novoItem);
		 this.precos.set(index, novoPreco);
	 }
	 
	 public void listarItens() {
		 for (int i = 0; i < itens.size(); i++) {
	            System.out.println(itens.get(i) + " - R$ " + precos.get(i));
	        }
	    }
	}