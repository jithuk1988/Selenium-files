package innproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import bsh.Console;

import java.util.Date;

public class InnotasProj {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			  WebDriver driver = new FirefoxDriver();
			  driver.manage().window().maximize();
			  String Bsurl="https://q3.innotas.io";
			  driver.get(Bsurl);
			  WebElement userName=driver.findElement(By.id("login"));
			  userName.sendKeys("v5new6auto");
			  WebElement password=driver.findElement(By.id("password"));
			  password.sendKeys("innotas");
			//  WebElement submit=driver.findElement(By.xpath(".//*[@id='UserPassForm']/form/button"));
			//  submit.click();
			  password.submit();
			  Thread.sleep(40000); 
			  WebElement projecttop=driver.findElement(By.xpath("//a[@href='home.pa#%5BT5%5D']"));
			  projecttop.click();
			  Thread.sleep(8000); 
			  WebElement projectnew=driver.findElement(By.xpath("//span[text()='New' and starts-with(@id,'button')]"));
			  projectnew.click();
			  Thread.sleep(3000); 
			  WebElement projectcat=driver.findElement(By.xpath("//input[starts-with(@id,'richcombo') and @name='categoryId']"));
			  projectcat.click();
			  WebElement projectcatsel=driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Auto Category')]"));
			  projectcatsel.click();
			//  Thread.sleep(3000); 
			  WebElement projectdep=driver.findElement(By.xpath(".//input[starts-with(@id,'richcombo') and @name='parentId']"));
			  projectdep.click(); 
			  WebElement projectdepsel=driver.findElement(By.xpath("//*[@class='x-list-plain']/li[contains(text(),'Program 00')]"));
			  projectdepsel.click();
			  WebElement projectdate=driver.findElement(By.xpath("//input[starts-with(@id,'datefield')]"));
			  projectdate.click();
			  WebElement projectnext=driver.findElement(By.xpath("//span[text()='Next']"));
			  projectnext.click();
			  Thread.sleep(2000);
			  Date date = new Date();
			  String currdate=date.toString();
			  String projName="AutoProject-"+currdate;
			  System.out.println(projName);
			  WebElement projecttitle=driver.findElement(By.xpath("//textarea[@name='title']"));
			  projecttitle.sendKeys(projName);
			  //Thread.sleep(3000); 
			  WebElement projectstatus=driver.findElement(By.xpath("//*[@name='LLStatusId']"));
			  projectstatus.click();
			  WebElement projectstatussel=driver.findElement(By.xpath("//div[contains(text(),'Hold')]"));
			  projectstatussel.click();
			  WebElement projectsave=driver.findElement(By.xpath("//span[text()='Save']"));
			  projectsave.click();
			  Thread.sleep(8000); 
			  WebElement projectdet=driver.findElement(By.xpath("//td/div[text()='Details']"));
			  projectdet.click();
			  Thread.sleep(4000);
			  WebElement projectstart=driver.findElement(By.xpath("//input[@name='startDate']"));
			  projectstart.sendKeys("1/8/2016");
			  WebElement projecttarget=driver.findElement(By.xpath("//input[@name='targetDate']"));
			  projecttarget.sendKeys("30/9/2016");
			  
			  
			  WebElement projectdesc=driver.findElement(By.xpath("//span[text()='Description DD']//ancestor::label//following::div[1]/div/div/div"));
			  projectdesc.sendKeys("Following-sibling-Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen. It will find the element after the current node.");
			   
			  WebElement projectobj=driver.findElement(By.xpath("//span[text()='Objective']//ancestor::label//following::div[1]/div/div/div"));
			  projectobj.sendKeys("Parent-Selects the parent of the current node as shown in the below screen.");
			  
			  WebElement projectpriority=driver.findElement(By.xpath("//*[@name='LLPriorityId']"));
			  projectpriority.sendKeys("1:Immediate");
			  Thread.sleep(3000);
			//  WebElement projectprioritysel=driver.findElement(By.xpath("//div[@data-recordindex='3']"));
			//  projectprioritysel.click();
			   WebElement projectupdate=driver.findElement(By.xpath("//a[@data-qtip='Save (Ctrl + S)']"));
			  projectupdate.click();
			  Thread.sleep(3000);
			  WebElement projectstaffing=driver.findElement(By.xpath("//td/div[text()='Staffing']"));
			  projectstaffing.click();
			  Thread.sleep(7000);
			  WebElement Staffingrole=driver.findElement(By.xpath("//span[text()='Add Role']"));
			  Staffingrole.click();
			  Thread.sleep(3000);
			  WebElement Rolesel=driver.findElement(By.xpath("//tr/td/div[text()='AutoRole']"));
			  Rolesel.click();
			  Thread.sleep(3000);
			  WebElement RoleAdd=driver.findElement(By.xpath("//span[text()='Add']"));
			  RoleAdd.click();
			  Thread.sleep(3000);
			  WebElement RoleAddSave=driver.findElement(By.xpath("//span[text()='Add Selected']"));
			  RoleAddSave.click();
			  Thread.sleep(3000);
			  driver.close(); 
			
		}

	}


