package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo1 
{
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/watch?v=m-5ck3BuT1o");
	Thread.sleep(2000);
	//step1
	TakesScreenshot ts=(TakesScreenshot)driver;
	//step2
	File src= ts.getScreenshotAs(OutputType.FILE);
	//step3
	
	File dst=new File("C:\\Users\\Jhanvi\\Pictures\\Screenshots\\file.jpeg");
	//step4
	FileHandler.copy(src, dst);
		
}
}
