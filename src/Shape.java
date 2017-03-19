

public abstract class Shape {
	
	private String type;
	
	abstract double getArea();
	abstract double getPerimeter();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
