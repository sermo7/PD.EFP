package es.upm.miw.epf.peticiones;

import upm.jbb.IO;

public class MainComando {

	private Invoker invocador;

    public MainComando() {
        PeticionRed peticionRed = new PeticionRed();
        PeticionLocal peticionLocal = new PeticionLocal();
        this.invocador= new Invoker();
        this.invocador.add(new Accion1(peticionRed));
        this.invocador.add(new Accion2(peticionRed));
        this.invocador.add(new Accion3(peticionRed));
        this.invocador.add(new Accion4(peticionLocal));
        this.invocador.add(new Accion5(peticionLocal));
    }

    public void invocador() {
        String llave = (String) IO.getIO().select(this.invocador.keys());
        this.invocador.execute(llave);
    }

    public static void main(String[] args) {
    	IO.getIO().addView(new MainComando());
    }

}
