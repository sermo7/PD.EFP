package es.upm.miw.epf.peticiones;

public class Accion4 implements Comando {
	
	private PeticionLocal peticionLocal;
	
	public Accion4(PeticionLocal peticionLocal){
		this.peticionLocal = peticionLocal;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Accion4";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		peticionLocal.local1();
	}
	
	

}
