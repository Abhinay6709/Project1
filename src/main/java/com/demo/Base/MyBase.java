package com.demo.Base;


import com.demo.utlilities.utlilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class MyBase {
     WebDriver driver;
     public static Properties pro;
    public void intialise_properties() throws IOException {
        FileInputStream fis = new FileInputStream(utlilities.MY_PATH);
        pro=new Properties() ;
        pro.load(fis);
    }

    public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();

    public WebDriver intialize_driver(){
        WebDriverManager.chromedriver().setup();
//         ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        tdriver.set(driver);
        return getDriver();
    }

    public static synchronized WebDriver  getDriver(){
        return tdriver.get();

    }
}
