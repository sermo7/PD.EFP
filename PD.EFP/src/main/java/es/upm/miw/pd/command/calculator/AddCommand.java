package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand implements Comando {

	private Calculator calculadora;
	
	
	public AddCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		this.calculadora= calculator;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sumar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int i = IO.getIO().readInt();
		this.calculadora.add(i);
	}

}
