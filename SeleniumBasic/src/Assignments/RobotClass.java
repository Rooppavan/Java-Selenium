package Assignments;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass{

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
        driver.findElement(By.name("txtUserName"))
        .sendKeys("selenium");
        driver.findElement(By.name("txtPassword"))
        .sendKeys("selenium");
        driver.findElement(By.name("Submit")).click();
        
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a"))).perform();
        
        driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a")).click();
        
        driver.switchTo().frame(driver.findElement(By.name("rightMenu")));
        
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("txtEmployeeId")).clear();
        
        driver.findElement(By.id("txtEmployeeId")).sendKeys("12354");
        driver.findElement(By.id("txtEmpLastName")).sendKeys("last");
        driver.findElement(By.name("txtEmpFirstName")).sendKeys("fst");
        driver.findElement(By.id("txtEmpMiddleName")).sendKeys("middle");
        driver.findElement(By.id("txtEmpNickName")).sendKeys("nick");
       
        Thread.sleep(2000);
        
        a.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
        
        Thread.sleep(2000);
        
        StringSelection ss = new StringSelection("C:\\Users\\PAVAN\\Pictures\\wp7429902-karma-logo-wallpapers.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        Thread.sleep(2000);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
        
        driver.findElement(By.xpath("/html/body/div[5]/input")).click();
        
        driver.switchTo().defaultContent();
        
        a.moveToElement(driver.findElement(By.xpath("//*[@id=\"pim\"]/a"))).perform();
      
        
        
       
       
        
        
        
     
	}

}
