package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Generictss {
	public static void getPhoto(WebDriver driver) throws IOException
	{
		String pho="./photos/";
	Date d=new Date();
		String d1=d.toString();
String d2=d1.replaceAll(":", "-");
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
	File dst= new File(pho+d2+"a2.jpeg");
	FileHandler.copy(src, dst);
	}
}
