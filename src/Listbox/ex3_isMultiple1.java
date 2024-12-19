package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
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
