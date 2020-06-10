package com.Base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

public static WebDriver driver;

public static void launchBrowser(){
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	Dimension d= new Dimension(1360,700);
	driver.manage().window().setSize(d);
	
}
public static void screenShot(WebDriver driver, long l) throws IOException {
	try {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screensrc = ts.getScreenshotAs(OutputType.FILE);
		File screendes = new File("C:\\Users\\Suresh Kumar\\eclipse-workspace-Cucumber\\LatesttaskCucumber30032020\\Screensot/"+l+"screenshot.png");
		FileUtils.copyFile(screensrc, screendes);
		System.out.println("Screenshot taken");
	}
	catch(Exception e){
		System.out.println("Exception while taking screenshot"+e.getMessage());
		
	}

}
public static void getUrl(String Url) {
	
	driver.get(Url);  
}

public static void txtbox(WebElement w,String s) {
	
	w.sendKeys(s);

}

public static void button(WebElement w) {
	
	w.click();
	
}

public static String text(WebElement f) {
	return f.getText();	
}


public static void drpdwn(WebElement w, String s) {
	
	Select se = new Select(w);
	se.selectByVisibleText(s);
}


public static void quitbrowser() {
	
	driver.quit();
}


}
