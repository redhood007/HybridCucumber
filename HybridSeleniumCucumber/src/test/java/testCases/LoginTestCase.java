package testCases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseClass.Library;
import pages.LoginPage;
import reusableFunctions.SeleniumUtilities;

public class LoginTestCase extends Library {

	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");

    }
    @Test
    public void login() {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");

    }
    @AfterClass
    public void close() throws IOException {
        SeleniumUtilities sUti = new SeleniumUtilities(driver);
        sUti.to_take_screenshot("C:\\Users\\kamal\\eclipse-workspace\\LTI\\HybridSeleniumCucumber\\src\\test\\resources\\screenshots\\orangeHRMLogin3.png");

       quit();

    }
}
