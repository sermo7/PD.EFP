package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {

	public abstract void visit(Circle circle);
	public abstract void visit(Square square);
	public abstract void visit(Triangle triangle);
	
}
