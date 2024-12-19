package WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();	
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(4000);		//ClassName.MethodName(time in mili sec)	//wait for 2 sec
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);				//wait for 2 sec
		driver.navigate().back();
		Thread.sleep(4000);				//wait for 2 sec
		driver.navigate().forward();
		Thread.sleep(4000);				//wait for 2 sec
		driver.navigate().refresh();
	}
}
