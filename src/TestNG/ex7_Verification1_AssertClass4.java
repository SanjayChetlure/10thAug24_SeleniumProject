package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
//Test class
public class ex7_Verification1_AssertClass4
{
	@Test               
	public void m4_assertFalse()
	{
		boolean actResult=true;
		
		Assert.assertFalse(actResult,"Failed: act Result is True - ");
	}
}
