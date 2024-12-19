package Listbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex6_getSizeOfAllOptionsFromListbox
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		
		
//		List<WebElement> allOptions = s.getOptions();
//		int size = allOptions.size();
//		System.out.println(size);
		
		int size = s.getOptions().size();
		System.out.println(size);
		
		//System.out.println(s.getOptions().size());
	}
}
