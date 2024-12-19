package ActionsClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_MouseLeftClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		WebElement cart = driver.findElement(By.xpath("//a[text()='Cart']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(cart).perform();
//		act.click().perform();
		
//		act.moveToElement(cart).click().perform();
		
		act.click(cart).perform();
	}
}
