import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPharmacy {


    public static final String searchbox_Xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div/input";
    public static final String entercrocin_Xpath="//*[@id=\"root\"]/div[1]/div[2]/div/div[1]/div/div[2]/a[1]/div[2]/div[1]";
    public static final String checkmedicine_Xpath="//*[@id=\"root\"]/div[2]/container/div[2]/div[1]/div[1]/h1";
    public static final String cart_Xpath="//*[@id=\"root\"]/div[2]/container/div[1]/div/div[2]/div[3]/div[4]/span";
    public static final String vcart_xpath="//*[@id=\"root\"]/div[2]/container/div[1]/div/div[2]/div[3]/div[4]/div/div/a/button/span";

    public void entermedicinenameTextBox(WebDriver driver,String medicinename){
        WebElement medicine=driver.findElement(By.xpath(searchbox_Xpath));
        medicine.sendKeys(medicinename);
    }


    public void clickmedicineLink(WebDriver driver){
        WebElement crocin =driver.findElement(By.xpath(entercrocin_Xpath));
        crocin.click();
    }
    public String getmedicineText(WebDriver driver){
        WebElement crocinadvance= driver.findElement(By.xpath(checkmedicine_Xpath));
        return crocinadvance.getText();
    }
    public void addcartBtn(WebDriver driver){
        WebElement clickcart=driver.findElement(By.xpath(cart_Xpath));
        clickcart.click();
    }
    public void viewcartBtn(WebDriver driver){
        WebElement clickviewcart=driver.findElement(By.xpath(vcart_xpath));
        clickviewcart.click();
    }

}
