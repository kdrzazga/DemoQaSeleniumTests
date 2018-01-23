package selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PO_StoreDemoQa extends Page{
    private WebElement myAccountLink;
    private final static Logger logger = LoggerFactory.getLogger(PO_StoreDemoQa.class);

    public PO_StoreDemoQa(WebDriver driver) {
        super(driver, "http://store.demoqa.com/");
    }

    public void navigateTo() {
        super.navigateTo();
        myAccountLink = LocatorHelper.findClickableElement(driver, By.id("account"));
    }

    public void clickMyAccountLink(){
        myAccountLink.click();
    }
}
