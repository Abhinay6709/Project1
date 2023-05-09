package Tests;

import Pages.HomePage;
import com.demo.Base.MyBase;
import com.demo.utlilities.utlilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Listeners({listeners.class})
public class Test extends MyBase {
    WebDriver driver;

    @BeforeClass
    public void setup() throws IOException {
       intialise_properties();
       this.driver= intialize_driver();

      driver.get("https://www.amazon.in/");

    }

    @org.testng.annotations.Test
    public void HomePageTest(){
        HomePage page = PageFactory.initElements(driver,HomePage.class);

    }
    @DataProvider
    public Object[][] myExcelData() throws IOException {
        return utlilities.getExcelData();
    }
    @org.testng.annotations.Test(dataProvider="myExcelData")
    public void gettestResults(String firstName,String lastName, String rollNo){
        Assert.assertEquals(firstName,"Abhinay");
        Assert.assertEquals(lastName,"Telu");
        Assert.assertEquals(rollNo,"a");

    }

    @org.testng.annotations.Test
    public void veriffyMyTest(){
        Assert.assertEquals(pro.getProperty("name"),"Abhinay");
        Assert.assertEquals(pro.getProperty("password"),"Abhinay@123");
    }
    @org.testng.annotations.Test
    public void Do(){
        System.out.print("A");
    }
    @org.testng.annotations.Test(priority=0)
    public void verifyTest(){
        Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }
    @org.testng.annotations.Test(priority = 1)
    public void verifyFalseTest(){
        Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
