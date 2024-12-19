package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
//Test class
public class ex7_Verification1_AssertClass5
{
	@Test               
	public void m5_limitationOfAssertClass()
	{
		String actResult="hi";
		String expResult="hello";
		Assert.assertEquals(actResult, expResult,"Failed1: both results are diff - ");
		
		
		boolean actResult1=false;
		Assert.assertTrue(actResult1,"Failed2: act result is false - ");
	}
}
