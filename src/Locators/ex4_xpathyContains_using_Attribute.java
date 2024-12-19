package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_xpathyContains_using_Attribute
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//enter UN
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
	
		//enter pwd
		driver.findElement(By.xpath("//input[contains(@class,'6luy _9npi')]")).sendKeys("xyz");

		
		//click on login btn
		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')]")).click();
	}
}
