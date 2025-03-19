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
    public By selectColourLocator = By.xpath("//select[@class='form-control' and @id='colors']");
    public By selectAnimalLocator = By.xpath("//select[@class='form-control' and @id='animals']");

    public By datePicker1Locator0 = By.xpath("//input[@id='datepicker']");
    public By datePicker1Locator1 = By.xpath("//a[@class='ui-state-default' and @data-date='28']");

    public By datePicker2InputFieldLocator = By.xpath("//input[@id='txtDate']");
    public By datePickerTableLocator = By.xpath("//table[@class='ui-datepicker-calendar']");
    public By datePicker2MonthLocator = By.xpath("//select[@class='ui-datepicker-month' and @data-handler='selectMonth']");
    public By datePicker2DateLocator = By.xpath("//a[@class='ui-state-default' and @data-date='22']");


    public By datePicker3Manually = By.xpath("//input[@id='start-date']");
//    public By datePicker3TableLocator1 = By.xpath("//");

    public By datePicker4Manually = By.xpath("//input[@id='end-date']");


}
