package advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Shoppersstack
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(40000);
		driver.findElement(By.xpath("//a[@id='men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='happilo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("button[@id='Buy Now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Email']")).click();
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("shopper");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).click();
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("shopper@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
	}


