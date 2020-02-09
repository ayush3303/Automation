import com.sun.org.apache.xpath.internal.objects.XString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage{

    private static final String signUp_CSS="a[name='Practo login']";
    private static final String profileName_CSS="div.nav-items.u-d-trigger.dropdown-toggle.push-droparrow > span > span.user_info_top";
    private static final String  doctor_Xpath ="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[1]/a/div[1]";
    private static final String  pharmacy_Xpath="//*[@id=\"root\"]/div/div/div[1]/div[1]/div[2]/div/div[2]/div[3]/a";
    public  void clickSignupbutton(WebDriver driver){
        WebElement signup=driver.findElement(By.cssSelector(signUp_CSS));
        signup.click();
    }

    public String getProfilename(WebDriver driver){
        WebElement profie=driver.findElement(By.cssSelector(profileName_CSS));
        return profie.getText();
    }
    public void clickDoctor(WebDriver driver){
        WebElement doctor=driver.findElement(By.xpath(doctor_Xpath));
        doctor.click();
    }
    public void clickPharmacy(WebDriver driver){
        WebElement pharmacy=driver.findElement(By.xpath(pharmacy_Xpath));
        pharmacy.click();
    }
}

