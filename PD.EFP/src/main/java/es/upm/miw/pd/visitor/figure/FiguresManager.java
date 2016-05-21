package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<>();
        figures.add(new Circle("c1", 1));
        figures.add(new Square("s1", 1));
        figures.add(new Triangle("t1", 1, 1));
        figures.add(new Circle("c2", 2));
        figures.add(new Square("s2", 2));
        figures.add(new Triangle("t2", 1, 2));
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
        /*double result = 0;
        for (Figure figure : figures) {
            result += figure.area();
        }
        return result;*/
    	VisitorArea area = new VisitorArea();
        for (Figure figure : figures) {
            figure.accept(area);
        }
        System.out.println("Number of circles visited by area: "+area.getNumCirclesVisitedByArea());
        System.out.println("Number of squares visited by area: "+area.getNumSquaresVisitedByArea());
        System.out.println("Number of triangles visited by area: "+area.getNumTrianglesVisitedByArea());
        return area.getArea();
    	
    }

    public double totalNumberOfSides() {
        /*double result = 0;
        for (Figure figure : figures) {
            result += figure.numberOfSides();
        }
        return result;*/
    	VisitorNumberOfSides numberOfSides = new VisitorNumberOfSides();
        for (Figure figure : figures) {
            figure.accept(numberOfSides);
        }
        System.out.println("Number of circles visited by NOS: "+numberOfSides.getNumCirclesVisitedByNumberOfSides());
        System.out.println("Number of squares visited by NOS: "+numberOfSides.getNumSquaresVisitedByNumberOfSides());
        System.out.println("Number of triangles visited by NOS: "+numberOfSides.getNumTrianglesVisitedByNumberOfSides());
        return numberOfSides.getNumberOfSides();

    }

    
    public static void main(String[] args) {
    	System.out.println("The total area is: "+new FiguresManager().totalArea());
    	System.out.println("The total number of sides are: "+new FiguresManager().totalNumberOfSides());
        
    }
    
}
