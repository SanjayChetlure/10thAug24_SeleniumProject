package WebTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ex4_getAllDataFromTable1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/6th%20July%202024/Selenium/html%20files/Sample5_webtable.html");
		
		//           2<=4
		for(int i=1; i<=4; i++)
		{    //          4<=3   
			for(int j=1; j<=3; j++)
			{
				if (i==1)   //2==1   / row=1
				{			//                                    //table[@id='1234']//tr[1]/th[3]
					String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/th["+j+ "]")).getText();
					System.out.print(text1+" ");
				} 
				else
				{						//                     //table[@id='1234']//tr[2]/td[3]
					String text1 = driver.findElement(By.xpath("//table[@id='1234']//tr["+i+ "]/td["+j+ "]")).getText();
					System.out.print(text1+" ");
				}
			}
			System.out.println();
		}

	}
}
