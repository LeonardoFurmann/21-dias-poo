package Exe1;

public class ItemTableRow implements ItemDisplayFormatter{
	
	private int id;
	private int quant;
	private float preco_uni;
	private String descricao;
	private float desconto;
	private float precoAjustado;
	
	
	@Override
	public void qunatidade(int quant) {
		this.quant = quant;
		
	}
	@Override
	public void id(int id) {
		this.id = id;
		
	}
	@Override
	public void preco_uni(float preco_uni) {
		this.preco_uni = preco_uni;
		
	}
	@Override
	public void desconto(float desconto) {
		this.desconto = desconto;
		
	}
	@Override
	public void descricao(String descricao) {
		this.descricao = descricao;
		
	}
	@Override
	public void precoAjustado(float total) {
		this.precoAjustado = precoAjustado;
		
	}
	@Override
	public String format() {
		String row = "<tr>";
		row = row + "<td>" + id   + "</td>";
		row = row + "<td>" + quant   + "</td>";
		row = row + "<td>" + descricao   + "</td>";
		row = row + "<td>" + preco_uni   + "</td>";
		row = row + "<td>" + precoAjustado   + "</td>";
		row = row + "</tr>";	
		return row;
	}
	
	
}
