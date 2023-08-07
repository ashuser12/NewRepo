package NewPackage;

import java.awt.Dimension;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.FirstPom;
import java.io.FileReader;

public class ShelfPerks 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
//		org.openqa.selenium.Dimension d = new Dimension(1900, 1080);
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(1900, 1080));
		driver.get("https://www.google.com/");
		 FirstPom a=new FirstPom(driver);
		 a.searchfield.click();
		 a.searchfield1.sendKeys("ShelfPerks Newsletters");
		 a.googlesearchbutton.click();
		 a.shelfperkslink.click();
		 Thread.sleep(3000);
		 a.pricing.click();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,3200)");
		 a.text.click();
		 //driver.applicationtext.getText();
	}
}
