package selenium.testdefs;

import org.openqa.selenium.WebDriver;
import selenium.general.Driver;
import selenium.general.PropertiesReader;
import selenium.pageobjects.PO_StoreDemoQa;
import selenium.pageobjects.PO_YourAccount;


public class TestExecutionManager {

    private final PO_StoreDemoQa indexPage;
    private final PO_YourAccount yourAccountPage;

    public TestExecutionManager() {
        WebDriver driver = Driver.fromString(PropertiesReader.readFromConfig("browser")).create();

        indexPage = new PO_StoreDemoQa(driver);
        yourAccountPage = new PO_YourAccount(driver);
    }


    public void goToIndex() {
        indexPage.navigateTo();
    }

    public void clickMyAccountLink(){
        indexPage.clickMyAccountLink();
    }

}
