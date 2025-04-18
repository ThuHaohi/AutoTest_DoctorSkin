package Doctor;

import org.openqa.selenium.By;

public class ObjectRepository {
    public String URL = "https://localhost:44307/dang-nhap";
    public String URLAdmin = "https://localhost:44307/admin";
    By IUsername_Login = By.id("email-login");
    By Ipassword_Login = By.id("password-login");
    By btnLogin = By.name("submitLogin");
    By btnOK =  By.xpath("/html/body/div[4]/div/div[4]/div/button");
    //-----------------------------------------------Products_Admin----------------------------------------------------
    By menuProducts = By.xpath("//*[@id=\"item-sanpham\"]/span");
    By btnAddProduct = By.xpath("/html/body/section/div/div/div/div/div/div[2]/a");
    By InputName_Product = By.xpath("//*[@id=\"namep\"]");
    By dropdownType_Product = By.xpath("//*[@id=\"typep\"]");
    By AddType_Product = By.xpath("//*[@id=\"newTypep\"]");
    By btnThemmoi_Type_Product = By.xpath("//*[@id=\"addTypepBtn\"]");
    By InputNewPrice_Product = By.xpath("//*[@id=\"newprice\"]");
    By InputOldPrice_Product = By.xpath("//*[@id=\"oldprice\"]");
    By InputPicture_Product = By.xpath("//*[@id=\"img\"]");
    By dropdownBrand_Product = By.id("idbrand");
    By AddBrand_Product = By.id("newbrand");
    By btnThemmoi_Brand_Product = By.id("addBtnBrand");
    By dropdownAvailability_Product = By.id("avilability");
    By CheckBoxHide_Product = By.xpath("//*[@id=\"hide\"]");
    By dropdownGroup_Product = By.id("statep");
    By btnCreate_Product = By.xpath("/html/body/section/div/div/div/div/div/div[2]/div/form/div/div[11]/div/input");


//-----------------------------------------------Services_Admin----------------------------------------------------


//-----------------------------------------------Blogs_Admin----------------------------------------------------
    By menuBlogs = By.xpath("//*[@id=\"item-tintuc\"]");
    By btnAddBlog =  By.xpath("/html/body/section/div/div/div/div/div/div[2]/a");
    By dropdownType_Blog = By.xpath("//*[@id=\"idbt\"]");
    By InputPicture_Blog = By.xpath("//*[@id=\"cardimg\"]");
    By InputTitle_Blog = By.xpath("//*[@id=\"title\"]");
    By InputTopic_Blog = By.xpath("//*[@id=\"shortcontent\"]");
    By btnCreate_Blog = By.xpath("/html/body/section/div/div/div/div/div/div[2]/div/form/div/div[6]/div/input");
    By btnDelete_Blog = By.xpath("//*[@id=\"row-8\"]/td[5]/a[3]");
    By btnOKDelete_Blog = By.xpath("/html/body/div[4]/div/div[4]/div[2]/button");


}
