package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex6_isSelected
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
			
		boolean result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).isSelected();
		System.out.println(result);
		
		
		if (result) 
		{
			System.out.println("Radio btn Selected");
		} 
		else
		{
			System.out.println("Radio btn De-Selected");
		}
		
	}
}
