package es.upm.miw.pd.command.calculator;

public class ResetCommand extends ComandoAbstract {

	public ResetCommand(Calculator calculator) {
		// TODO Auto-generated constructor stub
		super(calculator);
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Resetear";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.getCalculadora().reset();

	}

}
