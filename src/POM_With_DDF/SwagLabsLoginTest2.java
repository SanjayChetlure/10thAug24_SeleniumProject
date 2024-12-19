package POM_With_DDF;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SwagLabsLoginTest2 
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
		login.inpSwagLabsLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabsLoginPagePaswword(sh.getRow(0).getCell(1).getStringCellValue());
		login.clickSwagLabsLoginPageLoginBtn();
		Thread.sleep(2000);
		
		SwagLabsHomePage home=new SwagLabsHomePage(driver);
		home.verifySwagLabsHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
		home.clickSwagLabsHomePageOpenMenuBtn();
		Thread.sleep(2000);
		
		SwagLabsOpenMenuPage openMenu=new SwagLabsOpenMenuPage(driver);
		openMenu.clickSwagLabsOpenMenuPageLogout();
		
		Thread.sleep(2000);
		driver.quit();
	}
}