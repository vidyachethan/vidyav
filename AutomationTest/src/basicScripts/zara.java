package basicScripts;


	import org.openqa.selenium.chrome.ChromeDriver;

	import com.beust.jcommander.StringKey;
	public class zara 


	
	{
		public static void main(String[] args)
	{
		String key="webdriver.chrome.driver";
		String value="./softwares/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("");
		}
	}


