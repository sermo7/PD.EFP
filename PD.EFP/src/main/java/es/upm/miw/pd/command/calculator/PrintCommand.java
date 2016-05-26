package es.upm.miw.pd.command.calculator;

public class PrintCommand implements Comando {

	private Calculator calculadora;
	
	public PrintCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculadora= calculator;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Total";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println(this.calculadora.getTotal());

	}

}
