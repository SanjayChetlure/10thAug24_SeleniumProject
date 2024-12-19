package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_getSelectedOptionFrom_SingleSelectableListbox
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
//		WebElement selectedOption = s.getFirstSelectedOption();
//		String text = selectedOption.getText();
//		System.out.println(text);
		
		String text = s.getFirstSelectedOption().getText();
		System.out.println(text);
	}
}
