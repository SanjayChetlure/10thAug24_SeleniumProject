package IFrame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex2_SwitchToMainPage_FromIFrame
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		//switch to frame 
		driver.switchTo().frame("iframeResult");    //String FrameID
		
		//click on "click me" btn from Iframe
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		Thread.sleep(2000);
		//switch to main page from frame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		
		//click on open menu btn from main page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}
}
