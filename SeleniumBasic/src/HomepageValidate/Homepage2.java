package HomepageValidate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage2{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
        driver.findElement(By.name("txtUserName")).sendKeys("selenium");
        String s = driver.getTitle();
        if(s.equals("OrangeHRM - New Level of HR Management")) {
        	System.out.println("login page is validated"+s);
        }
        else {
        	System.out.println("login page is invalidated");
        }
        	
       
        driver.findElement(By.name("txtPassword")).sendKeys("selenium");
        
       driver.findElement(By.name("Submit")).click();
       
       String ps = driver.getTitle();
       
        if(ps.equals("OrangeHRM")) {
        	System.out.println("login page is validated:" + ps);
        }
        else {
        	System.out.println("login page is invalidated");
        }
        	
        
	}
}
        

	

