package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=noCAb7LlvMA");
		
		
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		
		
		}

}
