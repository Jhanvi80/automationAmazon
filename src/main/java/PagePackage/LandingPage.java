package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseClass {
    @FindBy(xpath = "//img[@src='https://m.media-amazon.com/images/I/71oTOYadaSL._AC_UL320_.jpg']")
    WebElement handbag;

    public LandingPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public ProductPage addBag(){
      handbag.click();
      return new ProductPage(driver);
    }
}
