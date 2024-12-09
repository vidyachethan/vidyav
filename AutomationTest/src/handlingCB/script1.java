package handlingCB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetAllWindowHandles;

public class script1 //fetch only address of only parentbrowser
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com");
String src=driver.getWindowHandle();
System.out.println(src);
}
}
