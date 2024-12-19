package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//System.out.println(driver.getTitle());
		
		
		if(title.contains("Facebook"))
		{
			System.out.println("Navigate to correct webpage");
		}
		else
		{
			System.out.println("Navigate to wrong webpage");
		}
	}
}
