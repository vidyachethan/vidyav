package task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.saucedemo.com/v1/");
driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
Thread.sleep(2000); 
driver.findElement(By.xpath("//input[@id='login-button']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();
WebElement ele1=driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
String title = ele1.getText();
System.out.println(title);
Thread.sleep(2000);
driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']/following-sibling::div[2]"));
WebElement ele2=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
String price=ele2.getText();
System.out.println(price);
driver.findElement(By.xpath("//button[.='ADD TO CART']")).click();
driver.findElement(By.id("shopping_cart_container")).click();
Thread.sleep(2000);
WebElement ele3=driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
String title1=ele3.getText();
System.out.println(title1);
if(title==title1&& title==title1)
{
	System.out.println("same");
}
else
{
	System.out.println("not same");
}
driver.findElement(By.xpath("//button[.='Open Menu']")).click();
Thread.sleep(2000);
driver.findElement(By.id("//a[@id='logout_sidebar_link']")).click();
Thread.sleep(2000);
driver.quit();
}
}
