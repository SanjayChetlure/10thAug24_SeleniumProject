package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
//Test class
public class ex7_Verification1_AssertClass2
{
	@Test               
	public void m2_assertNotEquals()
	{
		String actResult="hi";
		String expResult="hi";
		
		Assert.assertNotEquals(actResult, expResult,"Failed: both Results are same - ");
	}
}
