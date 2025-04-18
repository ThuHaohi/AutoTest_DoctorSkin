package Doctor;

import org.openqa.selenium.By;

public class ObjectRepository_User {

    public String URL = "https://localhost:44307/dang-nhap";
    By IUsername_Login = By.id("email-login");
    By Ipassword_Login = By.id("password-login");
    By btnLogin = By.name("submitLogin");
    By btnOK =  By.xpath("/html/body/div[4]/div/div[4]/div/button");
    //----------------Product Page-------------------
    By btnProduct = By.linkText("Sản phẩm");
    By titleProduct = By.className("aa-product-title");
    By category_Product = By.xpath("//*[@id=\"aa-product-category\"]/div/div/div[2]/aside/div[1]/ul/li/a");
    By Brand_Product = By.name("choose-brand");
    By btnAddCart = By.className("aa-add-card-btn");

    //-------------Order Product-----------------------
    By btnCart = By.xpath("/html/body/header/div[2]/div/div/div/div/div[2]/a/span[1]");
    By checkbox_Cart = By.xpath("//*[@id=\"div-pr-3\"]/div/div[1]/div[1]/input");
    By btnBuy = By.id("thanhtoan");

    By btnChangeAddr = By.xpath("//*[@id=\"aa-promo\"]/div/div[1]/div[2]/div[2]/button");
    By dropdownProv = By.id("city");
    By dropdownDis = By.id("district");
    By dropdownWard = By.id("ward");
    By inputDetailAddr = By.id("addressDetail");
    By btnConfirm = By.xpath("//*[@id=\"addressleModal\"]/div/div/div[2]/div/div[5]/button[2]");

    By btnOrder = By.xpath("//*[@id=\"dathang\"]");
    By btnOKOder = By.xpath("/html/body/div[5]/div/div[4]/div/button");



}
