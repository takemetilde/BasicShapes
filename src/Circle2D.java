
public class Circle2D extends Shape{
	private MyPoint p1;
	private double radius;
	
	Circle2D() {
		p1 = new MyPoint(0,0);
		radius = 1;
		super.setName("No Name");
		super.setType("Circle");
	}
	
	Circle2D(MyPoint p1, double radius, String name){
		this.p1 = p1;
		this.radius = radius;
		super.setName(name);
		super.setType("Circle");
	}
	
	Circle2D(double x, double y, double radius, String name){
		this.radius = radius;
		this.p1 = new MyPoint(x,y);
		super.setName(name);
		super.setType("Circle");
	}
	
	@Override
	public double getArea() {
		return Math.pow(radius * Math.PI,2); 
	}
	
	@Override
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}
	
}
