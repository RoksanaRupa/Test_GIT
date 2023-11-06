package NEXTeTICKET_Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class NEXTeTICKET_Base {
	
	
	
	public static WebDriver driver;
	public static Properties NetPro; 
	
	public  NEXTeTICKET_Base() {
		try {
			FileInputStream boiFle = new FileInputStream(System.getProperty("user.dir")+  ("//src//test//java//NEXTeTICKET_Config//NEXTeTICKET_Config.Properties" ));
			 NetPro = new Properties();
			 NetPro.load(boiFle);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Please, Look The code");
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		public void NetBrowser() {
		String NetAllBrowser =	NetPro.getProperty("NetBrowser1");
		
		if(NetAllBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+("//NEXTeTICKET_ChromeDriver//chromedriver.exe"));
			ChromeOptions flower = new ChromeOptions(); 
			flower.addArguments("--remote-allow-origins=*");
		    driver = new ChromeDriver();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utility.pageloadtimeout));
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utility.implicitlyWait));
			driver.manage().window().maximize();
		}
			
		
		else if (NetAllBrowser.equalsIgnoreCase("Edge")) {
			System.setProperty("WebDriver.edge.driver",System.getProperty("user.dir")+("//NEXTeTICKET_EdgeDriver//msedgedriver.exe"));
			EdgeOptions flower1 = new EdgeOptions(); 
			flower1.addArguments("--remote-allow-origins=*");
		    driver = new EdgeDriver();
		    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(NEXTeTICKET_Utility.pageloadtimeout));
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(NEXTeTICKET_Utility.implicitlyWait));
			driver.manage().window().maximize();
			
			
		}

		}
      public static void NetLaunchURL(String URL) {
    	  
    	  driver.get(NetPro.getProperty("NetURL"));
    	  
      }
	

}


