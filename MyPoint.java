package shapes;
public class MyPoint {
	private double x;
	private double y;
	
	MyPoint(){
		this.x = 0;
		this.y = 0;
	}
	
	MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public double distance(MyPoint p2){
		return distance(this, p2);
	}
	
	public double distance(MyPoint p1, MyPoint p2){
		return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y)
		        * (p1.y - p2.y));
	}
	
}
