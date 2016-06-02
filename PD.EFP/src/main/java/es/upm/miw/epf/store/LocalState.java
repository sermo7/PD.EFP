package es.upm.miw.epf.store;

public class LocalState implements State {

	private Local local;
	
	public LocalState(){
		local = new Local();
	}
	
	@Override
	public void write(Store instance, String key, String value) {
		// TODO Auto-generated method stub
		if (instance.getNet().isAvailable()){
			instance.setState(new NetState(instance.getNet()));
			instance.write(key, value);
		}
		else{
			local.keep(key, value);
		}
	}

	@Override
	public String read(Store instance, String key) {
		// TODO Auto-generated method stub
		if (instance.getNet().isAvailable()){
			instance.setState(new NetState(instance.getNet()));
			return instance.read(key);
		}
		else{
			return local.find(key);
		}
	}


}
