package innproj;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class InnotasProj {
    WebDriver driver = new FirefoxDriver();
    Date date = new Date();
    String dte = String.format("%tc", date );
    String proname= "Auto Project "+dte;
    String Bsurl="https://q3.innotas.io";
    
	
	
	@Test	
	public void innoLogin() throws InterruptedException{
              driver.manage().window().maximize();     
              driver.get(Bsurl);
          // display time and date using toString()
              WebElement userName=driver.findElement(By.id("login"));
              userName.sendKeys("v5new6auto");
              WebElement password=driver.findElement(By.id("password"));
              password.sendKeys("innotas");
            //  WebElement submit=driver.findElement(By.xpath(".//*[@id='UserPassForm']/form/button"));
            //  submit.click();
              password.submit();
              Thread.sleep(40000); 
           
	}
	@Test(priority=1)
	public void projcreation() throws InterruptedException{
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
              Thread.sleep(3000); 
              WebElement projecttitle=driver.findElement(By.xpath("//textarea[@name='title']"));
              projecttitle.sendKeys(proname);
              //Thread.sleep(3000); 
              WebElement projectstatus=driver.findElement(By.xpath("//*[@name='LLStatusId']"));
              projectstatus.click();
              WebElement projectstatussel=driver.findElement(By.xpath("//div[contains(text(),'Hold')]"));
              projectstatussel.click();
              WebElement projectsave=driver.findElement(By.xpath("//span[text()='Save']"));
              projectsave.click();
              Thread.sleep(8000); 
              if(driver.findElement(By.xpath("//div[text()='"+proname+"']"))!= null){
            	  System.out.println("1. Project- "+proname+ " Created");
            	  }else{
            	  System.out.println("Project Creation Failed");
            	  }
              
	}
	@Test(priority=2)
public void projectUpdation() throws InterruptedException{
              String pronameupdate= proname+"-Updated";
              WebElement projectdet=driver.findElement(By.xpath("//td/div[text()='Details']"));
              projectdet.click();
              Thread.sleep(3000);
              WebElement projecttitl=driver.findElement(By.xpath("//textarea[@name='title']"));
              projecttitl.sendKeys(Keys.CONTROL + "a");
              projecttitl.sendKeys(Keys.DELETE);
              projecttitl.sendKeys(pronameupdate);
              Thread.sleep(4000);
             
              WebElement projectstart=driver.findElement(By.xpath("//input[@name='startDate']"));
              projectstart.sendKeys("1/8/2016");
              WebElement projecttarget=driver.findElement(By.xpath("//input[@name='targetDate']"));
              projecttarget.sendKeys("30/9/2016");
              Thread.sleep(3000);
              WebElement projectdesc=driver.findElement(By.xpath("//span[text()='Description DD']//ancestor::label//following::div[1]/div/div/div"));
              projectdesc.sendKeys("Following-sibling-Select the following siblings of the context node. Siblings are at the same level of the current node as shown in the below screen. It will find the element after the current node.");
              Thread.sleep(3000);
              WebElement projectobj=driver.findElement(By.xpath("//span[text()='Objective']//ancestor::label//following::div[1]/div/div/div"));
              projectobj.sendKeys("Parent-Selects the parent of the current node as shown in the below screen.");
              Thread.sleep(3000);
              WebElement projectpriority=driver.findElement(By.xpath("//*[@name='LLPriorityId']"));
              projectpriority.sendKeys("1:Immediate");
              Thread.sleep(3000);
            //  WebElement projectprioritysel=driver.findElement(By.xpath("//div[@data-recordindex='3']"));
            //  projectprioritysel.click();
              WebElement projectupdate=driver.findElement(By.xpath("//a[@data-qtip='Save (Ctrl + S)']"));
              projectupdate.click();
              Thread.sleep(3000);
              
              
              if(driver.findElement(By.xpath("//div[text()='"+pronameupdate+"']"))!= null){
            	  System.out.println("2. Project- "+pronameupdate+ " Details Updated");
            	  }else{
            	  System.out.println("Project Updation Failed");
            	  }
              
              
	}
	@Test(priority=3)
	public void projectRoleadd() throws InterruptedException{
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
            /*  if(driver.findElement(By.xpath("//span[text()='(No Resource)']"))!= null){
            	  System.out.println("3. Role Added to Project- "+pronameupdate+ "");
            	  }else{
            	  System.out.println("Role Add Failed");
            	  }
              */
	}
	@Test(priority=4)
	public void Rolefteupdate() throws InterruptedException{
              
              WebElement Rolerightclick=driver.findElement(By.xpath("//span[text()='(No Resource)']"));
              Actions actions = new Actions(driver);    
              Action action=actions.contextClick(Rolerightclick).build(); //pass WebElement as an argument
              action.perform();
              Thread.sleep(3000); 
              WebElement fteeditc=driver.findElement(By.xpath("//span[text()='Edit Allocation']"));
              fteeditc.click();
               WebElement fteedit=driver.findElement(By.xpath("//input[@name='totalFte']"));
              fteedit.sendKeys("1");
              fteedit.sendKeys(Keys.ENTER);
              Thread.sleep(3000); 
              if(driver.findElement(By.xpath("//div[text()='1.00']"))!= null){
            	  System.out.println("4. Headcount updated for Role");
            	  }else{
            	  System.out.println("Headcount update failed");
            	  }
              
	}
	@Test(priority=5)
	public void roleResadd() throws InterruptedException{
              WebElement Rolerightclick2=driver.findElement(By.xpath("//span[text()='(No Resource)']"));
              Actions actions2 = new Actions(driver);    
              Action action2=actions2.contextClick(Rolerightclick2).build(); //pass WebElement as an argument
              action2.perform();
              WebElement Ressel=driver.findElement(By.xpath("//span[text()='Staff Resource(dd) for this Role']"));
              Ressel.click();
              Thread.sleep(3000);
              WebElement Searclik=driver.findElement(By.xpath("//input[@placeholder='Search by name']"));
              Searclik.sendKeys("Full 1");
              Searclik.sendKeys(Keys.ENTER);
              Thread.sleep(3000); 
              WebElement findres1=driver.findElement(By.xpath("//div[text()='Full 1, Auto']"));
              findres1.click();
              WebElement add1=driver.findElement(By.xpath("//span[text()='Add']"));
              add1.click();
              WebElement Searclik2=driver.findElement(By.xpath("//input[@placeholder='Search by name']"));
              Searclik2.sendKeys(Keys.CONTROL + "a");
              Searclik2.sendKeys(Keys.DELETE);
              Searclik2.sendKeys("Full 2");
              Searclik2.sendKeys(Keys.ENTER);
              Thread.sleep(3000); 
              WebElement findres2=driver.findElement(By.xpath("//div[text()='Full 2, Auto']"));
              findres2.click();
              Thread.sleep(3000); 
              WebElement add2=driver.findElement(By.xpath("//span[text()='Add']"));
              add2.click();
              Thread.sleep(3000); 
              WebElement addsel=driver.findElement(By.xpath("//span[text()='Add Selected']"));
              addsel.click();
              Thread.sleep(3000); 
              
              if(driver.findElement(By.xpath("//div[text()='0.50']"))!= null){
            	  System.out.println("5. Two Resources allocated to Role");
            	  }else{
            	  System.out.println("Resource allocation failed");
            	  }
	}
	@Test(priority=6)
	public void addRes() throws InterruptedException{
              WebElement Staffingres=driver.findElement(By.xpath("//span[text()='Add Resource(dd)']"));
              Staffingres.click();
              Thread.sleep(3000);
              WebElement SearResclik=driver.findElement(By.xpath("//input[@placeholder='Search by name']"));
              SearResclik.sendKeys("Resource 5");
              SearResclik.sendKeys(Keys.ENTER);
              Thread.sleep(3000); 
              WebElement Ressel1=driver.findElement(By.xpath("//div[text()='Test, Resource 5']"));
              Ressel1.click();
              WebElement addRes1=driver.findElement(By.xpath("//span[text()='Add']"));
              addRes1.click();
              Thread.sleep(3000);
              WebElement addselres=driver.findElement(By.xpath("//span[text()='Add Selected']"));
              addselres.click();
              Thread.sleep(3000);
              
              if(driver.findElement(By.xpath("//div[text()='Test, Resource 5']"))!= null){
            	  System.out.println("6. Resource staffed to project from Add Resource option");
            	  }else{
            	  System.out.println("Resource staffing failed");
            	  }
	}
	@Test(priority=7)
	public void addresfteupdate() throws InterruptedException{
              
              WebElement Resrightclick2=driver.findElement(By.xpath("//div[text()='Test, Resource 5']"));
              Actions actions3 = new Actions(driver);    
              Action action3=actions3.contextClick(Resrightclick2).build(); //pass WebElement as an argument
              action3.perform();
              WebElement fteres=driver.findElement(By.xpath("//span[text()='Edit Allocation']"));
              fteres.click();
              WebElement fteeditres=driver.findElement(By.xpath("//input[@name='totalFte']"));
              fteeditres.sendKeys("2");
              fteeditres.sendKeys(Keys.ENTER);
              Thread.sleep(7000);
              if(driver.findElement(By.xpath("//div[text()='2.00']"))!= null){
            	  System.out.println("7. FTE Updated for staffed resource");
            	  }else{
            	  System.out.println("Resource FTE updation failed");
            	  }
              
	}
	@Test(priority=8)
	public void addUpdatebillingrate() throws InterruptedException
	{ 
		WebElement billpage=driver.findElement(By.xpath("//div[text()='Billing Rates(dd)']"));
		billpage.click();
		Thread.sleep(3000);
		 WebElement bilnew=driver.findElement(By.xpath("(//span[text()='New'])[2]"));
		 bilnew.click();
		  WebElement bilclick=driver.findElement(By.xpath("(//div[text()='New Billing Rate(dd)'])[1]"));
		  bilclick.click();
		  WebElement titleclear=driver.findElement(By.xpath("//input[@name='title']"));
		  titleclear.sendKeys(Keys.DELETE);
		  titleclear.sendKeys("Auto Bill Rate");
		  titleclear.sendKeys(Keys.TAB);
		    WebElement rateclear=driver.findElement(By.xpath("//input[@name='rate']"));
		    rateclear.sendKeys(Keys.DELETE);
		    rateclear.sendKeys("720");
		     rateclear.sendKeys(Keys.ENTER);
	}
	@Test(priority=9)
	public void Tasks() throws InterruptedException
	{ 
		WebElement taskpage=driver.findElement(By.xpath("(//div[contains(text(),'Tasks(dd)')])[1]"));
		taskpage.click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		 Thread.sleep(25000);
		WebElement newtask=driver.findElement(By.xpath("//span[text()='New']"));
		
		newtask.click();
		WebElement newtaskcat=driver.findElement(By.xpath("//span[text()='New Task(dd) at End']"));
		
		newtaskcat.click();
		
		
		WebElement newTaskTitle=driver.findElement(By.xpath("//input[@name='title']"));
		newTaskTitle.sendKeys(Keys.DELETE);
		newTaskTitle.sendKeys("Auto Task 1");
	WebElement newTaskDur=driver.findElement(By.xpath("//input[@name='durationString']"));
	newTaskDur.sendKeys(Keys.DELETE);
	newTaskDur.sendKeys("10");	
	newTaskDur.sendKeys(Keys.ENTER);
              driver.close();
			
	}	

	}


