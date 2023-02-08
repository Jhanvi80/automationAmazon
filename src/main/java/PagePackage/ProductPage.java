package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {
    @FindBy(xpath = "//input[@aria-labelledby='color_name_4-announce']")
    WebElement color;
    @FindBy(id="add-to-cart-button")
    WebElement addtocart;

    public ProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
//    public void selectcolor(){
//        color.click();}
    public CartPage gotocart(){
        addtocart.click();
        return new CartPage();
    }
}
