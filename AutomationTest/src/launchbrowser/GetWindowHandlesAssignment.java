package launchbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandlesAssignment 
{
public static void main(String[] args) throws InterruptedException, AWTException 

{
	System.setProperty("window.driver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	WebElement ele=driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Set<String>we=driver.getWindowHandles();
	for(String id:we) {
		driver.switchTo().window(id);
		int count=we.size();
		System.out.println(count);
		System.out.println(id);
		}
	
}
}
