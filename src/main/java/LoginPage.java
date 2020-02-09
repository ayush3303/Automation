import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static final String USERNAME_CSS="Input[id='username']";
    private static final String PASSWORD_CSS="Input[id='password']";
    private static final String LOGIN_CSS="button[id='login']";


    public void enterUsername(WebDriver driver, String Username){
        WebElement user= driver.findElement(By.cssSelector(USERNAME_CSS));
        user.sendKeys(Username);
    }
    public void enterPassword(WebDriver driver,String password){
        WebElement pass= driver.findElement(By.cssSelector(PASSWORD_CSS));
        pass.sendKeys(password);
    }
    public void clickLogin(WebDriver driver){
        WebElement login= driver.findElement(By.cssSelector(LOGIN_CSS));
        login.click();
    }
    //Method use to get login text box
    public String getlogintext(WebDriver driver){
        WebElement text= driver.findElement(By.cssSelector(LOGIN_CSS));
        return text.getText();
    }

}

