package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/");
	//Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@placeholder=Search for Products, Brands and More']")).click();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
	driver.findElement(By.xpath("////button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[@id='productRating_LSTMOBH4JCVQZPCHWJDT21P4P_MOBH4JCVQZPCHWJD_']")).click();
	driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
}
}
