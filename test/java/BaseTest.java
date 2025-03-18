import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobject.BasePage;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class BaseTest {

    private WebDriver driver;
    private Properties properties;
    private BasePage basePage;

    @BeforeEach
    public void setUp(){
        properties = new Properties();
        try (InputStream is = getClass().getResourceAsStream("application.properties")) {
            properties.load(is);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

        // Send driver
        basePage = new BasePage(driver);


    }

//    @AfterEach
//    public void tearDown(){
//     if(driver != null){
//         driver.quit();
//     }
//    }

    @Test
    public void verifyingForm(){
        WebElement name = driver.findElement(basePage.nameLocator);
        name.sendKeys("Sadikshya");
        WebElement email = driver.findElement(basePage.emailLocator);
        email.sendKeys("acharya.sadikshya33@gmail.com");
        WebElement phone = driver.findElement(basePage.phoneLocator);
        phone.sendKeys("9817639136");
        WebElement address = driver.findElement(basePage.addressLocator);
        address.sendKeys("Lalitpur");

//         List<WebElement> genderType = driver.findElements(basePage.genderTypeLocator);
//         for(int i = 0; i < genderType.size(); i++){
//             genderType.get(0).click();
//         }


        List<WebElement> genderType = driver.findElements(basePage.genderTypeLocator);
        genderType.get(1).click();

        List<WebElement> checkBoxes = driver.findElements(basePage.checkBoxLocator);
        checkBoxes.get(5).click();

        WebElement dropDownELement = driver.findElement(basePage.selectCountryLocator);
        Select dropDown = new Select(dropDownELement);
        dropDown.selectByValue("Nepal");




    }


}
