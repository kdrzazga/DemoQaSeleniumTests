package selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public final class PO_YourAccount extends Page{

    private WebElement myAccountLink;

    public PO_YourAccount(WebDriver driver) {
        super(driver, "http://store.demoqa.com/");

    }

    public void navigateTo() {
        super.navigateTo();

    }
}
