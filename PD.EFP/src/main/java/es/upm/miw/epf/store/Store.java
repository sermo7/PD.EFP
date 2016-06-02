package es.upm.miw.epf.store;

public class Store {

    //TODO a fata de implementar
	private static Store instance = new Store();
	
	private State state;
	private Net net;
	
	private Store(){
		net = new Net();
		state = new NetState(net); //del estado inicial pasa a la red
	}
	
	public static Store getInstance(){
		return instance;
	}
	
    // Se almacena un objeto
    public void write(String key, String value) {
        //TODO a falta de implementar
    	state.write(this, key, value);
    }

    // Se lee un objeto
    public String read(String key) {
        //TODO a falta de implementar
        return state.read(this, key);
    }
    
    public void setState(State state){
    	this.state= state;
    }
    
    public Net getNet(){
    	return net;
    }

}