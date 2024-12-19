package ActionsClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex1_handlingOfDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		
		//step1: 
		WebElement loginBtn = driver.findElement(By.xpath("//span[text()='Login']"));
		
		//step2: 
		Actions act=new Actions(driver);
		
		//step3: 
		act.moveToElement(loginBtn).perform();
		
		
		Thread.sleep(3000);
		//click on gift card
		driver.findElement(By.xpath("(//div[@class='_3pKU-e'])[6]")).click();
	}
}
