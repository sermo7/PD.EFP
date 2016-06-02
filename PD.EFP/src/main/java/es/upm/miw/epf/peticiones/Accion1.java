package es.upm.miw.epf.peticiones;

public class Accion1 implements Comando {

	private PeticionRed peticionRed;
	
	public Accion1(PeticionRed peticionRed){
		this.peticionRed = peticionRed;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Accion1";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		peticionRed.red1();
	}

}
