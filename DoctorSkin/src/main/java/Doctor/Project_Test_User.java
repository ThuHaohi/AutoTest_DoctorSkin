package Doctor;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.PrintStream;
import java.time.Duration;
import java.util.List;
import static java.lang.Thread.sleep;

public class Project_Test_User extends SetUpBrowser_User {
    @Test(priority = 1)
    public void ProductPage(){
//        driver.get(objU.URL);
        Actions doubleclick = new Actions(driver);
        doubleclick.doubleClick(driver.findElement(objU.btnProduct)).perform();
        Helper.delay(1);
//-----------------------getType Products---------------------------------------
        WebElement ul = driver.findElement(By.xpath("//*[@id=\"aa-product-category\"]/div/div/div[2]/aside/div[1]/ul"));
        Helper.delay(1);
        js.executeScript("window.scroll(0,700)");
        List<WebElement> li = ul.findElements(By.tagName("li"));
        for ( int i=0;i<li.size();i++) {
            ul = driver.findElement(By.xpath("//*[@id=\"aa-product-category\"]/div/div/div[2]/aside/div[1]/ul"));
            li = ul.findElements(By.tagName("li"));
            WebElement liE = li.get(i);
//            System.out.println(liE.getText());
//            liE.click();
            Helper.delay(2);
            if(liE.getText().equals("Serum")){
                liE.click();
                js.executeScript("window.scroll(0,500)");
                Helper.delay(2);
                break;
            }

        }
        //-----------------Add to cart-----------------------

//        Helper.delay(2);
        List<WebElement> listProduct = driver.findElements(objU.titleProduct);
        WebElement listbtnAdd =  driver.findElement(By.xpath("//*[@id=\"aa-product-category\"]/div/div/div[1]/div/div[2]/ul/li[2]/figure/a[2]"));
        Actions actions = new Actions(driver);
        for (WebElement g : listProduct) {

            if (g.getText().contains("Serum")  ) {
                System.out.println(g.getText());
                actions.click(listbtnAdd).perform();
            }

        }

    }
    @Test(priority = 2)
    public void OrderProduct() {
    //--------------Order Product------------------------------------
        driver.findElement(objU.btnCart).click();
        driver.findElement(objU.checkbox_Cart).click();
        driver.findElement(objU.btnBuy).click();
    //--------Address--------------------
        driver.findElement(objU.btnChangeAddr).click();
        WebDriverWait waitProv = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitProv.until(ExpectedConditions.visibilityOfElementLocated(objU.dropdownProv));
        Select province = new Select(driver.findElement(objU.dropdownProv));
        province.selectByValue("79");

        Select selDis = new Select(driver.findElement(objU.dropdownDis));
        selDis.selectByValue("778");


        Select selWard = new Select(driver.findElement(objU.dropdownWard));
        selWard.selectByValue("27478");

        driver.findElement(objU.inputDetailAddr).sendKeys("142 Nguyễn Thị Thập");

        driver.findElement(objU.btnConfirm).click();

        js.executeScript("window.scroll(0,500)");
        Helper.delay(3);
        driver.findElement(objU.btnOrder).click();

        WebDriverWait waitbtnOk = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitbtnOk.until(ExpectedConditions.visibilityOfElementLocated(objU.btnOKOder)).click();

    }
}
