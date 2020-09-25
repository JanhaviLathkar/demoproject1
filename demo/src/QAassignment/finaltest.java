package QAassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class finaltest {
WebDriver driver;
createaccount page1;
loginnew   page2;
womensection  page3;

	@BeforeClass
		public void CreateAcc()
		{
			Reporter.log("createaccount",true);
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			page1=new createaccount(driver);
			page2=new loginnew(driver);
			page3=new womensection(driver);
		
			page1.clickloginnewsignin();
			page1.setcreateaccountemailcreateemail("joshon1901189@gmail.com");
			page1.clickcreateaccountemailcreatebutton();
			page1.setcreateaccountemailcreatefirstname("jon");
			page1.setcreateaccountemailcreatelastname("shon");
			page1.setcreateaccountemailcreatepassword("jooshon12345");
			page1.setcreateaccountemailcreateaddress("WALL STREET");
			page1.setcreateaccountemailcreatecity("NEW YORK");
			page1.setcreateaccountemailcreatestate("2");
			page1.setcreateaccountemailcreatepostcode("10043");
			page1.setcreateaccountemailcreatecountry("United States");
			page1.setcreateaccountemailcreatephoneno("8976543213");
			page1.setcreateaccountemailcreatemobileno("9999999999");
			page1.setcreateaccountemailcreateadd1("WALL STREET");
			page1.clickcreateaccountemailcreatsubeacc();
			page1.clickcreateaccountsignout();
		}
	@BeforeMethod
	public void logintoapp()
	{
		Reporter.log("Login with new credentials",true);
		page2.setloginnewsignin();
		page2.setloginnewemail("joshon1901189@gmail.com");
		page2.setloginnewpwd("jooshon12345");
		page2.clickloginnewsubmitlogin();
	}
	@Test
	public void womensection() throws InterruptedException
	{
		Reporter.log("Go to women section",true);
		page3.clickwomensection();
		
				//JavascriptExecutor js=(JavascriptExecutor)driver;
				//js.executeScript("window.scrollBy(0, 5000)","");
				//Thread.sleep(2000);
		page3.clickwomensectionview();
		
		
		//Actions act=new Actions(driver);
	//act.moveToElement(addcart1).click().perform();
	//WebElement addcart1 = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'])[2]"));
	//act.moveToElement(addcart1).click().perform();
	  //driver.findElement(By.xpath("//button[@name='Submit']")).click();
	
		//page3.clickwomensectionaddcart();
		//page3.clickwomensectionproceedchk();
		//Thread.sleep(4000);
		//driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		//driver.findElement(By.xpath("(//a[@data-field-qty='qty'])[2]")).click();
		page3.clickwomensectionquantity();
		
		//driver.switchTo().frame("fancybox-iframe");
		//Thread.sleep(2000);
		//WebElement addcart1 = driver.findElement(By.xpath("//img[@class='replace-2x img-responsive'])[2]"));
		//Actions act=new Actions(driver);
		//act.moveToElement(addcart1).click().perform();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
		//page3.clickwomensectionaddcart();
		
				page3.clickwomensectionproceedchk();
				
		page3.clickwomensectionproceedcontinue();
		page3.clickwomensectionproceedcheckout();
		page3.clickwomensectioncheckbox();
		page3.clickwomensectionproceedcheck();
		page3.clickwomensectionpayment();
		page3.clickwomensectionconfromorder();
		page3.clickwomensectionprofile();
		page3.clickwomensectionordershistory();
		page3.clickwomensectionsignout();
	}
	@AfterMethod
	public void logoutapp()
	{
		Reporter.log("Logout from app",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("close browser,true");
		//driver.close();
		
		
		
	}
	
	
	
		
		

	}


