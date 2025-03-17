package pageobject;

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
    public By addressLocator = By.xpath("//input[@id='email']");
//    public By maleLocator = By.xpath("//input[@id='male']");
//    public By femaleLocator = By.xpath("//input[@id='female']");

    public By genderLocator = By.xpath("//div[@class='form-check form-check-inline' and @type = 'radio']");





}
