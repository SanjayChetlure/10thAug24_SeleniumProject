package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_Name
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/10th%20Aug%202024/Selenium/html%20files/Name.html");

		//enter FN
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		
		//enter LN
		driver.findElement(By.name("xyz123")).sendKeys("xyz");
	}
}
