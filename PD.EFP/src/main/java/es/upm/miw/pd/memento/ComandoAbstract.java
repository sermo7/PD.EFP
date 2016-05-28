package es.upm.miw.pd.memento;

public abstract class ComandoAbstract implements Comando {

    private Calculator calculator;
    
    private GestorMementos gestorMementos;

    public ComandoAbstract(Calculator calculator) {
        super();
        this.calculator = calculator;
    }

    public Calculator getCalculadora() {
        return calculator;
    }
    
    public GestorMementos getGestorMementos(){
    	return gestorMementos;
    }

    public void setGestorMementos(GestorMementos gm){
    	this.gestorMementos = gm;
    }
    
    
}
