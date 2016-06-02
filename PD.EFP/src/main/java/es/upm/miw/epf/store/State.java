package es.upm.miw.epf.store;

public interface State {
	
	public abstract void write(Store instance, String key, String value);
	
	public abstract String read(Store instance, String key);

}
