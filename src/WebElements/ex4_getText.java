package WebElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex4_getText
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//		WebElement element = driver.findElement(By.xpath("//button[@name='login']"));
//		String text = element.getText();
//		System.out.println(text);
		
		String text = driver.findElement(By.xpath("//button[@name='login']")).getText();
		System.out.println(text);
		
		
		String text2 = driver.findElement(By.xpath("//a[contains(@class,'4jy2 selected _51sy')]")).getText();
		System.out.println(text2);
	}
}
