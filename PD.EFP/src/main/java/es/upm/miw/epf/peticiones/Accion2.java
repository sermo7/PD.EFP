package es.upm.miw.epf.peticiones;

public class Accion2 implements Comando {

	private PeticionRed peticionRed;
	
	public Accion2(PeticionRed peticionRed){
		this.peticionRed = peticionRed;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Accion2";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		peticionRed.red2();
	}
	
}
