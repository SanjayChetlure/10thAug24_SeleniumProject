package TestNG;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
//Test class
public class ex9_Sample2
{
	@Test
	public void TC4()
	{
		Reporter.log("--running TC4-",true);  
	}
	
	@Test
	public void TC5()
	{
		String actResult="Hi";
		String expResult="Hello";
		Assert.assertEquals(actResult, expResult,"Failed both results are diff");
		Reporter.log("--running TC5-",true);  
	}
	
	@Test
	public void TC6()
	{
		Reporter.log("--running TC6-",true);  
	}
}
