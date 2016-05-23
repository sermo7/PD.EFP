package es.upm.miw.pd.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private final Map<Character, Caracter> map; 

	private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();
	
	private FactoriaCaracter(){
		map = new HashMap<Character, Caracter>();
	}
	
    public Caracter get(char key) {
        if (map.containsKey(key)) {
            return map.get(key);
        } else {
            // Construcción perezosa
            Caracter c = new Caracter(key);
            map.put(key, c);
            return c;
        }
    }
    
    public static FactoriaCaracter getFactoria() {
    	return factoriaCaracter;
    }
	
}
