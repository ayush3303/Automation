import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyLoginFunctionality {

    @Test
    public void testLogin() {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();

        HomePage home =new HomePage();
        LoginPage login= new LoginPage();
        home.clickSignupbutton(driver);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        login.enterUsername(driver,"9968944542");
        login.enterPassword(driver,"ayush0077@");
        login.clickLogin(driver);
        String actualName = home.getProfilename(driver);
        Assert.assertEquals(actualName,"AYUSH PURI");

    }
}
