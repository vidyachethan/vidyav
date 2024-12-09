package fileuploadpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Jhanvi/Desktop/html/f1.html");
		WebElement ele=driver.findElement(By.name("upload file"));
		ele.sendKeys("C:\\Users\\Jhanvi\\Desktop\\html\\f1.html");
	}

}
