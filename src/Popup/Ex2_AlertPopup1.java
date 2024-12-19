package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex2_AlertPopup1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter Customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		
		
		//Click on Submit btn
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//getText from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		
		//click on cancel btn from alert popup
		//driver.switchTo().alert().dismiss();
		
		//click on OK btn from 1st alert popup
		driver.switchTo().alert().accept();
		
		//click on OK btn from 2nd alert popup
		driver.switchTo().alert().accept();
	}
}
