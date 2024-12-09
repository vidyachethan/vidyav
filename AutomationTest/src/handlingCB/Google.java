package handlingCB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google 
{
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);
	driver.get("https://www.google.com/"); 
	Thread.sleep(1000);
	WebElement ele = driver.findElement(By.xpath("//a[text()='ಕನ್ನಡ']"));
	
	Actions act=new Actions(driver);
	act.contextClick(ele).perform();
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	Thread.sleep(2000);
	
	Set<String> w = driver.getWindowHandles();
	ArrayList<String>a=new ArrayList<String>(w);
	
	String v = a.get(1);
	driver.switchTo().window(v);
	Thread.sleep(1000);
	for (String string : a) 
	{
		int count=a.size();
		System.out.println(count);
		System.out.println(string);
	}
	
	driver.quit();
}
}