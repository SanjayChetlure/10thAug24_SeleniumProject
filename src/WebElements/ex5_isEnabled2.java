package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex5_isEnabled2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("(//button[@type='submit'])[1]")).isEnabled();
		System.out.println(result);
		
		if (result)
		{
			System.out.println("Element Enabled");
		} 
		else 
		{
			System.out.println("Element disabled");
		}
	}
}
