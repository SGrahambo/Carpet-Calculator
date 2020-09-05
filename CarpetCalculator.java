import java.util.Scanner;



class RoomDimension{
	
	Scanner readme = new Scanner(System.in);
	
	public int width, length, area;

	//Class constructor for RoomDimension
	
	public void RoomDimension()
	{
		
	}
	
	public void setWidth()
	{
		width = readme.nextInt();			
	}
	
	public void setLength()
	{
		length = readme.nextInt();	
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getLength()
	{
		return length;
	}

	public double getArea() {
		
		area = length * width;
		return area;
		
	}

}


class RoomCarpet {
	RoomDimension dim = new RoomDimension();
	Scanner readme = new Scanner(System.in);
	
	public double price;
	public double totalPrice;
	
	public void setPrice()
	{
		price = readme.nextDouble();
	}
	
	public double getTotal()
	{
		double getArea = dim.getArea();
		totalPrice = price * getArea;
		return totalPrice;
	}
	
	
}