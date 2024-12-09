package handlingCB;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(1000);
	driver.get("https://www.selenium.dev/");
	WebElement ele1=driver.findElement(By.id("navbarDropdown"));
	WebElement ele2=driver.findElement(By.xpath("//span[.='Downloads']"));
	WebElement ele3=driver.findElement(By.xpath("//span[.='Documentation']"));
	WebElement ele4=driver.findElement(By.xpath("//span[.='Projects']"));
WebElement ele5=driver.findElement(By.xpath("//span[.='Support']"));
ArrayList<WebElement>l=new ArrayList<WebElement>();
l.add(ele1);
l.add(ele2);
l.add(ele3);
l.add(ele4);
l.add(ele5);
Actions act=new Actions(driver);
Robot r=new Robot();

for(WebElement mwh:l)
{
	act.contextClick(mwh).perform();
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
Thread.sleep(1000);

}
Set<String> we=driver.getWindowHandles();
ArrayList<String>tabs=new ArrayList<String>(we);
String v=tabs.get(2);
driver.switchTo().window(v);

Thread.sleep(1000);
String st=driver.getTitle();
driver.quit();

}
}