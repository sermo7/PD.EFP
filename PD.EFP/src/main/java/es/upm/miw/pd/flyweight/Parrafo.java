package es.upm.miw.pd.flyweight;

public class Parrafo extends Escrito {

	private String parrafo;
	
	private static String separacion = "\n";
	
	public Parrafo(){
		super();
	}
	
	@Override
	public void delete(Componente componente) {
		// TODO Auto-generated method stub
		if (!componente.isEscrito()){
			this.getEscrito().remove(componente);
		}
	}
	
	@Override
	public String dibujar(boolean upperCase) {
		// TODO Auto-generated method stub
		this.parrafo="";
		for (Componente componente : getEscrito()){
			this.parrafo += componente.dibujar(upperCase);
		}
		return this.parrafo+separacion;
	}
	
	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		if (!componente.isEscrito()){
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
