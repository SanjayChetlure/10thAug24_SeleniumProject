package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex11_diffBetween_close_quit
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(2000);
		
		//driver.close();
		driver.quit();
	}
}
