package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBys;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage  {
    WebDriver driver;
    HomePage(WebDriver driver){
        this.driver=driver;

    }



    @FindBy(linkText = "Amazon")
    WebElement linkTextTitle;

    @FindBy(id="nav-link-accountList")
    WebElement btnNavigationAccountList;

    @FindBy(id="searchDropdownBox")
    WebElement  dropdwnbtn;

    @FindBy(id="twotabsearchtextbox")
    WebElement labelTextBox;

    @FindBy(xpath="//div[contains(@id,'desktop-grid')]")
    WebElement imgGrids;

    public final String imgGroupGrids="//div[contains(@id,'desktop-grid')]";

    public final String txtMostWished ="//div/h2/span[starts-with(text(),'%s')]";




    public void verifyTitle(){
        Assert.assertEquals(driver.getTitle(),"Amazon.com. Spend less. Smile more.");
        Assert.assertTrue(linkTextTitle.isDisplayed());
        Assert.assertEquals(linkTextTitle.getText(),"Amazon");

    }

    public void hoverToSignIn(){
       Actions action = new Actions(driver);
       action.moveToElement(btnNavigationAccountList).build().perform();

    }

    public void verifyGridsArePresent() {
        Assert.assertTrue(driver.findElements(By.xpath(imgGroupGrids)).size() > 0);
    }

    public void mostWishIsPresent(){

       List<WebElement> txtMostWishedfor= driver.findElements(By.xpath(String.format(txtMostWished,"Most wished")));
        for(WebElement e:txtMostWishedfor){
            if(e.isDisplayed()){
                Assert.assertTrue(true);
            }


        }
    }






}
