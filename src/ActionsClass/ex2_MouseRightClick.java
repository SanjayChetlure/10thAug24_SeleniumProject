package ActionsClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex2_MouseRightClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(electronics).perform();
//		act.contextClick().perform();
		
//		act.moveToElement(electronics).contextClick().perform();
		
		act.contextClick(electronics).perform();
	}
}
