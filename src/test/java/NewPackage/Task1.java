package NewPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.annotations.VisibleForTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Demo;
import pom.FirstPom;

public class Task1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().setSize(new org.openqa.selenium.Dimension(1900, 1080));
		driver.get("https://www.google.com/");
		 Demo a=new Demo(driver);
		 a.searchfield.click();
		 a.searchfield1.sendKeys("ShelfPerks Newsletters");
		 Thread.sleep(3000);
		 a.sideclick.click();
		 a.newsletterlink.click();
		 a.storeoperatingsystem.click();
		 a.acceptallbutton.click();
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("window.scrollBy(0,3400)");
		 Thread.sleep(3000);
		 a.About.click();
		 Thread.sleep(3000);
		 JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		 jse1.executeScript("window.scrollBy(0,3000)");
		 
		 try
		 {
			 if (null != null)
			 {
				 boolean eleSelected= driver.findElement(By.xpath("//div[@class='MuiBox-root css-17vi9sb']")).isDisplayed();
				 a.doitlater.click();
			} 
			 else 
			 {
              System.out.println("popup is not displayed");
			}
//			 Alert alert=driver.switchTo().alert();
//			 alert.accept();
		 }
		 catch (NoAlertPresentException e) {
			 // TODO: handle exception
			 System.out.println("Alert not displayed");
			 e.printStackTrace();
		}
		 Thread.sleep(3000);
		 a.link.click();
		 Thread.sleep(3000);
		 Set<String> handles=driver.getWindowHandles();
		 Iterator it= handles.iterator();
		 String parentid=(String) it.next();
		 driver.switchTo().window(parentid);
		 driver.navigate().to("https://www.google.com/");
		 a.searchfield1.sendKeys("How to get hired at ShelfPerks");
		 a.googlesearchbutton.click();
		 System.out.println("Task1 is completed in google");
		 
		 
		 
		//WebElement OpenTab= driver.findElement(By.xpath("//a[@class='green']"));
		//OpenTab.findElement(By.tagName("a"));
		//String opentabAgain= Keys.chord(Keys.CONTROL,Keys.ENTER);
		//OpenTab.findElement(By.tagName(opentabAgain));
         		 

	driver.get("https://www.bing.com/");
	 a.bingsearchfield.sendKeys("ShelfPerks Newsletters");
	 Thread.sleep(3000);
	 a.bingsearchfield.click();
	 a.newsletteroption.click();
	 a.newsletterlink1.click();
	 a.storeoperatingsystem.click();
	// a.acceptallbutton.click();
	// JavascriptExecutor jse = (JavascriptExecutor) driver;
	 jse.executeScript("window.scrollBy(0,3400)");
	 Thread.sleep(3000);
	 a.About.click();
	 Thread.sleep(3000);
	 //JavascriptExecutor jse1 = (JavascriptExecutor) driver;
	 jse1.executeScript("window.scrollBy(0,3000)");
	 
	 try
	 {
		 if (null != null)
		 {
			 boolean eleSelected= driver.findElement(By.xpath("//div[@class='MuiBox-root css-17vi9sb']")).isDisplayed();
			 a.doitlater.click();
		} 
		 else 
		 {
         System.out.println("popup is not displayed");
		}
//		 Alert alert=driver.switchTo().alert();
//		 alert.accept();
	 }
	 catch (NoAlertPresentException e) {
		 // TODO: handle exception
		 System.out.println("Alert not displayed");
		 e.printStackTrace();
	}
	 Thread.sleep(3000);
	 a.link.click();
	 Thread.sleep(3000);
	 Set<String> handles1=driver.getWindowHandles();
	 Iterator it1= handles1.iterator();
	 String parentid1=(String) it.next();
	 driver.switchTo().window(parentid1);
	 driver.navigate().to("https://www.bing.com/");
	 a.bingsearchfield.sendKeys("How to get hired at ShelfPerks");
	 Thread.sleep(3000);
	 a.bingsearchfield.click();
	 Thread.sleep(3000);
	// a.shelfperks.click();
	 System.out.println("Task1 is completed in Bing");


}
}
