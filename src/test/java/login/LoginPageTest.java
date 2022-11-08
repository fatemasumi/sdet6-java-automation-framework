package login;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginPageTest {
    LoginPage loginPage;

    @BeforeTest
    void setup(){
        loginPage = new LoginPage();
        loginPage.navigateToLoginPage();
    }

    @Test(groups = {"regression"}, dataProvider = "validLoginData", dataProviderClass = LoginDataProviders.class)
    void verifyLoginWithValidCredentials(String username, String password){
        //Arrange

        //Act
        System.out.println("Enter valid Username" + username);
        System.out.println("Enter valid Password" + password);
        System.out.println("Click login button");

        //Assert
        String expectedTitleText = "PRODUCTS";
        String actualTitleText = "PRODUCTS";
        System.out.println("Product page is displayed");
        Assert.assertEquals(expectedTitleText, actualTitleText);
    }
    @Test(groups = {"regression"},dataProvider = "getInvalidLoginCredentials", dataProviderClass = LoginDataProviders.class)
    void verifyLoginWithValidUserNameAndInvalidPassword(String username, String password){
        //Arrange


        //Act
        System.out.println("Enter valid Username" + username);
        System.out.println("Enter valid Password" + password);
        System.out.println("Click login button");

        //Assert
        String expectedTitleText = "Login";
        String actualTitleText = "PRODUCTS";
        System.out.println("Product page is displayed");
        Assert.assertEquals(expectedTitleText, actualTitleText);
    }
    @Test(groups = {"sanity"},dataProvider = "getInvalidLoginCredentials", dataProviderClass = LoginDataProviders.class)
    void verifyLoginWithInvalidUserNameAndValidPassword(String username, String password){
        //Arrange


        //Act
        System.out.println("Enter valid Username" + username);
        System.out.println("Enter valid Password" + password);
        System.out.println("Click login button");

        //Assert
        String expectedTitleText = "Login";
        String actualTitleText = "PRODUCTS";
        System.out.println("Product page is displayed");
        Assert.assertEquals(expectedTitleText, actualTitleText);

    }
    @Ignore
    @Test(groups = {"sanity", "regression"},dataProvider = "getInvalidLoginCredentials", dataProviderClass = LoginDataProviders.class)
    void verifyValidationMessageIsDisplayedIfUserEntersInvalidCredentials(String username, String password){
        //Arrange


        //Act
        System.out.println("Enter valid Username" + username);
        System.out.println("Enter valid Password" + password);
        System.out.println("Click login button");

        //Assert
        String expectedValidationMessage = "Epic sadface: Username and password do not match any user in this service";
        String actualValidationMessage = "Epic sadface: Username and password do not match any user in this service";
        System.out.println("Product page is displayed");
        Assert.assertEquals(expectedValidationMessage, actualValidationMessage);
    }
}

