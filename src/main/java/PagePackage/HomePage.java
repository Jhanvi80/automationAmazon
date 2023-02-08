package PagePackage;

import BasePackage.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    @FindBy(id="nav-logo-sprites")
    WebElement amazonlog;
    @FindBy(id="twotabsearchtextbox")
    WebElement Searchbar;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement searchbtn;

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public boolean checklog(){
        return amazonlog.isDisplayed();
    }
    public void Bar(){
        Searchbar.sendKeys("michael kors bag for women");
    }
    public LandingPage BTN(){
        searchbtn.click();
        return new LandingPage(driver);
    }

}
