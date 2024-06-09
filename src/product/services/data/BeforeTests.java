package product.services.data;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;

public class BeforeTests {

    private BeforeTests(){}
    @BeforeSuite
    public static void beforeTests () {

        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
    }
}
