package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hyperlink{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("C:\\Users\\PAVAN\\Downloads\\Frames.html");
        
        driver.switchTo().frame(2);
        
        driver.findElement(By.linkText("The Rock Says")).click();
        

  
         
        
       
       
            
         
        	 
        	 
         
         
      
   }

	
	
       
       
        
        
        
        
      
        
        
     
	}


