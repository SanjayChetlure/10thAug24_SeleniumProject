package POM_With_pagefactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLoginTest2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		SwagLabsLoginPage login=new SwagLabsLoginPage(driver);   
		login.enterUN();									
		login.clickOnLoginBtn();
		login.verifyErrorMsg();
		
		Thread.sleep(2000);
		
		driver.quit();		
	}
}
