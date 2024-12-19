package HandlingOfMultipleElements;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex6_SelectSpecificCheckboxes2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/MultipleCheckboxes.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));		
		
		for(int i=0; i<=allCheckboxes.size()-1; i++)
		{
			if(i==1 | i==4 | i==7 | i==9)
			{
				allCheckboxes.get(i).click();
				Thread.sleep(500);
			}
		}
	}
}
