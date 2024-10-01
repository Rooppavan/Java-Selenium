package Basepack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public static WebDriver driver;
	public static Properties obj;
	
	 @BeforeMethod
	  public void openBrowser() throws IOException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\PAVAN\\eclipse-workspace_1\\Batch41_OrangeHRM\\Browser\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 FileInputStream f = new FileInputStream("C:\\Users\\PAVAN\\eclipse-workspace_1\\Batch41_OrangeHRM\\src\\data\\java\\packdata\\Mydata");
		 
		 obj = new Properties();
		 
		 obj.load(f);
		 
		 obj.getProperty("URL");
	 }
	
 

  @AfterClass
  public void CloseBrowser() {
  }

}
