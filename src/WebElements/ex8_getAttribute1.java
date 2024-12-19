package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex8_getAttribute1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		String attributeValue = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println(attributeValue);
	}
}
