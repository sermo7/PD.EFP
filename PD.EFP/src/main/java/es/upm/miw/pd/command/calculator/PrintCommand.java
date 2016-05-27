package es.upm.miw.pd.command.calculator;

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
		System.out.println(this.getCalculadora().getTotal());

	}

}
