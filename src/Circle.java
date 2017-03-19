
public class Circle extends Shape{
	private MyPoint p1;
	private double radius;
	
	Circle() {
		p1 = new MyPoint(0,0);
		radius = 1;
	}
	
	Circle(MyPoint p1, double radius){
		this.p1 = p1;
		this.radius = radius;
	}
	
	Circle(double x, double y, double radius){
		this.radius = radius;
		this.p1 = new MyPoint(x,y);
	}
	
	@Override
	public double getArea() {
		return Math.PI* Math.pow(radius,2); 
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
