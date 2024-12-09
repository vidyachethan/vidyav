
package takesscreenshot;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Genclass1 
{
	
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.meesho.com/");
	GenericPhoto.getPhoto(driver);
}
}
