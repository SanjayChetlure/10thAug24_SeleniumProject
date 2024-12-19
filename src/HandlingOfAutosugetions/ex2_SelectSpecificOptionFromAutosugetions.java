package HandlingOfAutosugetions;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_SelectSpecificOptionFromAutosugetions 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");		
		
		driver.findElement(By.xpath("//textArea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);
		
		String expText="redmi 13 5g";
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']"));
		
		for(WebElement option:allOptions)
		{
			String actText = option.getText();
			if (actText.equals(expText)) 
			{
				option.click();
				break;
			}
			
		}	
	}
}
