package steps;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utility.SeleniumUtility;

public class NavigateToHomePageSteps extends SeleniumUtility {
    @When("validate user in home page")
    public void validateUserInHomePage(){
        Assert.assertEquals(HomePage.TITLE,"TEK Insurance UI");
        Assert.assertTrue(isDisplayed(HomePage.CREATE_PRIMARY_ACCOUNT_LINK));

    }
}
