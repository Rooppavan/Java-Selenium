package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountryChecklist{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("C:\\Users\\PAVAN\\Downloads\\Country Name.Html");
        
       WebElement listbox =driver.findElement(By.id("Dropdown"));
        
       List<WebElement> kk = listbox.findElements(By.tagName("option"));
       
       //Select s = new Select(listbox);
       for(int i=1;i<=kk.size();i++) {
    	   
    	   driver.findElement(By.xpath("//*[@id=\"Dropdown\"]/option["+i+"]")).click();
    	   Thread.sleep(2000);
       }
       
       
        
        
        
        
      
        
        
     
	}

}
