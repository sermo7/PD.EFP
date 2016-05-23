package es.upm.miw.pd.flyweight;

import java.util.ArrayList;
import java.util.List;

public abstract class Escrito extends Componente {

	private List<Componente> escrito;
	
	public Escrito() {
		this.escrito = new ArrayList<Componente>();
	}
	
	@Override
	public String dibujar(boolean upperCase) {
		// TODO Auto-generated method stub
		return dibujar(upperCase);
	}
	
	public List<Componente> getEscrito(){
		return escrito;
	}
	
	public abstract void delete(Componente componente);
	

}
