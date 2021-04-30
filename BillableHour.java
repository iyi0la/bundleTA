package BundleApp;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BillableHour {
	
static AppiumDriver<MobileElement> driver;
	
	public static void main(String[] args) {
		try{
			openBillable();
		}
		catch(Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
}
	public static void openBillable() throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		  
		cap.setCapability("deviceName", "SM A307FN");
		cap.setCapability("udid", "RZ8MA1WBZEW");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "10");
		cap.setCapability("appPackage", "com.bundle.billable_hours_app");
		cap.setCapability("appActivity", "com.bundle.billable_hours_app.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		
		System.out.println("Application Started...");
		
	}
}
