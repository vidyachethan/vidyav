package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotfb 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
	File src =ele.getScreenshotAs(OutputType.FILE);
	File dst=new File("C:\\Users\\Jhanvi\\Pictures\\Screenshots\\path.jpeg");
	FileHandler.copy(src,dst);
	
}
}
