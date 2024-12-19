package Framework;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_ExampleWithoutDDF 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		
		String actLogoText = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		String expLogoText="Swag Labs";
		
		if (actLogoText.equals(expLogoText)) 
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
				
		driver.quit();		
	}
}
