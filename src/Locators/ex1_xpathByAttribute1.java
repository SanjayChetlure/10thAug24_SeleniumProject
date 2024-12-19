package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute1
{
	public static void main(String[] args)
	{
		ChromeDriver driver1=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(Locator type)
//		driver.findElement(By.xpath("xpath expression"))    //className.methodName()
		
		//enter un
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		//enter pwd
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
	
		//click on login btn
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
