package handlingframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
        driver.findElement(By.name("txtUserName"))
        .sendKeys("selenium");
        driver.findElement(By.name("txtPassword"))
        .sendKeys("selenium");
        driver.findElement(By.name("Submit")).click();
        
        driver.switchTo().frame(0);
        
        driver.findElement(By.id("loc_code")).click();
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(3000);
        
        driver.findElement(By.linkText("Logout")).click();
        
        
        
        
     
	}

}
