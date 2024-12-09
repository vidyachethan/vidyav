package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Likeyoutube 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	//driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).sendKeys("kantara songs");
	driver.get("https://www.youtube.com/watch?v=m-5ck3BuT1o");
	driver.manage().window().maximize();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[@title='I like this']")).click();
	driver.quit();
}
}