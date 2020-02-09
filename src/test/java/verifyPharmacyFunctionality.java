import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class verifyPharmacyFunctionality {

    HomePage homePage = new HomePage();
    SearchPharmacy searchPharmacy =new SearchPharmacy();
    CartPage cartPage=new CartPage();

    @Test
    public void testPharmacy(){

        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.practo.com/");
        driver.manage().window().maximize();

        homePage.clickPharmacy(driver);
        driver.navigate().refresh();
        searchPharmacy.entermedicinenameTextBox(driver,"crocin");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        searchPharmacy.clickmedicineLink(driver);
        searchPharmacy.addcartBtn(driver);
        searchPharmacy.viewcartBtn(driver);
        cartPage.clicklocation(driver);
        String actualMedicine = cartPage.checktext(driver);
        Assert.assertEquals(actualMedicine,"CROCIN ADVANCE 500MG Tablet 15`S");


    }
}
