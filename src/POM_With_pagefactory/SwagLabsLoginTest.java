package POM_With_pagefactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLoginTest 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		SwagLabsLoginPage login=new SwagLabsLoginPage(driver);   //basic/early initialization
		login.enterUN();										//late/lazy initialization
		login.enterPwd();
		login.clickOnLoginBtn();
		Thread.sleep(2000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(driver);
		home.verifyLogo();
		home.clickOnOpenMenuBtn();
		Thread.sleep(2000);
		
		SwagLabsOpenMenuPage openMenu=new SwagLabsOpenMenuPage(driver);
		openMenu.clickOnLogoutBtn();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
