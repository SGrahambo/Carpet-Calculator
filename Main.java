import java.util.Scanner;


//*	
	//Name: Stephen Graham
	//CptS 233: MicroAssignment #1
	//Date: 8/29/20
	//git rep url: https://github.com/SGrahambo/Carpet-Calculator.git
	//*


public class Main {
	
	
	
	public static void main(String[] args)
	{
		RoomDimension dim = new RoomDimension();
		RoomCarpet carp = new RoomCarpet(dim);
	
		System.out.println("Please enter the width of the area to be carpeted and hit enter.");
		dim.setWidth();
		System.out.println("Please enter the length of the area to be carpeted and hit enter.");
		dim.setLength();
		
		int getWidth = dim.getWidth();
		int getLength = dim.getLength();
		double getArea = dim.getArea();
		
		System.out.println("The area of your " + getWidth + "ft by " + getLength + "ft room is " + getArea + "sq.ft.");
		System.out.println("Please enter the price per sq.ft of the carpet and press enter.");
		System.out.print("$");
		carp.setPrice();
		
		
		
		double getTotal = carp.getTotal();
		
		// System.out.printf("Total is: $%,.2f%n", dblTotal);
		System.out.printf("The total price to carpet the area is: $%,.2f%n", getTotal);
		
		
		
		
	}
}