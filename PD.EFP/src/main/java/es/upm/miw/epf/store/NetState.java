package es.upm.miw.epf.store;

public class NetState implements State {

	private Net net;
	
	public NetState(Net net){
		this.net = net;
	}
	
	@Override
	public void write(Store instance, String key, String value) {
		// TODO Auto-generated method stub
		if (net.isAvailable()){
			net.write(key, value);
		}
		else{
			instance.setState(new LocalState());
			instance.write(key, value);
		}	
	}

	@Override
	public String read(Store instance, String key) {
		// TODO Auto-generated method stub
		if (net.isAvailable()){
			return net.read(key);
		}
		else{
			instance.setState(new LocalState());
			return instance.read(key);			
		}
	}
}
