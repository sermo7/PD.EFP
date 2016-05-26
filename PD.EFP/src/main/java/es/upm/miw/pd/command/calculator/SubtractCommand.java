package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand implements Comando {

	private Calculator calculadora;
	
	public SubtractCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculadora= calculator;
		
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Restar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int i = IO.getIO().readInt();
		this.calculadora.subtract(i);
	}

}
