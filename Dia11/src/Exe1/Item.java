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
	
	public int getId() {
		return id;
	}
	
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	
	public float getPreco_uni() {
		return preco_uni;
	}
	
	public float getPrecoTotal() {
		return (preco_uni * quant) - (desconto * quant);
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	
	
	
}
