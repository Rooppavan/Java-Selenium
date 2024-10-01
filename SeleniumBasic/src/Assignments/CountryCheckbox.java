package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryCheckbox{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("C:\\Users\\PAVAN\\Downloads\\Country Check box.html");
        
//        WebElement listbox  = driver.findElement(By.name("Location"));
//        
//       List <WebElement> kk = driver.findElements(By.xpath("/html/body/form/input[1]"));
       
       for(int i=1;i<=5;i++) {
    	   driver.findElement(By.xpath("/html/body/form/input["+i+"]")).click();
       }
        
        
  
         
        
       
       
            
         
        	 
        	 
         
         
      
   }

	
	
       
       
        
        
        
        
      
        
        
     
	}


