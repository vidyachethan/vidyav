package handlingCB;

import java.util.Set;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Script3 //albrowser&closeit
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(1000);
	driver.findElement(By.name("NewWindow")).click();
	Thread.sleep(1000);
	Set<String>allwh=driver.getWindowHandles();
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
				System.out.println(driver.getTitle());
				driver.close();
				
			}
				
	
}
}
