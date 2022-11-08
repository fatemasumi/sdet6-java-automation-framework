package products;

import org.testng.annotations.Test;

public class ProductPageTest {
    @Test(groups = {"sanity"})
    void verifyProductTitleIsDisplayed(){
        System.out.println("Product title is displayed");
    }
    @Test(groups = {"regression"})
    void verifyProductPageDisplaysCartLink(){
        System.out.println("Cart link is displayed");
    }

}
