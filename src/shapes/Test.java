package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;

public class Test {
	
	public static void main(String[] args) {
		pln("Test Begin:"+System.lineSeparator());
		pln("Select which shape to add to the database from the list below:"+System.lineSeparator()+
				"1: Circle" + System.lineSeparator() +
				"2: Rectangle" + System.lineSeparator() +
				"3: Triangle" + System.lineSeparator() + 
				"0: Exit"+ System.lineSeparator());
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int selection = input.nextInt();
		String name = "";
		
		pln("Please enter name:");
		name = input.next();
		
		switch (selection){
		case 1:
			try{ 
				pln("Note: Please only enter numerical values.");
				pln("Enter radius:");
				double radius = input.nextDouble();			
				pln("Enter coordinates:");
				pln("x-coordinate: ");
				double xVar = input.nextDouble();
				pln("y-coordinate: ");
				double yVar = input.nextDouble();
				Circle2D circle = new Circle2D(xVar, yVar, radius, name);
				pln("Type: " + circle.getType());			
				pln("Name: " + circle.getName());
				pln("Area: " + circle.getArea());
				pln("Perimeter: " + circle.getPerimeter());
				pln("Coordinates: (" + circle.getP1().getX() + ", " + circle.getP1().getY() + ")");
			}
			catch (InputMismatchException exp) {
				pln("Your input was not valid. Program terminated.");
			}
			break;
		case 2:
			pln("Currently only the circle option is implemented.");
			break;
		case 3:
			pln("Currently only the circle option is implemented.");
			break;
		case 0:
			System.exit(1);
		default: 
			pln("Error: invalid option" + System.lineSeparator());
			pln("Restart program.");
			System.exit(1);
		}
		
		
	}

	static void pln(Object obj){
		System.out.println(obj);
	}
}

