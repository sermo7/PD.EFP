package es.upm.miw.pd.memento;

import upm.jbb.IO;

public class AddCommand extends ComandoAbstract {

	public AddCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		super(calculator);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Sumar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int i = IO.getIO().readInt("Introducir valor a sumar");
		this.getCalculadora().add(i);
	}

}

