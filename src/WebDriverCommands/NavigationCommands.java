package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.marionette","C://Users//yussu//Downloads//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        
        driver.navigate().to("https://www.instagram.com");
        System.out.println(driver.getTitle());
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        
        driver.navigate().forward();
        System.out.println(driver.getTitle());
	}
}
