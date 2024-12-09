package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoapps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		WebElement ele=driver.findElement(By.name("file"));
		Thread.sleep(2000);
		ele.sendKeys("C:\\Users\\Jhanvi\\Desktop\\acchu.lnk");
	
		
		//WebElement ele1=driver.findElement(By.id("customButton")).click();
		
	Thread.sleep(2000);
	}

}
