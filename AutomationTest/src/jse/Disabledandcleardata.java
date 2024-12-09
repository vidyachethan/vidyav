package jse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Disabledandcleardata 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/Jhanvi/Desktop/html/disabled.html");
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementById('a1').value=''");
}
}
