class StringHandling{
	public static void main(String args[])
	{
		String str1 = "Java";
		String str2 = "Programming";
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2);
		System.out.println("Length of String 1 : " + str1.length());
		System.out.println("Uppercase : " + str1.toUpperCase());
		System.out.println("Lowercase : " + str2.toLowerCase());
		System.out.println("Character at index 2 of String 1 : " + str1.charAt(2));
		System.out.println("Substring : " + str2.substring(0, 7));
		System.out.println("Are strings equal? " + str1.equals(str2));
		System.out.println("Concatenated String : " + str1.concat(" " + str2));
	}
}
