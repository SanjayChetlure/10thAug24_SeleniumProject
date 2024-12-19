package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_selectOptionFrom_MultiSelectableListbox 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/10th%20Aug%202024/Selenium/html%20files/Sample4_listbox.html");
		
		//step1: 
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
		
		//Step2:
		Select s=new Select(selectCountry);
		
		//step3:
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Aus");
		s.selectByIndex(3);
		//s.selectByValue("");		
	}
}
