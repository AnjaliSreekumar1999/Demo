package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://demo.guru99.com/test/newtours/");
driver.findElement(By.name("userName")).sendKeys("Mercury");
driver.findElement(By.name("password")).sendKeys("Mercury");

	}
}