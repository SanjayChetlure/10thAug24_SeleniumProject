package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_selectOptionFrom_singleSelectableListbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		//step1: 
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//Step2:
		Select s=new Select(month);
		
		//step3:
		//s.selectByVisibleText("Dec");     //String text
		//s.selectByValue("12");            //String value
		s.selectByIndex(11);                 //int index
	}
}
