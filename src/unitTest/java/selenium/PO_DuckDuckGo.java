package selenium;

import selenium.pageobjects.Page;
import org.openqa.selenium.WebDriver;

class PO_DuckDuckGo extends Page {

    PO_DuckDuckGo(WebDriver driver) {
        super(driver, "https://duckduckgo.com/");
    }
}
