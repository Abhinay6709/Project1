package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Base {
    public WebDriver driver;
    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public WebDriver intialize_driver(){
        WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        tdriver.set(driver);
        return getDriver();
    }

    public static synchronized WebDriver  getDriver(){
        return tdriver.get();

    }
}
