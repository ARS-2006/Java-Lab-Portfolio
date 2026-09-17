class Employee
{
	int id;
	String name;
	static String company = "ABC Technologies"; 
	Employee(int i, String n)
	{
		id = i;
		name = n;
	}
	static void displayCompany()
	{
		System.out.println("Company : " + company);
	}
	void display()
	{
		System.out.println("ID : " +id);
		System.out.println("Name : " + name);
	}
	public static void main(String args[])
	{
		Employee.displayCompany();
		Employee e1 = new Employee(101, "John");
		Employee e2 = new Employee(102,"Mary");
		e1.display();
		e2.display();
	}
}