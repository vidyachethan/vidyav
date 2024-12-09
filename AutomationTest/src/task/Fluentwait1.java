package task;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait1 {
public static void main(String[] args)
		
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/progress/element?sublist=2");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("2");
	driver.findElement(By.xpath("//button[text()='Start']")).click();
	Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)
			.withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(5))
			.ignoring(NoSuchElementException.class);
	WebElement ele1=wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver)
		{
			return driver.findElement(By.xpath("//Select)[2]"));
					
		}
	});
			ele1.click();
}
	
}
