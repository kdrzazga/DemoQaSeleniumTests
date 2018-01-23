package selenium.general;

import org.openqa.selenium.WebDriver;

public enum Driver {
    CHROME, FIREFOX, HEADLESS;

    public WebDriver create() {
        if (CHROME.equals(this)) {
            return WebDriverFactory.createChromeDriver();
        } else if (FIREFOX.equals(this)) {
            return WebDriverFactory.createFirefoxDriver();
        } else return WebDriverFactory.createHeadlessDriver();
    }

    public static Driver fromString(String browserName) {
        if (browserName.equalsIgnoreCase("CHROME")) {
            return CHROME;
        } else if (browserName.equalsIgnoreCase("FIREFOX")) {
            return FIREFOX;
        } else return HEADLESS;
    }
}
