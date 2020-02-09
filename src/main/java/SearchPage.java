import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public static final String searchbox_Xpath= "//*[@id=\"c-omni-container\"]/div/div[2]/div[1]/input";

    public  static final String searchname_Xpath="//*[@id='c-omni-container']/div/div[2]/div[2]/div[1]/div[2]/span/div[1]";
    public static final String  name_Xpath="//*[@id=\"container\"]/div[3]/div/div[2]/div[1]/div[1]/div[2]/div[1]/h1";

    public void enterDoctorname(WebDriver driver,String Doctorname){
        WebElement search=driver.findElement(By.xpath(searchbox_Xpath));
        search.sendKeys(Doctorname);

    }
    public void enterName(WebDriver driver){
        WebElement drname=driver.findElement(By.xpath(searchname_Xpath));
        drname.click();
    }
    public String nameVerify(WebDriver driver){
        WebElement verify=driver.findElement(By.xpath(name_Xpath));
       return verify.getText();
    }
}
