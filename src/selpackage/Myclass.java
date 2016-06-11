package selpackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myclass {
	
	   public static void main(String[] args)
	   
	   {
	   
		   	
		   	  String FilePath = "f://filepath.xls";
	          FileInputStream fs = null;
	          String username=null;
	          String password=null;
	          String urladdress=null;
	          String tcid=null;
	          String tcname=null;
	          String fuctionality=null;
	          String priority=null;
	          String author=null;
	          String field=null;
	          try	 
	          {
	        	  fs = new FileInputStream(FilePath);
	          } 
	          catch (FileNotFoundException e) 
	          {
	        	  e.printStackTrace();
	          }
	          try 
	          {
	        	  Workbook wb = Workbook.getWorkbook(fs);
	        	  //Sheet sh = wb.getSheet(0);
	        	  Sheet weburl = wb.getSheet("url");
	        	  urladdress = weburl.getCell(1,0).getContents();
	        	  System.out.println(urladdress);
	        	  Sheet tcdetail = wb.getSheet("TC-Details");
	        	  tcid = tcdetail.getCell(1,0).getContents();
	        	  System.out.println(tcid);
	        	  tcname = tcdetail.getCell(1,1).getContents();
	        	  System.out.println(tcname);
	        	  fuctionality = tcdetail.getCell(1,2).getContents();
	        	  System.out.println(fuctionality);
	        	  author= tcdetail.getCell(1,3).getContents();
	        	  System.out.println(author);
	        	  priority = tcdetail.getCell(1,4).getContents();
	        	  System.out.println(priority);
	        	  field = tcdetail.getCell(1,5).getContents();
	        	  System.out.println(field);
	        	   Sheet fieldvalue = wb.getSheet("Fields-values");
	        	  username=fieldvalue.getCell(0,1).getContents();
	        	  System.out.println(username);
	        	  password=fieldvalue.getCell(1,1).getContents();
	        	  System.out.println(password);
	          } 
	          catch (BiffException e) 
	          {
	        	  e.printStackTrace();
	          }
	          catch (IOException e)
	          {
	        	  e.printStackTrace();
	          }
	      
	       // String Urladd="https://www.sabarimalaaccomodation.com/ver1/generalpubliclogin.aspx";
	          WebDriver driver = new FirefoxDriver();
	          driver.get(urladdress);
	          System.out.println(driver.getTitle());
	          
	      //    WebElement user=driver.findElement(By.id("ContentPlaceHolder1_txtusername"));   //Element Id of Username field
	         WebElement user=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtusername']")); 
	          user.sendKeys("jithuk1988");
	      //   WebElement pass=driver.findElement(By.id("ContentPlaceHolder1_txtpassword"));   //Element Id of Password field
	          WebElement pass=driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtpassword']"));
	          pass.sendKeys("ultimate");
	          driver.findElement(By.id("ContentPlaceHolder1_btnlogin")).click();
	          WebDriverWait newwait=new WebDriverWait(driver, 2);
	          if(driver.getPageSource().contains("WELCOME")&&driver.getPageSource().contains("JITHU") )
	          	{
	        	  	System.out.println("Welcome Page Loaded correctly");
	          	}
	          else
	          	{
	        	  	System.out.println("Welcome Page not loaded fully");
	          	}
	    
	          driver.close();
	  
	      }

}

