package shapes;

public class Rectangle2D extends Shape{
	private MyPoint p1, p2, p3, p4;
        private double area;
        private double perimeter;
        private static double length;
        private static double width;

        Rectangle2D(){
        }

        Rectangle2D(MyPoint p1, MyPoint p2, MyPoint p3, MyPoint p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        }

        @Override
        public double getArea(){
        length = p1.distance(p2);
        width = p2.distance(p3);
        
        return length * width; 
        } 
	
        @Override
        public double getPerimeter(){
        
        return 2 * (length + width); 
        }
	
}
