package QAassignment;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createaccount {
		
	@FindBy(xpath="//div[@class='header_user_info']") private WebElement signin;
       @FindBy(xpath="//input[@name='email_create']")private WebElement emailid;
      
		@FindBy(xpath="//button[@name='SubmitCreate']")private WebElement submitcreate;
   
    @FindBy(xpath="//input[@name='customer_firstname']")private WebElement firstname; 
    
    @FindBy(xpath="//input[@name='customer_lastname']")private WebElement lastname;
    
    @FindBy(xpath="//input[@name='passwd']")private WebElement password;
   // driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("joooshon123456");
  
    		 @FindBy(xpath="//input[@name='address1']")private WebElement address;
    //driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("WALL STREET");
    		 @FindBy(xpath="//input[@name='city']")private WebElement city;
    //driver.findElement(By.xpath("//input[@name='city']")).sendKeys("NEW YORK");
    		 
    		 @FindBy(xpath="//select[@name='id_state']")private WebElement state1;
   // WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
    //Select s1=new Select(state);
    //s1.selectByIndex(2);
  
    //driver.findElement(By.xpath("//input[@name='postcode']")).sendKeys("10043");
    		 
    		 @FindBy(xpath="//input[@name='postcode']")private WebElement postcode;
    		 
    		 //WebElement country = driver.findElement(By.xpath("//select[@name='id_country']"));
    		 //Select s1=new Select(country);
    		 //s1.selectByVisibleText("United States");
    		 @FindBy(xpath="//select[@name='id_country']")private WebElement country;
    		 
 @FindBy(xpath="//input[@name='phone']")private WebElement phoneno;
   // driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8976543213");
 @FindBy(xpath="//input[@name='phone_mobile']")private WebElement mobileno;
    //driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("9999999999");
    
 @FindBy(xpath="//input[@name='alias']")private WebElement address1;
 //driver.findElement(By.xpath("//input[@name='alias']")).sendKeys("WALL STREET");
 @FindBy(xpath="//button[@name='submitAccount']")private WebElement submitacc;
    //driver.findElement(By.xpath("//button[@name='submitAccount']")).click();
 @FindBy(xpath="//a[@class='logout']")private WebElement signout;
	
    //Thread.sleep(5000);
 public createaccount(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
	 }
	 
 public void clickloginnewsignin()
	{
		signin.click();
	}
 public void setcreateaccountemailcreateemail(String emailidno)
 {
	 emailid.sendKeys(emailidno);
	 }

 public void clickcreateaccountemailcreatebutton()
 {
	 submitcreate.click();
	 }
 public void setcreateaccountemailcreatefirstname(String fist)
 {
	 firstname.sendKeys(fist);
	 }
 public void setcreateaccountemailcreatelastname(String last)
 {
	 lastname.sendKeys(last);
	 }
 public void setcreateaccountemailcreatepassword(String pwd)
 {
	 password .sendKeys(pwd);
	 
	 }
 
 public void setcreateaccountemailcreateaddress(String addr)
 {
	 address.sendKeys(addr);
	 
	 }
 public void setcreateaccountemailcreatecity(String cityy)
 {
	 city.sendKeys(cityy);
	 }
 public void setcreateaccountemailcreatestate(String state12)
 {
	 Select s1=new Select(state1);
	    s1.selectByIndex(2);
	 state1.sendKeys(state12);
	 }
 public void setcreateaccountemailcreatepostcode(String post)
 {
	 postcode.sendKeys(post);
	 }

 public void setcreateaccountemailcreatecountry(String coutry)
 {
	 country.sendKeys(coutry);
	 }
 public void setcreateaccountemailcreatephoneno(String phonno)
 {
	 phoneno.sendKeys(phonno);
	 }

 public void setcreateaccountemailcreatemobileno(String mobilenoo)
 {
	 mobileno.sendKeys(mobilenoo);
	 }

 public void setcreateaccountemailcreateadd1(String addresss)
 {
	 address1.sendKeys(addresss);
	 }
 public void clickcreateaccountemailcreatsubeacc()
 {
	 submitacc.click();
	
	 }
 public void clickcreateaccountsignout()
 {
	 signout.click();
	
	 }
 
}
    