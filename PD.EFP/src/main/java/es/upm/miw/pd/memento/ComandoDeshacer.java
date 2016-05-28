package es.upm.miw.pd.memento;

import upm.jbb.IO;

public class ComandoDeshacer extends ComandoAbstract {
    
	public ComandoDeshacer(Calculator calculator, GestorMementos gestorM) {
        super(calculator);
        this.setGestorMementos(gestorM);
    }
    
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Deshacer";
	}

    @Override
    public void execute() {
		// TODO Auto-generated method stub
        MementoCalculadora memento = this.getGestorMementos().getMemento(IO.getIO().readString("Introducir punto deseado restauración"));
        super.getCalculadora().setTotal(memento.getTotal());
    }


}
