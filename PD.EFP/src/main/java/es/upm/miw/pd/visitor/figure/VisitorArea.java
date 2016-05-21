package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor {

	private double area=0.0;
	private int numCircles=0;
	private int numSquares=0;
	private int numTriangles=0;
	

	
	@Override
	public void visit(Circle circle) {
		// TODO Auto-generated method stub
		area += circle.area();
		numCircles++;
	}

	@Override
	public void visit(Square square) {
		// TODO Auto-generated method stub
		area += square.area();
		numSquares++;
	}

	@Override
	public void visit(Triangle triangle) {
		// TODO Auto-generated method stub
		area += triangle.area();
		numTriangles++;
		
	}
	
	public double getArea(){
		return area;
	}
	
	public int getNumCirclesVisitedByArea(){
		return numCircles;
	}
	
	public int getNumSquaresVisitedByArea(){
		return numSquares;
	}
	
	public int getNumTrianglesVisitedByArea(){
		return numTriangles;
	}

	
	
	
}
