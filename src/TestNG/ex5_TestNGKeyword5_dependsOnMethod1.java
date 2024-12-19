package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex5_TestNGKeyword5_dependsOnMethod1
{
	@Test               
	public void login()
	{
		Reporter.log("--running login TC-",true);
	}
	
	@Test(dependsOnMethods = {"login"} )              
	public void logout()
	{
		Reporter.log("--running logout TC-",true);  
	}
	
}
