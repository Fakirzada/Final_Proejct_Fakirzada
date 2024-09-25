package pages;
import org.openqa.selenium.By;
import utility.SeleniumUtility;

public class CustomerServicePortalPage extends SeleniumUtility {
    public static final By ACCOUNTS_LINK=
            By.xpath("//a[@href='/csr/accounts']");
    public static final By PLANS_LINK=
            By.xpath("//a[@href='/csr/plans']");
}
