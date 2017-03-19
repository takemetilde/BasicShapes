
import java.util.InputMismatchException; 
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Test Begin:"+System.lineSeparator());
		System.out.println("Select which shape to add to the database from the list below:"+System.lineSeparator()+
				"1: Circle" + System.lineSeparator() +
				"2: Triangle" + System.lineSeparator() + 
				"0: Exit"+ System.lineSeparator());
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		
		switch (selection){
		
		case 1:
			
			double radius;
			double xVar;
			double yVar;
			
			try{ 
				System.out.println("Note: Please only enter numerical values.");
				System.out.println("Enter radius:");
				radius = input.nextDouble();			
				System.out.println("Enter coordinates:");
				System.out.println("x-coordinate: ");
				xVar = input.nextDouble();
				System.out.println("y-coordinate: ");
				yVar = input.nextDouble();
				Circle circle = new Circle(xVar, yVar, radius);
				System.out.println("Area: ");
				shapeArea(circle);
				System.out.println("Perimeter: ");
				shapePerimeter(circle);
				System.out.println("Coordinates: (" + circle.getP1().getX() + ", " + circle.getP1().getY() + ")");
			}
			catch (InputMismatchException exp) {
				System.out.println("Your input was not valid. Program terminated.");
			}
			break;
			
		case 2:
			System.out.println("Currently only the circle option is implemented.");
			break;
			
		case 0:
			System.exit(1);
			
		default:
			System.out.println("Error: invalid option" + System.lineSeparator());
			System.out.println("Restart program.");
			System.exit(1);
		}
		
	
	}
	
	static void shapeArea(Shape shape){
		shape.getArea();
	}
	
	static void shapePerimeter(Shape shape){
		shape.getPerimeter();
	}
}

