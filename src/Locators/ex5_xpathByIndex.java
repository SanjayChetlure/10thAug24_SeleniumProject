package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_xpathByIndex
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		//enter FN
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");
	
		//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
		
		//enter mob num
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("9999999999");
	}
}
