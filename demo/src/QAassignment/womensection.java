package QAassignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class womensection
{
	WebDriver driver;
	@FindBy(xpath="//a[@class='sf-with-ul']") private WebElement women;
	
	@FindBy(xpath="(//img[@class='replace-2x img-responsive'])[2]")private WebElement view;
	@FindBy(xpath="//a[@data-field-qty='qty'])[2]")private WebElement quantity1;
	@FindBy(xpath="//div[@class='box-cart-bottom']")private WebElement addcart1;
	//@FindBy(xpath="//button[@name='Submit']")private WebElement addcart1;
	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")private WebElement proceed;
	
	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']")private WebElement proceedcnt;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")private WebElement proceedcheck;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement selectcheckbox;
	@FindBy(xpath="//button[@class='button btn btn-default standard-checkout button-medium']")private WebElement proceedcheck1;
	
	@FindBy(xpath="//a[@class='bankwire']")private WebElement pay;
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")private WebElement confromorder;
	@FindBy(xpath="//span[text()='jon shon']")private WebElement profile;
	@FindBy(xpath="//span[text()='Order history and details']")private WebElement orders;
	@FindBy(xpath="//a[@class='logout']")private WebElement signout;
	
	public womensection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickwomensection() throws InterruptedException
	{
		women.click();
		//JavascriptExecutor driver = null;
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 5000)","");
		//Thread.sleep(2000);
	}
	public void clickwomensectionview() throws InterruptedException
	{
		view.click();
		Thread.sleep(2000);
	}
	public void clickwomensectionquantity() throws InterruptedException
	{
		
		Thread.sleep(3000);
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//driver.switchTo().frame("fancybox-iframe");
		//Actions act=new Actions(driver);
		//act.moveToElement(quantity1).perform();
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(quantity1));
		Thread.sleep(3000);
		quantity1.click();
		
	}
public void clickwomensectionaddcart()
	{
	//addcart1.click();
	
Actions act=new Actions(driver);
act.moveToElement(addcart1).click().perform();
	
	}
	public void clickwomensectionproceedchk()
	{
		proceed.click();
	}
	
	public void clickwomensectionproceedcontinue()
	{
		proceedcnt.click();
	}
	public void clickwomensectionproceedcheckout()
	{
		proceedcheck.click();
	}
	public void clickwomensectioncheckbox()
	{
		selectcheckbox.click();
	}
	public void clickwomensectionproceedcheck()
	{
		proceedcheck1.click();
	}
	
	public void clickwomensectionpayment()
	{
		pay.click();
	}
	public void clickwomensectionconfromorder()
	{
		confromorder.click();
	}
	public void clickwomensectionprofile()
	{
		profile.click();
		
	}
	public void clickwomensectionordershistory()
	{
		orders.click();
	}
	public void clickwomensectionsignout()
	{
		signout.click();
	}
	}
	

