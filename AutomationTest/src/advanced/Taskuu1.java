package advanced;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskuu1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement ele = driver.findElement(By.id("month"));
	    Select s=new Select(ele);
		TreeSet<String>l=new TreeSet<String>(Collections.reverseOrder());
		List<WebElement>opt=s.getOptions();
		for(WebElement we : opt)
		{
			String text = we.getText();
		    l.add(text);
		}
	    for (String l1:l) 
	    {
		    System.out.println(l1);
	    }
	}
}
     
	    
	

	

