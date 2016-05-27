package es.upm.miw.pd.command.calculator;

public abstract class ComandoAbstract implements Comando {

	private Calculator calculadora;
	
	public ComandoAbstract(Calculator calculadora){
		this.calculadora= calculadora;
	}
	
	public Calculator getCalculadora(){
		return this.calculadora;
	}
	
	
}
