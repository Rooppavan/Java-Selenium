package Testcasespack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Reusedmethods extends Excutetestcases{

		
		public WebElement xp(String a)
		{
			return  driver.findElement(By.xpath(obj.getProperty(a)));
		}
		
		public void t(int x) throws InterruptedException
		{
			int a = 1000*x;
			Thread.sleep(a);
		}
		
		public void screen  (String p) throws IOException {
			
			File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File T = new File("C:\\Users\\PAVAN\\Desktop\\Screenshot\\"+ p +".jpg");
			FileHandler.copy(s, T);
		}

	}


