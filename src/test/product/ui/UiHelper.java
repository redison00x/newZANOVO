package test.product.ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static product.services.data.Constants.*;

public class UiHelper {

    private UiHelper() {}

    public static void pathToFrame (String open,
                                    SelenideElement elementCookie,
                                    String title,
                                    String wrong,
                                    SelenideElement clickable,
                                    SelenideElement frame,
                                    SelenideElement licensePlate){
        open(open);
        sleep(HALF_SECOND);

        elementCookie.click();
        assertEquals (title(), title, wrong);
        Wait().until(ExpectedConditions.elementToBeClickable(clickable)).click();

        switchTo().frame(frame);
        licensePlate.click();
    }

    public static void elementClick (SelenideElement element) {
        sleep(HALF_SECOND);
        element.click();
    }

    public static void actionClickOneElement (SelenideElement element){
        actions().moveToElement(element).click();
        element.click();
    }

    public static void twoElementsShouldBe (SelenideElement element1,
                                            SelenideElement element2,
                                            String string) {

        sleep(HALF_SECOND);
        element1.click();
        element2.setValue(string).shouldBe(Condition.visible).pressEnter();
    }

    public static void actionClickAndEnter (SelenideElement element,
                                            String string) {
        sleep(HALF_SECOND);
        element.click();
        actions().moveToElement(element).sendKeys(string).pause(TIME_TO_PAUSE).sendKeys(Keys.chord((Keys.ENTER))).build().perform();
    }

    public static void simpleActionClick (SelenideElement element1,
                                          String string) {
        sleep(HALF_SECOND);
        element1.scrollIntoView(true).click();
        actions().moveToElement(element1).sendKeys(string).pause(TIME_TO_PAUSE).build().perform();
    }
    public static void simpleClickTwoElements (SelenideElement element1,
                                               SelenideElement element2 ) {
        sleep(HALF_SECOND);
        element1.click();
        element2.click();
    }
    public static void addressAction (SelenideElement element,
                                      String string){
        sleep(HALF_SECOND);
        element.click();
        actions().moveToElement(element).sendKeys(string).pause(TIME_TO_PAUSE).sendKeys(Keys.DOWN, Keys.ENTER).pause(TIME_TO_PAUSE).build().perform();
    }
}
