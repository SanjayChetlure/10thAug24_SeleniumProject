package TestNG;
import org.testng.Assert;
import org.testng.annotations.Test;
//Test class
public class ex7_Verification1_AssertClass1
{
	
	@Test               
	public void m1_assertEquals()
	{
		String actResult="hi";
		String expResult="hi";
		
		Assert.assertEquals(actResult, expResult,"Failed: both results are diff - ");
	}
	
	
//	@Test               
//	public void TC1()
//	{
//		String actResult="hi";
//		String expResult="hi";
//		
//		if (actResult.equals(expResult)) 
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("Fail");
//		}
//	}
	

	
}
