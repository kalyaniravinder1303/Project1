import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;


public class TestLoginToMercury {
    String driverpath = "C:\\Selenium jars & drivers\\drivers\\Chromedrivers\\chromedriver.exe";
    WebDriver driver;
    LoginPage objLoginPage;
    AfterLogin objAfterLogin;

   @BeforeAll
    public  void setup(){
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/");
    }

    @Test
    public void TestLoginPageCorrect(){
        objLoginPage = new LoginPage(driver);
        String PageTitle = objLoginPage.getTitleMercury();

        Assert.assertTrue(PageTitle.toLowerCase().contains("Mercury Tours"));
        objLoginPage.LoginToMercury("kalyani","123456");
        objAfterLogin = new AfterLogin(driver);
        Assert.assertTrue(objAfterLogin.getLoginDasboard().toLowerCase().contains("Login Successfully"));



    }



}
