package Doctor;

import Doctor.Helper;
import Doctor.ObjectRepository;
import Doctor.ObjectRepository_User;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class SetUpBrowser_User {
    public WebDriver driver;
    public JavascriptExecutor js;
    public Helper helper;

    public ObjectRepository_User objU;

    @BeforeClass
    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Started Driver");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        js = (JavascriptExecutor) driver;
        helper = new Helper(driver);
        objU = new ObjectRepository_User();
        driver.get(objU.URL);
        Helper.delay(1);
        driver.findElement(objU.IUsername_Login).sendKeys("tranthuhao70@gmail.com");
        driver.findElement(objU.Ipassword_Login).sendKeys("12341234");
        Helper.delay(3);
        driver.findElement(objU.btnLogin).click();
        Helper.delay(3);
        helper.clickElement(objU.btnOK);
        Helper.delay(3);
    }


//    @AfterClass
//    public void closeDriver(){
//        driver.quit();
//        System.out.println("Closed driver");
//    }

}
