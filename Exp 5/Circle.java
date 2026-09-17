interface Shape
{
	void area();
}
class Circle implements Shape
{ 
	public void area()
	{
		double radius = 5;
		double area = 3.14 * radius * radius;
		System.out.println("Area = " + area);
	}
	public static void main(String args[])
	{
		Circle c = new Circle();
		c.area();
	}
}