package Screenshot;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ex1_captureSSOfCompleteWebpage 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com/");
		
//		TakesScreenshot s1 = ((TakesScreenshot)driver);
//		File source = s1.getScreenshotAs(OutputType.FILE);
		
				
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\10th Aug 2024\\Selenium\\Screenshot\\sample3.png");
		
		FileHandler.copy(source, dest);    //ClassName.methodName(pathOfSource, pathOfDest);	
	}
}
