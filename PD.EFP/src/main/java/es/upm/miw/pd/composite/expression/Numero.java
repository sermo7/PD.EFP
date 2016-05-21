package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {

	private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.valor);
	}
	
}
