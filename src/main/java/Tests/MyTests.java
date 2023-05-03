package Tests;

import com.google.common.annotations.VisibleForTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
@Listeners({listeners.class})
public class MyTests extends Base{
    WebDriver driver;
    @BeforeClass
    public void setup(){
       this.driver= intialize_driver();
      driver.get("https://www.amazon.in/");

    }
    @Test ()
    public void verifyTest(){

        Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }
    @Test(priority = 1)
    public void verifyFalseTest(){
        Assert.assertEquals(driver.getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");


    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
