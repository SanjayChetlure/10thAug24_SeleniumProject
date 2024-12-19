package POM_DDF_TestNG;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class SwagLabLoginTest 
{
	int a;      //declare globally
	SwagLabsLoginPage login;
	SwagLabsHomePage home;
	SwagLabsOpenMenuPage openMenu;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		login=new SwagLabsLoginPage(driver);
		home=new SwagLabsHomePage(driver);
		openMenu=new SwagLabsOpenMenuPage(driver);
		a=10;          //initialize locally
	}
	
	
	@BeforeMethod
	public void loginToApp() throws InterruptedException
	{
		System.out.println(a);
		login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabsLoginPagePaswword(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(2000);
	}
	
	@Test
	public void verifyLogoText() throws InterruptedException 
	{
		//home.verifySwagLabsHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actLogoText = home.getSwagLabsHomePageLogoText();
		String expLoloText = sh.getRow(0).getCell(2).getStringCellValue();
		
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
