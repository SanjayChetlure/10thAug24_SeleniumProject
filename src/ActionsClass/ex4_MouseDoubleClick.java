package ActionsClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex4_MouseDoubleClick
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		WebElement doubleClickEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions act=new Actions(driver);
		
//		act.moveToElement(doubleClickEle).perform();
//		act.doubleClick().perform();
		
//		act.moveToElement(doubleClickEle).doubleClick().perform();
		
		act.doubleClick(doubleClickEle).perform();
	}
}
