package selenium;

import selenium.pageobjects.Page;
import org.junit.Assert;
import org.junit.Test;
import selenium.general.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class WebDriverFactoryTest {

    @Test
    public void testChromeDriver(){
        WebDriver chromeDriver = WebDriverFactory.createChromeDriver();
        chromeDriver.get("http://www.google.com");
        Assert.assertTrue(chromeDriver.getTitle().contains("Google"));
        chromeDriver.close();
    }

    @Test
    public void testHeadlessDriver(){
        Page page = new PO_DuckDuckGo(WebDriverFactory.createHeadlessDriver());
        page.navigateTo();
        Assert.assertEquals("DuckDuckGo", page.getTitle());
        page.getDriver().close();
    }
}
