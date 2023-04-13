package exe4;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

public class FuncionarioHorarioTeste extends TestCase {

	FuncionarioHorario funcionario;
	
	@Test
	public void test_CalculaPagamento() {
		
		funcionario.resetHoras();
		funcionario.addHoras(30);
		
		double result = funcionario.calcularPagamento();
		
		Assert.assertTrue("Deu ruim" , result == 1500);
	}
	
	public FuncionarioHorarioTeste(String name) {
		super(name);
	}
	
	protected void setUp() {
		funcionario = new FuncionarioHorario(" ", " ", 50);
	}

}
