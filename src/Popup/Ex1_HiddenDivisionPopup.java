package Popup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex1_HiddenDivisionPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		
		//click on SignUp Btn
		driver.findElement(By.xpath("(//span[text()='Signup'])[1]")).click();
		
		Thread.sleep(2000);
		
		//enter mob no in Hidden Division popup
		driver.findElement(By.xpath("//input[@name='cellNo']")).sendKeys("9999999999");
	
	}
}
