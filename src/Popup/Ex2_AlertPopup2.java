package Popup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex2_AlertPopup2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter Customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		
		
		//Click on Submit btn
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		//getText from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		
		//click on cancel btn from alert popup
		//alt.dismiss();
		
		//click on OK btn from 1st alert popup
		alt.accept();
		
				
		//click on OK btn from 2nd alert popup
		alt.accept();
		
	}
}
