package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop{
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("C:\\Users\\PAVAN\\Downloads\\Drag and Drop.html");
        
        WebElement dr = driver.findElement(By.id("drag1"));
        WebElement dp = driver.findElement(By.id("draghere"));
        
        Thread.sleep(2000);
        
        Actions a = new Actions (driver);
        a.dragAndDrop(dr, dp).perform();
        
        
        

  
         
        
       
       
            
         
        	 
        	 
         
         
      
   }

	
	
       
       
        
        
        
        
      
        
        
     
	}


