package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.SeleniumUtility;

import java.util.List;
public class AccountsSteps extends SeleniumUtility {
    @Then("user validate {int} row page is displayed")
    public void userValidateRowPageIsDisplayed(int value) {
        List<WebElement> rows=getElements(By.xpath("//tbody/tr"));
        //System.out.println(row.size());
        Assert.assertEquals(value,rows.size());
    }

    @When("user change show per page to {int}")
    public void userChangeShowPerPageTo(int value) {
        String xpath="//select[@class='chakra-select css-161pkch']";
        WebElement element= getDriver().findElement(By.xpath(xpath));
        Select select=new Select(element);
        select.selectByValue(String.valueOf(value));
    }
}
