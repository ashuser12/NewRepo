package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPom
{
public FirstPom(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//div[@class='SDkEP']")
public WebElement searchfield;
@FindBy(xpath="//textarea[@class='gLFyf']")
public WebElement searchfield1;
@FindBy(xpath="//span[.='Nilkamal Furniture Online Sale - Nilkamal Chairs Online']")
public WebElement link;
@FindBy(xpath="(//a[@data-dropdown-rel='home-office'])[2]")
public WebElement HomeOfficelink;
@FindBy(xpath="//span[.='Nilkamal Lusaka Mid Back Office Chair']")
public WebElement productName;
@FindBy(xpath="//input[@name='pincode']")
public WebElement enterPincode;
@FindBy(xpath="//input[@type='button']")
public WebElement checkButton;


@FindBy(xpath="(//button[@data-label='Add to Cart'])[3]")
public WebElement addToCartButton;
@FindBy(xpath="(//a[@class='icon-cart mini_cart dropdown_link']/..)[3]")
public WebElement cartIcon;
@FindBy(xpath="(//input[@value='Google Search'])[2]")
public WebElement googlesearchbutton;
@FindBy(xpath="(//cite[@class='tjvcx GvPZzd cHaqb'])[1]")
public WebElement shelfperkslink;
@FindBy(xpath="(//div[//@class='MuiBox-root css-ykq75t'])[11]")
public WebElement pricing;
@FindBy(xpath="//p[.='What is Application Integration Fee?']")
public WebElement text;
@FindBy(xpath="(//p[@class='MuiTypography-root MuiTypography-body1 open-sans css-emkjjg'])[9]")
public WebElement applicationtext;


}
