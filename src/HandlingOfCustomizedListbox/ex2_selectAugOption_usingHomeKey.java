package HandlingOfCustomizedListbox;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_selectAugOption_usingHomeKey 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		act.click(month).perform();
		Thread.sleep(2000);
		
		
		//navigate to 1st option using Home key
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(2000);
		
		for(int i=1; i<=7; i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(500);
		}
				
		act.sendKeys(Keys.ENTER).perform();	
	}
}
