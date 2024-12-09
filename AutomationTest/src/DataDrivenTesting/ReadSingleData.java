package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadSingleData 
{
public static void main(String[] args) throws Exception 
{
	 FileInputStream fis = new FileInputStream("./Testdata/facebookcredentials.xlsx");
	 XSSFWorkbook workbook= new XSSFWorkbook(fis);
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	XSSFRow row = sheet.getRow(3);
	 XSSFCell cel=row.getCell(0);
	 String val = cel.getStringCellValue();
	 System.out.println(val);
	 workbook.close();
	 fis.close();
	 System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");	
	 WebDriver driver=new FirefoxDriver();
	 driver.get("https://www.facebook.com/");
	 WebElement ele= driver.findElement(By.id("email"));
	 ele.sendKeys(val);
	 WebElement ele1=driver.findElement(By.id("pass"));
	 ele.sendKeys();
}
}
