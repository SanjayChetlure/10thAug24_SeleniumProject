package ActionsClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex7_ScrollByAmount
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		//scroll down  -> 1st para 0, 2nd para +ve 
		act.scrollByAmount(0, 300).perform();
		Thread.sleep(2000);
		
		//scroll up  -> 1st para 0, 2nd para -ve 
		act.scrollByAmount(0, -100).perform();

		//scroll right  -> 1st para +ve, 2nd para 0
		act.scrollByAmount(200, 0).perform();
		
		//scroll left  -> 1st para -ve, 2nd para 0
		act.scrollByAmount(-100, 0).perform();	
	}
}
