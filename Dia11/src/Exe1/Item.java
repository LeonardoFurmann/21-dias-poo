package Exe1;

public class Item {
	
	private int id;
	private int quant;
	private float preco_uni;
	private String descricao;
	private float desconto;
	
	public Item(int id, int quant, float preco_uni, String descricao, float desconto) {
		this.id = id;
		this.quant = quant;
		this.preco_uni = preco_uni;
		this.descricao = descricao;
		this.desconto = desconto;
	}
	
	
	public float getPrecoTotal() {
		return (preco_uni * quant) - (desconto * quant);
	}
	
	public void display(ItemDisplayFormatter format) {
		format.qunatidade(quant);
		format.id(id);
		format.preco_uni(preco_uni);
		format.desconto(desconto);
		format.descricao(descricao);
		format.precoAjustado(getPrecoTotal());
	}

	
	
}
