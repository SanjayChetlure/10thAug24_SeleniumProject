package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex10_LinkText_PartialLinkText
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/10th%20Aug%202024/Selenium/html%20files/Linktext_PartialLinktext.html");

		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("facebook")).click();
		driver.findElement(By.partialLinkText("face")).click();		
	}
}

