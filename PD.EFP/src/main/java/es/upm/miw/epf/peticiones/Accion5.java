package es.upm.miw.epf.peticiones;

public class Accion5 implements Comando {

	private PeticionLocal peticionLocal;
	
	public Accion5(PeticionLocal peticionLocal){
		this.peticionLocal = peticionLocal;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Accion5";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		peticionLocal.local2();
	}
	
	
}
