package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Base {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public WebDriver intialize_driver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABTELU\\Documents\\chromedriver_win32 (3)\\chromedriver.exe");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
       tdriver.set(driver);
        return getDriver();
    }

    public static synchronized WebDriver  getDriver(){
        return tdriver.get();

    }
}
