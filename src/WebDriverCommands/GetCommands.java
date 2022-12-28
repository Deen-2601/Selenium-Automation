package WebDriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chromedriver.marionette","C://Users//yussu//Downloads//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        System.out.println(driver.getTitle()); //returns title of the page
        
        System.out.println(driver.getCurrentUrl()); //returns the URL of the page


	}

}
