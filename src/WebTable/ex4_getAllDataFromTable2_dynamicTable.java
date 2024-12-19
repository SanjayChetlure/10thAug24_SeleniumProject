package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex4_getAllDataFromTable2_dynamicTable
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Sample5_webtable.html");
		
		
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		//           2<=4
		for(int i=1; i<=rowSize; i++)
		{      
			int colSize=0;  //3
			if (i==1) //for row=1
			{
				 colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+ "]/th")).size();
			}
			else
			{
				 colSize = driver.findElements(By.xpath("//table[@id='1234']//tr["+i+ "]/td")).size();
			}
			//           2<=3
			for(int j=1; j<=colSize; j++)
			{
				if (i==1)   //row=1 
				{			                                
					String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/th["+j+ "]")).getText();
					System.out.print(text1+" ");
				} 
				else
				{						//                  
					String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/td["+j+ "]")).getText();
					System.out.print(text1+" ");
				}
			}
			System.out.println();
		}
		
		
		//
		//

	}
}
