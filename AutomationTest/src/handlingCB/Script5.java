package handlingCB;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script5  //close only child browser
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		String p_id=driver.getWindowHandle();
		Set<String>allwh=driver.getWindowHandles();
		System.out.println(allwh.size());
		allwh.remove(p_id);
		System.out.println(allwh.size());
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			driver.close();
			
		}
	}

}
