package Tests;

import com.demo.Base.MyBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class DragAndDropTest extends MyBase {
    WebDriver driver;
    @Test
    public void DragAndDropTest() throws IOException {
        this.driver=intialize_driver();
        driver.get("https://jqueryui.com/droppable/");
//        driver.get("https://jqueryui.com/resizable/");
//        driver.get("https://jqueryui.com/selectable/");
        driver.get("https://jqueryui.com/sortable/");
//        Actions action = new Actions(driver);
//        driver.switchTo().frame(0);
//        //WebElement resizable = driver.findElement(By.id("resizable"));
////        WebElement source=driver.findElement(By.xpath("//ol[@id='selectable']/li[contains(text(),'Item 1')]"));
////        WebElement target=driver.findElement(By.xpath("//ol[@id='selectable']/li[contains(text(),'Item 6')]"));
////        //action.moveToElement(resizable).dragAndDropBy(resizable,0,100).build().perform();
//      //  action.dragAndDrop(source,target).build().perform();
////        WebElement source=driver.findElement(By.id("draggable"));
//
////        WebElement target= driver.findElement(By.id("droppable"));
////        action.dragAndDrop(source,target).build().perform();
//       // driver.quit();
//        String ele1="//*[@id='sortable']/li[%s]";
////        WebElement ele2=driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
////        WebElement ele3=driver.findElement(By.xpath("//*[@id='sortable']/li[3]"));
////        WebElement ele4=driver.findElement(By.xpath("//*[@id='sortable']/li[4]"));
////        WebElement ele5=driver.findElement(By.xpath("//*[@id='sortable']/li[5]"));
////        WebElement ele6=driver.findElement(By.xpath("//*[@id='sortable']/li[6]"));
////        WebElement ele7=driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
//        List<WebElement> ele =driver.findElements(By.xpath("//*[@id='sortable']/li)");

        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C:\\Users\\ABTELU\\Documents\\ab.jpg"));

      // new WebDriverWait(driver, Duration.ofMillis(5000)).until(ExpectedConditions.elementToBeClickable());



    }
}
