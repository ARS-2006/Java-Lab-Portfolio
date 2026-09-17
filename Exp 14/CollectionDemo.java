import java.util.*;
public class CollectionDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> subjects = new ArrayList<>();
		subjects.add("Java");
		subjects.add("Python"); subjects.add("C++");
		System.out.println("ArrayListElements:");
		for(String subject : subjects) 
		{
			System.out.println(subject);
		}
		HashMap<Integer, String> students = new HashMap<>();
		students.put(101, "John");
		students.put(102, "Mary");
		students.put(103, "David");
		System.out.println("\nHashMap Elements:");
		for(Map.Entry<Integer, String> entry : students.entrySet()) 
		{
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}