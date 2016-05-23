package es.upm.miw.pd.flyweight;

public class Texto extends Escrito {

	private String texto;
	
	private static String separacion = "---o---\n";
	
	public Texto(){
		super();
	}
	
	@Override
	public void delete(Componente componente) {
		// TODO Auto-generated method stub
		if (componente.isEscrito()){
			this.getEscrito().remove(componente);
		}
	}
	
	@Override
	public String dibujar(boolean upperCase) {
		// TODO Auto-generated method stub
		this.texto="";
		for (Componente componente : getEscrito()){
			this.texto += componente.dibujar(upperCase);
		}
		return this.texto+separacion;
	}
	
	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		if (componente.isEscrito()){
			this.getEscrito().add(componente);
		}
		else{
			throw new UnsupportedOperationException("Acción no permitida");
		}
	}

	@Override
	public boolean isEscrito() {
		// TODO Auto-generated method stub
		return true;
	}

}
