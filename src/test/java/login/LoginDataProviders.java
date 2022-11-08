package login;

import org.testng.annotations.DataProvider;

public class LoginDataProviders {
    @DataProvider(name = "validLoginData")
    public Object[][] getValidLoginCredentials(){
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                //{"locked_out_user", "secret_sauce"},
                //{"problem_user", "secret_sauce"}
        };
    }

    @DataProvider
    public Object[][] getInvalidLoginCredentials(){
        return new Object[][]{
                {"standard_user", "secret_sauce1"},
               // {"locked_out_user2", "secret_sauce"},
                // {"problem_user7", "secret_sauce"}
        };
    }
}
