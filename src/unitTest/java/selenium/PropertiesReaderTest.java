package selenium;

import org.junit.Assert;
import org.junit.Test;
import selenium.general.PropertiesReader;

public class PropertiesReaderTest {

    @Test
    public void testResourcesReading() {

        Assert.assertEquals("C:\\Users\\KDRZAZGA\\webdriver\\chromedriver.exe"
                , PropertiesReader.readFromConfig("driver.chrome.path"));
        Assert.assertEquals("C:\\Users\\KDRZAZGA\\webdriver\\geckodriver.exe"
                , PropertiesReader.readFromConfig("driver.firefox.path"));
    }
}
