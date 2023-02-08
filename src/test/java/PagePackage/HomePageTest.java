package PagePackage;

import BasePackage.BaseClass;
import org.testng.Assert;
import org.testng.annotations.*;

public class HomePageTest extends BaseClass {
    HomePage hp;
    LandingPage lp;

    public HomePageTest(){
        super();
    }
    @BeforeClass
    public void setup(){
       initialization();
       hp= new HomePage(driver);
       lp= new LandingPage(driver);

    }
//    @AfterClass
//    public void teardown(){
//        driver.close();
//    }
    @Test
    public void testlog(){
        boolean logo= hp.checklog();
        Assert.assertTrue(logo);
    }
    @Test
    public void search(){
       hp.Bar();
       lp=hp.BTN();
    }

}
