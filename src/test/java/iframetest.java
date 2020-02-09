import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iframetest{

    private static final String link_Xpath="/html/body/a/img";

    @Test
    public void clickwebpage(){
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        driver.switchTo().frame(3);
        driver.findElement(By.xpath(link_Xpath)).click();

    }


    }





