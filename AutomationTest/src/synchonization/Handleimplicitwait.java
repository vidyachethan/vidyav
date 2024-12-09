package synchonization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handleimplicitwait {

	public static void main(String[] args) {
		System.setProperty("WebDriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automation-lab/login.do");
		driver.findElement(By.name("username")).sendKeys("vidyav1120@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("nTzj48Yg");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	}

}
