package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex10_Grouping2
{
	@Test(groups = {"login"})
	public void TC6()
	{
		Reporter.log("--running TC6-",true);  
	}
	
	@Test(groups = {"login"})
	public void TC7()
	{
		Reporter.log("--running TC7-",true);
	}
	
	@Test(groups = {"payment"})
	public void TC8()
	{
		Reporter.log("--running TC8-",true);  
	}
	
	@Test(groups = {"payment"})
	public void TC9()
	{
		Reporter.log("--running TC9-",true);
	}
	
	@Test(groups = {"profile"})
	public void TC10()
	{
		Reporter.log("--running TC10-",true);  
	}
}
