import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {

    private static final String searchbox_Xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input";
    private static final String submitbox_Xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]";

    @Test
    public void testsearchfunctionality() {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath(searchbox_Xpath)).sendKeys("123");
        driver.findElement(By.xpath(submitbox_Xpath)).click();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(actualMessage, "Do you really want to delete this Customer?");
        alert.accept();
        alert.accept();
    }

}
