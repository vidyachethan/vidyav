package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class GenericPhoto
{
public static void getPhoto(WebDriver driver) throws IOException
{
	String photos="./photos/";
	Date d=new Date();
	String d1=d.toString();
	String d2=d.toString();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dst=new File(photos+d2+"a1.jpeg");
	FileHandler.copy(src, dst);

}
}