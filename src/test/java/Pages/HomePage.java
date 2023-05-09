package Pages;

import com.demo.Base.MyBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends MyBase {
    WebDriver driver;
    @FindBy(id="username")
    WebElement element;
    HomePage(){
        this.driver=intialize_driver();
        PageFactory.initElements(driver,this);
    }
    public void enterUsrname(){
        element.click();
    }

}
