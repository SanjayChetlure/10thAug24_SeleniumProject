package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//Test class
public class ex11_Parallel3
{
	@Test
	public void openFlipkartApp() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
