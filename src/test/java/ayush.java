import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class ayush {

    private static String from_css = "div[id='draggable']";
    private static String tocss ="div[id='droppable']";
    private static String textbox = "input[id='fname']";


    @Test
    public void verifydropdown() {
        System.setProperty("webdriver.chrome.driver", "E:\\Automation Project 12\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testandquiz.com/selenium/testing.html");
        driver.manage().window().maximize();
        //WebElement ele = driver.findElement(By.cssSelector(dropdown_CSS));


//        WebElement image = driver.findElement(By.cssSelector(from_css));
//        WebElement  pic = driver.findElement(By.cssSelector(tocss));
//        Actions ac = new Actions(driver);
//        ac.dragAndDrop(image,pic).build().perform();

        WebElement WE = driver.findElement(By.cssSelector(textbox));
        WE.sendKeys("ayush");
    }


}
