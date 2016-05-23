package es.upm.miw.pd.flyweight;

public abstract class Componente {
	
	public abstract void add(Componente componente) throws UnsupportedOperationException;
	
	public abstract String dibujar (boolean upperCase);
	
	public abstract boolean isEscrito ();

}
