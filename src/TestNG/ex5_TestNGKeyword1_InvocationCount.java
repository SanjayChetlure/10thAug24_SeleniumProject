package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex5_TestNGKeyword1_InvocationCount
{
	
	@Test(invocationCount = 10)
	public void verifyLogo()
	{
		Reporter.log("--running verifyLogo TC-",true);  
	}
	

	
}
