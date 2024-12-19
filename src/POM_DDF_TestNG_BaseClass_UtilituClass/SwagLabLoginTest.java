package POM_DDF_TestNG_BaseClass_UtilituClass;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_With_DDF.SwagLabsHomePage;
import POM_With_DDF.SwagLabsLoginPage;
import POM_With_DDF.SwagLabsOpenMenuPage;
public class SwagLabLoginTest extends BaseClass
{
	SwagLabsLoginPage login;
	SwagLabsHomePage home;
	SwagLabsOpenMenuPage openMenu;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		initializeBrowser();
		
		login=new SwagLabsLoginPage(driver);
		home=new SwagLabsHomePage(driver);
		openMenu=new SwagLabsOpenMenuPage(driver);
	}
	
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.inpSwagLabsLoginPageUsername(UtilityClass.getTD(0, 0));
		login.inpSwagLabsLoginPagePaswword(UtilityClass.getTD(0, 1));
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogoText() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		String actLogoText = home.getSwagLabsHomePageLogoText();
		String expLoloText = UtilityClass.getTD(0, 2);
		
		Assert.assertEquals(actLogoText, expLoloText,"Failed-both results are diff");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logoutFromApp() throws InterruptedException
	{
		home.clickSwagLabsHomePageOpenMenuBtn();
		Thread.sleep(2000);
		openMenu.clickSwagLabsOpenMenuPageLogout();
		Thread.sleep(2000);
	}
		
	@AfterClass
	public void closeBrowser() 
	{
		driver.quit();
	}
}
