package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex7_switchToMainPage_from_ChildWindow
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
		
		
		//switch to child window
		driver.switchTo().window(al.get(1));       //String childWindowID
		
		
		//click on Training link from ChildWindow
		driver.findElement(By.xpath("//span[text()='Training']")).click();	
		Thread.sleep(3000);
		
		//switch to main page from child Window
		driver.switchTo().window(al.get(0));
		Thread.sleep(3000);
		
		//click on "NewWindow" link from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(3000);
		
		
		//switch to 2nd child window
		Set<String> allIds2 = driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>(allIds2);
		driver.switchTo().window(al2.get(2));
		
		//maximize 2nd child window
		driver.manage().window().maximize();	
	}
}
