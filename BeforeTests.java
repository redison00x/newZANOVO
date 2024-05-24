package product.services.data;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;

public class BeforeTests {
    private BeforeTests () {}

    @BeforeTest
    public static void beforeTests () {

        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1920x1080";
    }
}
