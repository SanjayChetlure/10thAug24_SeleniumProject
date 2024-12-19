package POM_With_pagefactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//pom class 1
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabsLoginPage1
{
	//Step1: declaration
	private WebElement UN; 
	private WebElement LoginBtn;	
	private WebElement errorMsg;	

	
	//initialization
	public SwagLabsLoginPage1(WebDriver driver)
	{
		UN=driver.findElement(By.xpath("//input[@name='user-name']"));
		LoginBtn=driver.findElement(By.xpath("//input[@name='user-name']"));
		errorMsg=driver.findElement(By.xpath(""));
	}
	
	public void enterUN() 
	{
		UN.sendKeys("standard_user");
	}
	
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	public void verifyErrorMsg()
	{
		if (errorMsg.isDisplayed()) 
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
	}
	
}
