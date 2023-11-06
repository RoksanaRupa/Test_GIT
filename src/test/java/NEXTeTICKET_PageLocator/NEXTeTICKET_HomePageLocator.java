package NEXTeTICKET_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import NEXTeTICKET_Utility.NEXTeTICKET_Base;

public class NEXTeTICKET_HomePageLocator extends NEXTeTICKET_Base {

	public NEXTeTICKET_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//body[1]/div[2]/section[11]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/h3[1]")
	public WebElement Ticketinfo;
	
	@FindBy(xpath="//h2[text()='SUBSCRIBE TO NEWSLETTER']")
	public WebElement SubNewsLetter ;
	
	@FindBy(id="form-field-email")
	public WebElement SubNewsEmail;
	
	@FindBy(xpath="//span[text()='Send']")
	public WebElement Sendbutton;
	
	@FindBy(xpath="/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div/div[2]/button/span")
	public WebElement Errormesssage ;
	
	@FindBy(xpath="/html/body/div[2]/section[13]/div/div/div/div[4]/div/form/div[2]")
	public WebElement successmessage;
	
	
}
