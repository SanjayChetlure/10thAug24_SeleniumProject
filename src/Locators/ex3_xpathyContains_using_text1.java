package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_xpathyContains_using_text1
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//click on Forgotten pwd link
		driver.findElement(By.xpath("//a[contains(text(),'password')]")).click();
	}
}
