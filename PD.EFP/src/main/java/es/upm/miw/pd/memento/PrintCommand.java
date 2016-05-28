package es.upm.miw.pd.memento;

import upm.jbb.IO;

public class PrintCommand extends ComandoAbstract {

	public PrintCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		super(calculator);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Total";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		IO.getIO().println(this.getCalculadora().getTotal());
	}

}
