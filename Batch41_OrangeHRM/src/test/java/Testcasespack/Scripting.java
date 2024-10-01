package Testcasespack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Scripting extends Reusedmethods{
	
   public void Login()
   {
	   driver.get(obj.getProperty("URL"));
	   xp("XUN").sendKeys(obj.getProperty("UN"));
	   xp("XPWD").sendKeys(obj.getProperty("PWD"));
	   xp("XSUB").click();
	  
   }
   public void addone() throws InterruptedException, AWTException, IOException
   {
	   t(2);
	   
	   Actions A = new Actions(driver);
	   
	   A.moveToElement(xp("XPIM")).perform();
	   
	   xp("XAE").click();
	  
	   
	   driver.switchTo().frame(xp("XFRAME"));
	   
	   t(2);
	   
	   xp("XCODE").clear();
	   
	   xp("XCODE").sendKeys("7286");
	   xp("XLAST").sendKeys("Last");
	   xp("XFIRST").sendKeys("first");
	   xp("XMID").sendKeys("middle");
	   xp("XNICK").sendKeys("nickname");
	   
	   A.moveToElement( xp("XPHOTO")).click().perform();
	   
	   StringSelection ss = new StringSelection("C:\\Users\\PAVAN\\Downloads\\WhatsApp Image 2024-01-18 at 3.44.59 PM.jpeg");
	   
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  t(2);
	  
	  Robot r = new Robot();
	  
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_V);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_V);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 screen("beforesave");
	 xp("XSAVE").click();
	 t(2);
	 screen("Aftersave");
	 xp("XBACK").click();
	 screen("afteradd");
	 driver.switchTo().defaultContent();
	 
	 
	 
	 
	 
	   
   }
   public void addoneexcel() throws InterruptedException, AWTException, IOException
   {
	   t(2);
	   FileInputStream fis = new FileInputStream("C:\\Users\\PAVAN\\eclipse-workspace_1\\Batch41_OrangeHRM\\src\\data\\java\\packdata\\Testdata.xlsx");
	   
	   XSSFWorkbook w = new XSSFWorkbook(fis);
	   
	   XSSFSheet sht = w.getSheet("data");
	   
	   int eid =  (int)sht.getRow(0).getCell(0).getNumericCellValue();
	   String efrist = sht.getRow(1).getCell(1).getStringCellValue();
	   String elast = sht.getRow(1).getCell(2).getStringCellValue();
	   String emid = sht.getRow(1).getCell(3).getStringCellValue();
	   String enick = sht.getRow(1).getCell(4).getStringCellValue();
	   
	   Actions A = new Actions(driver);
	   
	   A.moveToElement(xp("XPIM")).perform();
	   
	   xp("XAE").click();
	  
	   
	   driver.switchTo().frame(xp("XFRAME"));
	   
	   t(2);
	   
	   xp("XCODE").clear();
	   
	   xp("XCODE").sendKeys(String.valueOf(eid));
	   xp("XLAST").sendKeys(elast);
	   xp("XFIRST").sendKeys(efrist);
	   xp("XMID").sendKeys(emid);
	   xp("XNICK").sendKeys(enick);
	   
	   A.moveToElement( xp("XPHOTO")).click().perform();
	   
	   StringSelection ss = new StringSelection("C:\\Users\\PAVAN\\Downloads\\WhatsApp Image 2024-01-18 at 3.44.59 PM.jpeg");
	   
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	  t(2);
	  
	  Robot r = new Robot();
	  
	 r.keyPress(KeyEvent.VK_CONTROL);
	 r.keyPress(KeyEvent.VK_V);
	 r.keyRelease(KeyEvent.VK_CONTROL);
	 r.keyRelease(KeyEvent.VK_V);
	 r.keyPress(KeyEvent.VK_ENTER);
	 r.keyRelease(KeyEvent.VK_ENTER);
	 
	 screen("beforesave");
	 xp("XSAVE").click();
	 t(2);
	 screen("Aftersave");
	 xp("XBACK").click();
	 screen("afteradd");
	 driver.switchTo().defaultContent();
	 
	 
	 
	 
	 
	   
   }
    
   

}
