package Testcasespack;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basepack.BaseClass;

public class Excutetestcases extends BaseClass{
  @Test
  public void Testcases() throws InterruptedException, AWTException, IOException {
	  
	  Scripting s = new Scripting();
	  s.Login();
	  //s.addone();
	  s.addoneexcel();
  }
}
