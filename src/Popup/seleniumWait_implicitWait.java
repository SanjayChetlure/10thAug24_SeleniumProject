package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWait_implicitWait
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//page1
			//page1 action
		//---------------------------------
		
		Thread.sleep(5000);   -> selenium wait(3 types) -> implicit wait
		
		//page2
			//page 2 action
		
		
		
	}

}
