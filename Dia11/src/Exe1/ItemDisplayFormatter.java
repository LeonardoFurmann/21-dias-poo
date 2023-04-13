package Exe1;

public interface ItemDisplayFormatter {
	
	public void qunatidade(int quant);
	public void id(int id);
	public void preco_uni(float preco_uni);
	public void desconto(float desconto);
	public void descricao(String descricao);
	public void precoAjustado(float total);
	public String format();
}

