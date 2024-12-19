package HandlingOfAutosugetions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getAllOptionsFromAutosugetions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");		
		
		driver.findElement(By.xpath("//textArea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']"));
		
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}	
	}
}
