package HandlingOfMultipleElements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex4_getSizeOfCheckboxes
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/MultipleCheckboxes.html");
		
		int size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(size);
	}
}
