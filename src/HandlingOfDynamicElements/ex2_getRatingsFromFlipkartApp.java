package HandlingOfDynamicElements;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_getRatingsFromFlipkartApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter mob 
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("redmi 13c 5g");
		
		//click on submit btn
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		String rating = driver.findElement(By.xpath("((//div[@class='tUxRFH'])[1]//span)[6]")).getText();
		System.out.println(rating);
	}
}
