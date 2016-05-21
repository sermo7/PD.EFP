package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSides extends Visitor {

	
	private double numberOfSides = 0.0;
	
	private int numCircles=0;
	private int numSquares=0;
	private int numTriangles=0;
	
	
	@Override
	public void visit(Circle circle) {
		// TODO Auto-generated method stub
		numberOfSides += circle.numberOfSides();
		numCircles++;
	}

	@Override
	public void visit(Square square) {
		// TODO Auto-generated method stub
		numberOfSides += square.numberOfSides();
		numSquares++;
	}

	@Override
	public void visit(Triangle triangle) {
		// TODO Auto-generated method stub
		numberOfSides += triangle.numberOfSides();
		numTriangles++;
	}
	
	public double getNumberOfSides(){
		return numberOfSides;
	}

	public int getNumCirclesVisitedByNumberOfSides(){
		return numCircles;
	}
	
	public int getNumSquaresVisitedByNumberOfSides(){
		return numSquares;
	}
	
	public int getNumTrianglesVisitedByNumberOfSides(){
		return numTriangles;
	}
	
	
}
