package FirstTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ItBetterWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.marionette","C://Users//yussu//Downloads//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String exp_title="Facebook – log in or sign up";

        String act_title=driver.getTitle();

        System.out.println(act_title);

        if (exp_title.equals(act_title))
        {
            System.out.println("Test is successful");
        }
        else
        {
            System.out.println("Test failed");
        }

        driver.close();

	}

}
