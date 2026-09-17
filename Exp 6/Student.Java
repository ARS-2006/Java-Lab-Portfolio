class Student
{
	public String college = "Loyola";
	private int age = 20;
	protected String department = "CSE";
	String name = "Merry";
	void display()
	{
		System.out.println("College : " + college);
		System.out.println("Age : " + age);
		System.out.println("Department : " + department);
		System.out.println("Name : " + name);
	}
	public static void main(String args[])
	{
		Student s = new Student();
		s.display();
	}
}
