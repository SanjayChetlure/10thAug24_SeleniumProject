package TestNG;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//Test class
public class ex7_Verification2_SoftAssertClass1
{
	@Test               
	public void m1_AdvantageOfSoftAssertClass()
	{
		SoftAssert soft=new SoftAssert();
		
		String actResult="hi";
		String expResult="hello";
		soft.assertEquals(actResult, expResult,"Failed1: both results are diff - ");
		
		
		boolean actResult1=false;
		soft.assertTrue(actResult1,"Failed2: act result is false - ");
		
		soft.assertAll();
	}
}
