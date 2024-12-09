package synchonization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchtonewtab {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/ui/pageLoad?sublist=0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[.='Open In New Tab']")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vbn@gmail.com");
		
		
		
		
			
		
	}

}
