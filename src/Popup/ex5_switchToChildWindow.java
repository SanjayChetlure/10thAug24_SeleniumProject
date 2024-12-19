package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex5_switchToChildWindow
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on "NewTab" link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		//get ChildWindowID
		Set<String> allIds = driver.getWindowHandles();     //{mainPageID, childWindowID}
		ArrayList<String> al=new ArrayList<String>(allIds);     //{mainPageID(0), childWindowID(1)}
		String childWindowID = al.get(1);
		
		
		//switch to child window
		driver.switchTo().window(childWindowID);       //String childWindowID
		
		
		//click on Training link from ChildWindow
		driver.findElement(By.xpath("//span[text()='Training']")).click();	
	}
}
