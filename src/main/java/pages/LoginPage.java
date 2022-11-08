package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    //locators
    WebDriver driver = new ChromeDriver();

//    String userNameTextBoxIdLocator = "user-name";
//    String passWordTextBoxIdLocator = "password";
//    String loginButtonIdLocator = "login-button";
//    String logoImageXpathLocator = "//*[@id=\"root\"]/div/div[1]";
//    String robotImageXpathLocator = "//*[@id=\"root\"]/div/div[2]/div[1]/div[2]";

    //by type
    By userNameTextBox = By.id("user-name");
    By passWordTextBox = By.id("password");
    By loginButton = By.id("login-button");
    By logoImage = By.xpath("//*[@id=\"root\"]/div/div[1]");
    By robotImage = By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]");


    public void navigateToLoginPage(){
        System.out.println("Launch browser");
        String loginUrl = "";
        System.out.println("Navigate to" + loginUrl);
    }

    public void enterUserName(String username){
        System.out.println("Enter username" + username);
        //driver.findElement(By.id(userNameTextBoxIdLocator)).sendKeys(username);
        //by type
        driver.findElement(userNameTextBox).sendKeys(username);
    }
    public void enterPassWord(String password){
        System.out.println("Enter password" + password);
        driver.findElement(passWordTextBox).sendKeys(password);
    }
    public void clickLoginButton(){
        System.out.println("Click login button");
        driver.findElement(loginButton).click();
    }
    public void verifyLogoImage(){
        System.out.println("Verify Logo on login page");
        boolean isVerified = driver.findElement(logoImage).isDisplayed();
        //Assert.assertTrue(isVerified);
    }
    public void verifyRobotImage(){
        System.out.println("Robot image is displayed");
        boolean isVerified = driver.findElement(robotImage).isDisplayed();
    }
}
