import java.io.*;
public class FileIODemo
{
	public static void main(String args[])
	{
		try
		{
			File file = new File("student.txt");
			FileWriter writer = new FileWriter(file);
			writer.write("Welcome to Java File Handling\n");
			writer.write("Student Name : Merry\n");
			writer.write("Department : CSE");
			writer.close();
			System.out.println("Data written successfully.\n");
			FileReader reader = new FileReader(file);
			int ch;
			System.out.println("File Contents:");
			while ((ch = reader.read()) != -1)
			{
				System.out.print((char) ch);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}