package MethodWithReturnType;
public class Sample1 
{
	public static void main(String[] args) 
	{		
		int num2 = add(10, 20);    //30
		System.out.println(num2);
				
		System.out.println(add(5, 6));
				
		System.out.println("-----------------------");
			
		Sample1 s1=new Sample1();
		int num3 = s1.mult(10, 20);
		System.out.println(num3);
		
		System.out.println(s1.mult(5, 6));	
	}
	
	public static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int mult(int c, int d) 
	{
		int mult=c*d;
		return mult;
	}
}
