package es.upm.miw.pd.command.calculator;

public class ResetCommand implements Comando {

	private Calculator calculadora;
	
	public ResetCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculadora= calculator;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Resetear";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.calculadora.reset();

	}

}
