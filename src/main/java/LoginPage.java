import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    WebDriver driver;
    By userMercury= By.name("userName");
    By pwdMercury= By.name("password");
    By submitMercury= By.name("submit");
    By pageTitle = By.cssSelector("img[alt='Mercury Tours']");

    public LoginPage(WebDriver driver){ this.driver = driver; }

    public void setUsername(String uname){
        driver.findElement(userMercury).sendKeys(uname);
    }
    public void setPassword(String pwd){
        driver.findElement(pwdMercury).sendKeys(pwd);
    }
    public void clickLogin(){
        driver.findElement(submitMercury).click();
    }
    public String getTitleMercury(){
        return driver.findElement(pageTitle).getText();
    }
    public void LoginToMercury(String uname, String pwd){
        this.setUsername(uname);
        this.setPassword(pwd);
        this.clickLogin();
    }
}

