package PagePackage;

import BasePackage.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductPageTest extends BaseClass {
    HomePage hp;
    LandingPage lp;
    ProductPage pp;
    CartPage cp;

    public ProductPageTest(){
        super();
    }
    @BeforeClass
    public void setup() {
        initialization();
        hp = new HomePage(driver);
        lp = new LandingPage(driver);
        pp = new ProductPage(driver);
        cp= new CartPage();
        hp.Bar();
        lp = hp.BTN();
        lp.addBag();

    }
    @AfterClass
    public void teardown(){
//        driver.close();
    }
    @Test
    public void cart(){
//        pp.selectcolor();
        pp.gotocart();
    }
}
