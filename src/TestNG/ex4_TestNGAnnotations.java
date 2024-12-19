package TestNG;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//Test class
public class ex4_TestNGAnnotations
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("-------------Open Browser---------------",true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("--Login To App--",true);
	}
	
	@Test
	public void verifyLogo1()
	{
		Reporter.log("running verifyLogo1 TC",true);  
	}
	
	@Test
	public void verifyLogo2()
	{
		Reporter.log("running verifyLogo2 TC",true);  
	}
		
	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("--Logout from App--",true);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("--------------close Browser--------------",true);
	}
	
}
