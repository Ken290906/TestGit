import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class TestSelenium {

    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        // khoi tao doi tuong
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void Test() {
        chromeDriver.get("https://cchatclothes.vn/user/signin");

        WebElement inputUserName = chromeDriver.findElement(By.xpath("//*[@id=\"username\"]"));
        inputUserName.sendKeys("huannek2006@gmail.com");
        WebElement inputPassword = chromeDriver.findElement(By.xpath("//*[@id=\"password\"]"));
        inputPassword.sendKeys("KenNguyen0906");
        WebElement btnLogin = chromeDriver.findElement(By.xpath("//*[@id=\"btnsignin\"]"));
        btnLogin.click();

    }

//    @AfterEach
//    public void tearDown () {
//        if(chromeDriver != null) {
//            chromeDriver.quit();
//        }
//    }

}
