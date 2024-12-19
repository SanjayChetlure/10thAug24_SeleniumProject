package Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple2
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/10th%20Aug%202024/Selenium/html%20files/Sample4_listbox.html");
		
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		Select s=new Select(selectCountry);
		
		boolean result = s.isMultiple();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Listbox is Multi-Selectable");
		}
		else
		{
			System.out.println("Listbox is single-Selectable");
		}
	}
}
