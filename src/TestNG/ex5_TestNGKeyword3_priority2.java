package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex5_TestNGKeyword3_priority2
{
	@Test                    //by default priority = 0
	public void TC3()
	{
		Reporter.log("--running TC3-",true);  
	}
	
	@Test(priority = 2)       //duplicate priority=2
	public void TC1()
	{
		Reporter.log("--running TC1-",true);  
	}
	
	@Test(priority = 2)		 //duplicate priority=2
	public void TC2()
	{
		Reporter.log("--running TC2-",true);  
	}
	
	@Test(priority = -2)
	public void TC4()
	{
		Reporter.log("--running TC4-",true);  
	}
	
}
