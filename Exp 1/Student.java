class Student 
{ 
	String name; 
	int rollNo;
	Student(String n, int r)
	{ 
		name = n;
		rollNo = r;
	}
	void display()
	{ 
		System.out.println("Name : " +name);
		System.out.println("Roll No : " + rollNo);
	}
	public static void main(String args[]) 
	{ 
		Student s1 = new
		Student("Merry", 101);
		s1.display();
	}
}