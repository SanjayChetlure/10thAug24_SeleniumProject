package Setup;

public class Demo implements Demo2
{
	public void m1()
	{
		System.out.println("Method m1 from demo1(I) completed in Demo(IC)");
	}

	public void m2() 
	{
		System.out.println("Method m2 from demo2(I) completed in Demo(IC)");
	}
	
	public void m3() 
	{
		System.out.println("Method m3 from Demo(IC)");
	}

}
