package POM_With_pagefactory;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLoginTest2_simplePOM 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		SwagLabsLoginPage1 login=new SwagLabsLoginPage1(driver);    //complete initialization
		login.enterUN();										
		login.enterPwd();
		login.clickOnLoginBtn();
		Thread.sleep(2000);
		

	}

}
