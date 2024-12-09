package jse;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hslf.record.InteractiveInfoAtom.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import jakarta.xml.bind.Element;

public class Scrollupelement 
{
public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	WebElement ele=driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]"));
	Point p=ele.getLocation();
	int y=p.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,\" + y+\")");
	//ele.click();
	String photos="./photos/";
	Date d=new Date();
	String d1=d.toString();
	String d2=d.toString();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photos+d2+".jpeg");
	FileHandler.copy(src, dst);
	
}  
}
