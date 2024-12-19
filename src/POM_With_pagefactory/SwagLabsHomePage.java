package POM_With_pagefactory;
import org.openqa.selenium.WebDriver;
//pom class 2
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SwagLabsHomePage 
{
	@FindBy(xpath = "//div[@class='app_logo']") private WebElement logoText;
	@FindBy(xpath = "//button[text()='Open Menu']") private WebElement openBtn;
	
	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogo() 
	{
		String actLogoText = logoText.getText();
		String expLogoText="Swag Labs";
		if (actLogoText.equals(expLogoText))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
	
	public void clickOnOpenMenuBtn()
	{
		openBtn.click();
	}
	
}
