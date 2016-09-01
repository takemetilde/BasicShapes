package shapes;

public abstract class Shape {
	private double area;
	private double perimeter;
	private int numOfSides;
	
	Shape(){
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	public double getNumOfSides() {
		return numOfSides;
	}

}
