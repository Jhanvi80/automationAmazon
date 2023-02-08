package PagePackage;

import BasePackage.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseClass {
    HomePage hp;
    LandingPage lp;
    ProductPage pp;

    public LandingPageTest(){
        super();
    }
    @BeforeClass
    public void setup() {
        initialization();
        hp = new HomePage(driver);
        lp = new LandingPage(driver);
        pp = new ProductPage(driver);
        hp.Bar();
        lp = hp.BTN();

    }
    @AfterClass
    public void teardown(){
//        driver.close();
    }
    @Test
    public void bag(){
        lp.addBag();
    }
}
