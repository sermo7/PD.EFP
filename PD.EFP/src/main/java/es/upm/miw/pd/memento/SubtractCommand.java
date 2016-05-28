package es.upm.miw.pd.memento;

import upm.jbb.IO;

public class SubtractCommand extends ComandoAbstract {

	public SubtractCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		super(calculator);	
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Restar";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		int i = IO.getIO().readInt("Introducir valor a restar");
		this.getCalculadora().subtract(i);
	}

}
