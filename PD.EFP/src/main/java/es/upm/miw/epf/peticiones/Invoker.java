package es.upm.miw.epf.peticiones;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
    private Map<String, Comando> orders;

    public Invoker() {
        this.orders = new HashMap<>();
    }

    public void add(Comando orden) {
        this.orders.put(orden.name(), orden);
    }

    public void execute(String key) {
        this.orders.get(key).execute();
    }

    public String[] keys() {
        return this.orders.keySet().toArray(new String[0]);
    }
}
