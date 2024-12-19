package MethodWithReturnType;

import net.bytebuddy.utility.RandomString;

public class Sample2 
{
	public static void main(String[] args) 
	{
		int num1 = add();
		System.out.println(num1);
		
		System.out.println(add());
		
		System.out.println("----------------");
		
		String s2 = convertNameToUpperCase("abc");
		System.out.println(s2);
		
		System.out.println(convertNameToUpperCase("xyz"));
		
		System.out.println("-----------------");
		
		int length1 = findLengthOfString("amol");
		System.out.println(length1);
		
		System.out.println(findLengthOfString("klcfbsadksadasf"));
		
		
		System.out.println("-----------------");
		
		String name1 = generateRandomName(7);
		System.out.println(name1);
		
		System.out.println(generateRandomName(4));		
	}
	
	public static int add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	//method with String return type
	public static String convertNameToUpperCase(String name)
	{
		String s1=name.toUpperCase();
		return s1;
	}
	
	//method with int return type
	public static int findLengthOfString(String name) 
	{
		int length = name.length();
		return length;
	}
	
	
	//method with int return type
	public static String generateRandomName(int length) 
	{
		String name = RandomString.make(length);   //diffclassName.methodname();
		return name;
	}
}
