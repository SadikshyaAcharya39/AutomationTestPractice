import net.bytebuddy.pool.TypePool;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    private WebDriverWait wait;

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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");

         wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Send driver
        basePage = new BasePage(driver);


    }

    @AfterEach
    public void tearDown(){
     if(driver != null){
         driver.quit();
     }
    }

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

//        WebElement dropDownELement = driver.findElement(basePage.selectCountryLocator);
//        Select dropDown = new Select(dropDownELement);
//        dropDown.selectByValue("Nepal");


       WebElement dropDownElement =  driver.findElement(basePage.selectCountryLocator);
       Select selectCountry = new Select(dropDownElement);
       selectCountry.selectByVisibleText("Canada");

       WebElement scrollDown = driver.findElement(basePage.selectColourLocator);
//       scrollDown.sendKeys(Keys.PAGE_DOWN);
       Select selectColour = new Select(scrollDown);
       selectColour.selectByVisibleText("Blue");


       WebElement dropDownAnimal = driver.findElement(basePage.selectAnimalLocator);
       dropDownAnimal.sendKeys(Keys.PAGE_DOWN);
       Select selectAnimal = new Select(dropDownAnimal);
       selectAnimal.selectByVisibleText("Rabbit");


//       WebElement dropDownAnimal = driver.findElement(basePage.selectAnimalLocator);
//       dropDownAnimal.sendKeys(Keys.PAGE_DOWN);
//       Select selectAnimal = new Select(dropDownAnimal);
//       selectAnimal.selectByValue("Rabbit");



        // Option 1: Data Picker1

//       WebElement datePicker1 = wait.until(ExpectedConditions.elementToBeClickable(basePage.datePicker1Locator0));
//       datePicker1.click();
//       datePicker1.sendKeys("03/20/2025");

       // Option 2: Data Picker1

        WebElement datePicker1 = wait.until(ExpectedConditions.visibilityOfElementLocated(basePage.datePicker1Locator0));
        datePicker1.click();
        WebElement datePicker10 = wait.until(ExpectedConditions.elementToBeClickable(basePage.datePicker1Locator1));
        datePicker10.click();


        // Option 1: Date Picker 2

        driver.findElement(basePage.datePicker2InputFieldLocator).click();
        WebElement datePickerTableLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(basePage.datePickerTableLocator));
        WebElement monthLocator = wait.until(ExpectedConditions.visibilityOfElementLocated(basePage.datePicker2MonthLocator));
        Select selectMonth = new Select(monthLocator);
        selectMonth.selectByValue("3");
        driver.findElement(basePage.datePicker2DateLocator).click();


        // Option 1: Date Picker 3

//        WebElement dateManually = driver.findElement(basePage.datePicker3Manually);
//        dateManually.click();
//        dateManually.sendKeys("03/20/2025");


        // Option 2: Date Picker 3

         WebElement datePicker3table = driver.findElement(basePage.datePicker3Manually);
         datePicker3table.clear();
         datePicker3table.sendKeys("03/20/2025");

         WebElement datePicker4Table = driver.findElement(basePage.datePicker4Manually);
         datePicker4Table.clear();
         datePicker4Table.sendKeys("03/22/2025");





    }


}
