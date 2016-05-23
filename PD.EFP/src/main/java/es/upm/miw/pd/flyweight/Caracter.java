package es.upm.miw.pd.flyweight;

public class Caracter extends Componente {
    
	private char intrinsic;

    public char getCaracter() {
        return this.intrinsic;
    }


	public Caracter(char intrinsic) {
		// TODO Auto-generated constructor stub
		this.intrinsic = intrinsic;
	}

	@Override
	public void add(Componente componente) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(boolean upperCase) {
		// TODO Auto-generated method stub
		if (upperCase){
			return this.toString().toUpperCase();
		}
		else
			return this.toString();
	}
	
	@Override
	public String toString(){
		return Character.toString(intrinsic);
	}


	@Override
	public boolean isEscrito() {
		// TODO Auto-generated method stub
		return false;
	}

}
