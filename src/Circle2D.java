package shapes;
public class Circle2D extends Shape{
	private MyPoint p1;
	private double radius;
	
	Circle2D() {
		p1 = new MyPoint(0,0);
		radius = 1;
	}
	
	Circle2D(MyPoint p1, double radius){
		this.p1 = p1;
		this.radius = radius;
	}
	
	Circle2D(double x, double y, double radius){
		this.radius = radius;
		this.p1 = new MyPoint(x,y);
	}
	
	@Override
	public double getArea() {
		return Math.pow(radius * Math.PI,2); 
	}
	
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	
}
