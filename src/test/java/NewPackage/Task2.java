package NewPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom.Demo;

public class Task2 
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
		 driver.get("https://www.fullstack.cafe/blog/coding-challenges-interview-questions");
		 String str = driver.findElement(By.xpath("//div[@class='panel my-3 p-4 mdc-elevation--z2']")).getText();
		 System.out.println(str);
		 try {
			 PrintStream console= new PrintStream(new File(".\\files\\Consolefile"+".txt"));
			 System.out.println(console);
			 console.print(str);
		 }catch (FileNotFoundException fx) {
			 
			// TODO: handle exception
			 System.out.println(fx);
		}
//		 File file =    new File("E:\\TestData\\TestData.xls");
//		 FileInputStream inputStream = new FileInputStream(file);
//	     HSSFWorkbook wb=new HSSFWorkbook(inputStream);
//		 FileOutputStream outputStream = new FileOutputStream("C:\\Users\\rahul\\git\\seleniumcommunity\\seleniumcommunity\\files");
//         wb.write(outputStream);
		 }
}
