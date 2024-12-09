package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver,chromedriver","./softwares/chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("vidya1120@gamil.com");
		driver.findElement(By.id("password")).sendKeys("abcdef");
		driver.findElement(By.id("login")).click();
		driver.quit();
	}

}
