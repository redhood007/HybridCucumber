package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library {
	protected WebDriver driver;
    public void launchApplication(String browser,String url) {
        try {
//            if(browser.equalsIgnoreCase("firefox")) {
//                WebDriverManager.firefoxdriver().setup();
//                driver=new FirefoxDriver();
//        	}
            if(browser.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver =new ChromeDriver();
                
            }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get(url);

    }catch(WebDriverException e) {
        System.out.println("browser could not be launched");
    }

    }
    public void quit() {
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.close();
    }
	
}
