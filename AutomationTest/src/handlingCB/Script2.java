package handlingCB;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 //countbrowserandaddress
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://skpatro.github.io/demo/links/");
Thread.sleep(1000);
driver.findElement(By.name("NewWindow")).click();
Set<String> allwh=driver.getWindowHandles();
System.out.println(allwh.size());
for(String wh:allwh)
{
	System.out.println(wh);
}
}
}
