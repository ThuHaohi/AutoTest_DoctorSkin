package Doctor;


import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Project_Test extends SetUpBrowser {
    //Khởi tạo đối tượng cho ObjectRepository để gọi từng object qua dùng lại



    @Test(priority = 1)
    public void ProductsPage_Admin(){
        driver.get(obj.URLAdmin);
        Helper.delay(2);
        driver.findElement(obj.menuProducts).click();

        //-------------Add----------------------------
        Helper.delay(2);
        driver.findElement(obj.btnAddProduct).click();
//        helper.clickElement(obj.btnAddProduct);
        driver.findElement(obj.InputName_Product).sendKeys("Sữa Rửa Mặt Dạng Gel Cosrx Low PH Good Morning Gel Cleanser 150ML");
        Helper.delay(1);
        //Khai báo đối tượng kiểu Select cho element của thẻ Select dropdown
        Select selectType = new Select( driver.findElement(obj.dropdownType_Product));
//        selectType.selectByIndex(2);
        selectType.selectByValue("3");
        Helper.delay(1);
        driver.findElement(obj.InputNewPrice_Product).sendKeys("100.000");
        Helper.delay(1);
        driver.findElement(obj.InputOldPrice_Product).sendKeys("150.000");
        Helper.delay(1);

        driver.findElement(obj.InputPicture_Product).sendKeys(System.getProperty("user.dir") + "/src/main/resources/Corx.webp");
//        driver.findElement(obj.InputPicture_Product).sendKeys("/resource/sn.jfif");
        Helper.delay(1);



        Select selectBrand = new Select(driver.findElement(obj.dropdownBrand_Product));
        selectBrand.selectByIndex(2);
        Helper.delay(1);
        Select selectAvai = new Select(driver.findElement(obj.dropdownAvailability_Product));
        selectAvai.selectByIndex(2);
        Helper.delay(1);
        Select selectGroup = new Select(driver.findElement(obj.dropdownGroup_Product));
        selectGroup.selectByIndex(2);
        Helper.delay(1);
        js.executeScript("window.scrollBy(0, 500);");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
        WebElement editorBody = driver.findElement(By.xpath("/html/body"));

        // Nhập văn bản vào CKEditor
        editorBody.clear();  // Xóa nội dung hiện tại
        editorBody.sendKeys("Sữa rửa mặt dạng gel Cosrx Low PH Good Morning Gel Cleanser loại bỏ các chất gây viêm nhiễm bên trong lỗ chân lông và kiểm soát sự tiết bã nhờn. Ngăn ngừa làn da bị mất nước và trở nên mềm mịn, sạch thoáng");
        Helper.delay(1);
        driver.switchTo().defaultContent();
        driver.findElement(obj.btnCreate_Product).click();


    }
    @Test(priority = 2)
    public void BlogsPage_Admin(){
        driver.get(obj.URLAdmin);
        driver.findElement(obj.menuBlogs).click();
        //--------------Add-------------------
        driver.findElement(obj.btnAddBlog).click();
        Select selectType = new Select(driver.findElement(obj.dropdownType_Blog));
        selectType.selectByIndex(2);
        driver.findElement(obj.InputPicture_Blog).sendKeys(System.getProperty("user.dir") + "/src/main/resources/blog.jfif");
        driver.findElement(obj.InputTitle_Blog).sendKeys("Trong kỳ kinh nguyệt có nên nặn mụn không? Giải đáp chi tiết");
        driver.findElement(obj.InputTopic_Blog).sendKeys("Trong kỳ kinh nguyệt có nên nặn mụn không? Giải đáp chi tiết");
        js.executeScript("window.scrollBy(0, 500);");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe")));
        WebElement editorBody = driver.findElement(By.xpath("/html/body"));

        // Nhập văn bản vào CKEditor
        editorBody.clear();  // Xóa nội dung hiện tại
        editorBody.sendKeys("Trong kỳ kinh nguyệt có nên nặn mụn không là một trong những băn khoăn được nhiều bạn quan tâm. Bởi vì tình trạng mụn trứng cá bùng phát trên da vào ngày ‘đèn đỏ’ khiến nhiều phái đẹp lo lắng và mất tự tin khi giao tiếp với mọi người. Bài viết dưới đây sẽ giúp bạn giải đáp câu hỏi này. Cùng tìm hiểu ngay.");
        driver.switchTo().defaultContent();

        driver.findElement(obj.btnCreate_Blog).click();
        //-------------Delete---------------------
//        Helper.delay(2);
        driver.findElement(obj.btnDelete_Blog).click();
//        Helper.delay(2);
        helper.clickElement(obj.btnOKDelete_Blog);

    }

}
