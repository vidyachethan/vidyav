package advanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbmonthtreeset 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("month"));
		Select s= new Select(ele);
		TreeSet<String>t=new TreeSet<String>();
		List<WebElement>opt=s.getOptions();
		for(WebElement we : opt)
		{
			String text = we.getText();
		t.add(text);
		}
		
	for (String t1:t) 
	{
		System.out.println(t1);
	}
	}
}
