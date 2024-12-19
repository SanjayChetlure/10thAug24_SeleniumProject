package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex10_Grouping1
{
	@Test(groups = {"login"})
	public void TC1()
	{
		Reporter.log("--running TC1-",true);  
	}
	
	@Test(groups = {"login"})
	public void TC2()
	{
		Reporter.log("--running TC2-",true);
	}
	
	@Test(groups = {"payment"})
	public void TC3()
	{
		Reporter.log("--running TC3-",true);  
	}
	
	@Test(groups = {"payment"})
	public void TC4()
	{
		Reporter.log("--running TC4-",true);
	}
	
	@Test(groups = {"profile"})
	public void TC5()
	{
		Reporter.log("--running TC5-",true);  
	}
}
