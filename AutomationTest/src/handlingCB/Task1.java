package handlingCB;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.graphbuilder.curve.Point;

public class Task1
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@loading='eager']")).click();
		Thread.sleep(1000);
		Set<String>hg=driver.getWindowHandles();
		for(String ig:hg)
		{
			driver.switchTo().window(ig);
		}
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		Thread.sleep(1000);
		//driver.quit();
		
	}

}
