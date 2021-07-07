

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class AfterLogin {
        WebDriver driver;

        public AfterLogin(WebDriver driver){ this.driver = driver;}

        By loginSuccess = By.xpath("//h3[normalize-space()='Login Successfully']");
        public String getLoginDasboard(){
            return driver.findElement(loginSuccess).getText();
        }


    }


