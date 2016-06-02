package es.upm.miw.epf.peticiones;

public class Accion3 implements Comando {

	private PeticionRed peticionRed;
	
	public Accion3(PeticionRed peticionRed){
		this.peticionRed = peticionRed;
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Accion3";
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		peticionRed.red3();
	}
	
	
}
