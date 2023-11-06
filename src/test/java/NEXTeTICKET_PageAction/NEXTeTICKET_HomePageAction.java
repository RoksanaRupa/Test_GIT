package NEXTeTICKET_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import NEXTeTICKET_PageLocator.NEXTeTICKET_HomePageLocator;
import NEXTeTICKET_Utility.NEXTeTICKET_Base;
import NEXTeTICKET_Utility.NEXTeTICKET_TestData;
import NEXTeTICKET_Utility.NEXTeTICKET_Utility;

public class NEXTeTICKET_HomePageAction extends NEXTeTICKET_Base {

	NEXTeTICKET_HomePageLocator net_homePageLocator = new NEXTeTICKET_HomePageLocator();
	
	public void scrolldowninhomepageuntilTicketinfo() throws Exception {
		
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("scroll(0,7500)");
	
	}
	
	public void VerifyusercanseeTicketinfoinhomepage() throws Exception {
		Thread.sleep(3000);
		boolean verifyTicket = net_homePageLocator.Ticketinfo.isDisplayed();
		Assert.assertTrue(verifyTicket);	
	}
	
	public void scrolldowntilSubscribeToNewsletterarea() throws Exception {
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,8300)");
	
	}
	
	public void verifySubscribeToNewsletterisdisplayinginhomepagefooter() throws Exception {
	Thread.sleep(3000);	
	boolean verifySTNL = net_homePageLocator.SubNewsLetter.isDisplayed();
	Assert.assertTrue(verifySTNL);	
	}
	
	public void VerifyEmailfieldisdisplayinginSubscribeToNewsletter() throws Exception {
	Thread.sleep(3000);	
	boolean verifyEmail	= net_homePageLocator.SubNewsEmail.isDisplayed();
	Assert.assertTrue(verifyEmail);	
	}
	
	public void VerifysendbuttonisdisplayinginSubscribeToNewsletter() throws Exception {
		Thread.sleep(3000);
		boolean verifysendbutton = net_homePageLocator.Sendbutton.isDisplayed();
		Assert.assertTrue(verifysendbutton);	
		
	}
	
	public void Entervalidemailaddressandclicksendbutton(String E) throws Exception {
		
		net_homePageLocator.SubNewsEmail.sendKeys(E);
		Thread.sleep(3000);
		net_homePageLocator.Sendbutton.click();
		Thread.sleep(3000);
	}
	
	public void VerifysuccessmessageYoursubmissionwassuccessfulappearedwhensendwithemail() throws Exception {
		
	Thread.sleep(3000);	
	boolean verifySuccessmsg = 	net_homePageLocator.successmessage.isDisplayed();
	Assert.assertTrue(verifySuccessmsg);
	
	NEXTeTICKET_Utility.takeMyScreenshot(driver, "verifySuccessmsg");
	
	}

	public void skipemailaddressandclicksendbutton() throws Exception {
		
		net_homePageLocator.SubNewsEmail.sendKeys(NEXTeTICKET_TestData.skipemail);
		Thread.sleep(3000);
		net_homePageLocator.Sendbutton.click();
		
	}
		
	public void VerifyerrormessagePleasefilloutthisfieldappearedwhensendwithoutemail() throws Exception {	
		
	Thread.sleep(3000);	
	boolean verifyErrormsg = net_homePageLocator.Errormesssage.isDisplayed();
	Assert.assertTrue(verifyErrormsg);
	
	NEXTeTICKET_Utility.takeMyScreenshot(driver, "verifyErrormsg");	
	}
	
}
