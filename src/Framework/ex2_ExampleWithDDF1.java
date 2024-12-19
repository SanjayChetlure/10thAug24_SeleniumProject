package Framework;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_ExampleWithDDF1 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String UNValue = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys(UNValue);
		
		String PWDValue = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWDValue);
		driver.findElement(By.xpath("//input[@name='login-button']")).click();
		Thread.sleep(2000);
		
		String actLogoText = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
		String expLogoText=sh.getRow(0).getCell(2).getStringCellValue();
		
		if (actLogoText.equals(expLogoText)) 
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
		
		driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
				
		driver.quit();		
	}
}
