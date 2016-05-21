package es.upm.miw.pd.composite.expression;

import java.util.ArrayList;

public class Restar extends CompositeExpresion {

	public Restar(Expresion exp1, Expresion exp2) {
		super(exp1, exp2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int operar() {
		// TODO Auto-generated method stub
		ArrayList<Expresion> expresiones = getExpresiones();
		int pos=0;
		int resultado = expresiones.get(pos).operar();
		pos++;
        while (pos < expresiones.size()) {
            resultado -= expresiones.get(pos).operar();
            pos++;
        }
        return resultado;
	}
	
	@Override
	public String toString() {
		return cadena("-");
	}

}
