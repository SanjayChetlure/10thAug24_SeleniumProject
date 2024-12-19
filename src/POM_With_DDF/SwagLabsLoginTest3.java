package POM_With_DDF;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLoginTest3
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("D:\\10th Aug 2024\\10thAug24.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		
		SwagLabsLoginPage login=new SwagLabsLoginPage(driver);
		login.inpSwagLabsLoginPageUsername(sh.getRow(1).getCell(0).getStringCellValue());
		login.clickSwagLabsLoginPageLoginBtn();
		login.verifySwagLabsLoginPageErrorMsg(sh.getRow(1).getCell(1).getStringCellValue());

		Thread.sleep(2000);
		driver.quit();
	}
}
