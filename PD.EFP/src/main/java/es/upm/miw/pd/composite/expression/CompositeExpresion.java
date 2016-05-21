package es.upm.miw.pd.composite.expression;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class CompositeExpresion extends Expresion {

	private ArrayList<Expresion> expresiones = new ArrayList<Expresion>(numExp);
	
	public CompositeExpresion(Expresion exp1, Expresion exp2){
		expresiones.add(exp1);
		expresiones.add(exp2);
	}
	
	public ArrayList<Expresion> getExpresiones(){
		return expresiones;
	}
	
	
	public String cadena(String operator) {
		// TODO Auto-generated method stub
		 Iterator<Expresion> ite = expresiones.iterator();
	        String expresion="(";
	        while (ite.hasNext()) {
	            Expresion exp = ite.next();
	            expresion += exp.toString();
	            if (ite.hasNext())
	                expresion+=operator;
	        }
	        expresion += ")";
	        return expresion;
	}
	
	public Expresion getNodo(int pos){
		return expresiones.get(pos);
	}

}
