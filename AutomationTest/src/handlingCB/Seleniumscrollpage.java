package handlingCB;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;


public class Seleniumscrollpage 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		
	    Set<String> w = driver.getWindowHandles();
	    for (String string : w) 
	    {
		driver.switchTo().window(string);	
		}
		
		Thread.sleep(3000);
		
	    WebElement e = driver.findElement(By.xpath("//input[@type='checkbox']"));	
        Point p= e.getLocation();
	    int y = p.getY();
	    JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		e.click();
		
		driver.findElement(By.xpath("//button[.='Accept Our Policy']")).click();	
		
		TakesScreenshot ts= (TakesScreenshot) driver;  
		File src= ts.getScreenshotAs(OutputType.FILE); //step2
		File dst=new File("./photos/tc4.jpg"); //step3
		FileHandler.copy(src,dst);
		
		Thread.sleep(4000);
		driver.quit();
}
}
