package pageobject;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage
{
    private WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }


    // Locator
    public By nameLocator = By.xpath("//input[@id='name']");
    public By emailLocator = By.xpath("//input[@id='email']");
    public By phoneLocator = By.xpath("//input[@id='phone']");
    public By addressLocator = By.xpath("//textarea[@id='textarea']");
//    public By maleLocator = By.xpath("//input[@id='male']");
//    public By femaleLocator = By.xpath("//input[@id='female']");

    public By genderTypeLocator = By.xpath("//input[@class='form-check-input' and @type='radio']");
    public By checkBoxLocator = By.xpath("//input[@class='form-check-input' and @type='checkbox']");

    public By selectCountryLocator = By.xpath("//select[@class='form-control' and @id='country']");



}
