package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_AuthenticationPopUp
{
	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");

		 //https://username:password@remaingURL

		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); 
	}

}
