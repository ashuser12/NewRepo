package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo
{
	public Demo(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	public WebElement googlesearchbutton;
	@FindBy(xpath="//div[@class='SDkEP']")
	public WebElement searchfield;
	@FindBy(xpath="//textarea[@class='gLFyf']")
	public WebElement searchfield1;
	@FindBy(xpath="(//cite[@class='qLRx3b tjvcx GvPZzd cHaqb'])[1]")
	public WebElement newsletterlink;
	@FindBy(xpath="(//div[@class='MuiBox-root css-ykq75t'])[2]")
	public WebElement storeoperatingsystem;
	@FindBy(xpath="(//div[@class='wM6W7d'])[1]")
	public WebElement sideclick;
	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement acceptallbutton;
	
	@FindBy(xpath="//span[.='About']")
	public WebElement About;
	@FindBy(xpath="//a[@class='green']")
	public WebElement link;
	@FindBy(xpath="//div[@class='MuiBox-root css-17vi9sb']")
	public WebElement popup;
	@FindBy(xpath="(//button[@type='button'])[12]")
	public WebElement doitlater;
	@FindBy(xpath="//div[@class='panel my-3 p-4 mdc-elevation--z2']")
	public WebElement content;
	@FindBy(xpath="//textarea[@id='sb_form_q']")
	public WebElement bingsearchfield;
	@FindBy(xpath="//form[@action='/search']")
	public WebElement searchbutton;
	@FindBy(xpath="(//div[@class='sa_tm'])[1]")
	public WebElement newsletteroption;
	@FindBy(xpath="(//div[@class='b_attribution'])[1]")
	public WebElement newsletterlink1;
	
	
	
}
