package es.upm.miw.pd.memento;

import upm.jbb.IO;

public class ComandoGuardar extends ComandoAbstract {

    public ComandoGuardar(Calculator calculator, GestorMementos gestorMementos) {
    	// TODO Auto-generated constructor stub
    	super(calculator);
    	this.setGestorMementos(gestorMementos);
    }
    
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Guardar";
	}

    @Override
    public void execute() {
    	// TODO Auto-generated method stub
        this.getGestorMementos().addMemento(IO.getIO().readString("Introducir valor para identificar estado guardado"), new MementoCalculadora(super.getCalculadora().getTotal()));
    }

}
