package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
//Test class
public class ex7_Verification1_AssertClass3
{
	@Test               
	public void m3_assertTrue()
	{
		boolean actResult=false;
		
		Assert.assertTrue(actResult,"Failed: act result is false - ");
	}
}
