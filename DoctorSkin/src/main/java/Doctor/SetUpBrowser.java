package Doctor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class SetUpBrowser {
    public WebDriver driver;
    public JavascriptExecutor js;
    public Helper helper;
    public ObjectRepository obj;


    @BeforeClass
    public void createDriver(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        System.out.println("Started Driver");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        helper = new Helper(driver);
        obj = new ObjectRepository();
        driver.get(obj.URL);
        Helper.delay(1);
        driver.findElement(obj.IUsername_Login).sendKeys("admin1@gmail.com");
        driver.findElement(obj.Ipassword_Login).sendKeys("12341234");
        Helper.delay(2);
        driver.findElement(obj.btnLogin).click();
        helper.clickElement(obj.btnOK);
        Helper.delay(2);


    }


//    @AfterClass
//    public void closeDriver(){
//        driver.quit();
//        System.out.println("Closed driver");
//    }

}
