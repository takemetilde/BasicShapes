
import java.awt.geom.*;
public class Triangle2D extends Shape{
	private MyPoint p1, p2, p3;
	private double area;
	private double perimeter;
	private double s0, s1, s2, s3;

	Triangle2D(){
		p1 = new MyPoint(0,0);
		p2 = new MyPoint(1,2);
		p3 = new MyPoint(3,4);
	}
	
	Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	Triangle2D(double x1, double y1, double x2, double y2, double x3, double y3){
		this.p1 = new MyPoint(x1,y1);
		this.p2 = new MyPoint(x2,y2);
		this.p3 = new MyPoint(x3,y3);
	}
	
	@Override
	public double getArea(){
		s1 = p1.distance(p2);
		s2 = p2.distance(p3);
		s3 = p3.distance(p1);
		s0 = (s1+s2+s3)/2;
		area =  Math.sqrt(s0*(s0-s1)*(s0-s2)*(s0-s3));
		
		return area;
	}
	
	@Override
	public double getPerimeter(){
		s1 = p1.distance(p2);
		s2 = p2.distance(p3);
		s3 = p3.distance(p1);
		perimeter = s1+s2+s3;
		
		return perimeter;
	}
	
	public MyPoint getP1() {
		return p1;
	}

	public void setP1(MyPoint p1) {
		this.p1 = p1;
	}

	public MyPoint getP2() {
		return p2;
	}

	public void setP2(MyPoint p2) {
		this.p2 = p2;
	}

	public MyPoint getP3() {
		return p3;
	}

	public void setP3(MyPoint p3) {
		this.p3 = p3;
	}

	
	
}
