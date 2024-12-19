package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex5_verifySpecificData
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Sample5_webtable.html");
		
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		boolean eleFound=false;
		
		for(int i=1; i<=rowSize; i++)
		{      
			int colSize=0; 
			if (i==1) 
			{
				 colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+ "]/th")).size();
			}
			else
			{
				 colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+ "]/td")).size();
			}
			
			for(int j=1; j<=colSize; j++)
			{
				String actText="";
				if (i==1)   
				{			                                
					actText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/th["+j+ "]")).getText();
				} 
				else
				{						//                  
					actText = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/td["+j+ "]")).getText();
				}
				
				if (actText.equals("2000")) 
				{
					eleFound=true;
					break;
				}				
			}
			System.out.println();
		}
		
		
		if (eleFound)  //false
		{
			System.out.println("Element found");
		} 
		else
		{
			System.out.println("Element not found");
		}

	}
}
