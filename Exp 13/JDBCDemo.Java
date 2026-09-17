import java.sql.*;
public class JDBCDemo 
{
	public static void main(String[] args)
	{ 
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","password");
			Statement stmt = con.createStatement();
			String insertQuery ="INSERT INTO student VALUES(101,'Merry','CSE')";
			stmt.executeUpdate(insertQuery);
			System.out.println("Record Inserted Successfully.");
			ResultSet rs = stmt.executeQuery("SELECT * FROM student"); 
			System.out.println("\nStudent Details");
			while(rs.next()) 
			{
				System.out.println(rs.getInt("id") + " "+ rs.getString("name") + " "+ rs.getString("department"));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}