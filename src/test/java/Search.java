import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Search {

@Test
    public void testsearchfunctionality(){
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();

        HomePage home= new HomePage();
          home.clickDoctor(driver);
          SearchPage searchPage = new SearchPage();
          searchPage.enterDoctorname(driver,"Swati Kedia");
          driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          searchPage.enterName(driver);
          String actualName=searchPage.nameVerify(driver);
    System.out.println(actualName);
    Assert.assertEquals(actualName,"Dr. Swati Kedia");

    }


}

