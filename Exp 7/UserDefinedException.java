class InvalidAgeException extends Exception
{
	InvalidAgeException(String message)
	{
		super(message);
	}
}
public class UserDefinedException
{
	static void validateAge(int age) throws InvalidAgeException
	{
		if (age < 18)
		{
			throw new InvalidAgeException("Not Eligible to Vote");
		}
		else
		{
			System.out.println("Eligible to Vote");
		}
	}
	public static void main(String args[])
	{
		try
		{
		validateAge(16);
		}
		catch (InvalidAgeException e) 
		{
		System.out.println(e.getMessage());
		}
	}
}