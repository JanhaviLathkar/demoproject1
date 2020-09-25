package QAassignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginnew {

	@FindBy(xpath="//a[@class='login']") private WebElement signin;
	@FindBy(xpath="//input[@name='email']") private WebElement email;
	@FindBy(xpath="//input[@name='passwd']") private WebElement pwd;
	@FindBy(xpath="//button[@name='SubmitLogin']") private WebElement submitlogin;
   
	
	public loginnew (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setloginnewsignin()
	{
		signin.click();
	}
	public void setloginnewemail(String emailid)
	{
		email.sendKeys("emailid");
	}
	public void setloginnewpwd(String password)
	{
		pwd.sendKeys("password");
	}
	public void clickloginnewsubmitlogin()
	{
		submitlogin.click();
	}

}
