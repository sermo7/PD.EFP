package es.upm.miw.epf.store;

public class MainStore {

	
	public static void main(String[] args){
		
		Store instance1 = Store.getInstance();
		Store instance2 = Store.getInstance();
		Store instance3 = Store.getInstance();
		
		instance1.write("key1", "value1");
		instance2.write("key2", "value2");
		instance3.write("key3", "value3");
		instance2.read("key2");
		instance3.read("key3");
		
	}
}
