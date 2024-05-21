package product.sravni.osago;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import product.services.data.BeforeTests;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;
import static product.services.data.Constants.*;
import static product.services.data.Urls.RGS_OSAGO;
import static product.sravni.osago.PageElements.*;

public class Calculate {

    public static void startCalculate () {


       open(RGS_OSAGO);
       sleep(HALF_SECOND);

       I_SEE.click();
       assertEquals (title(), TITLE, WRONG);
       Wait().until(ExpectedConditions.elementToBeClickable(CLICABLE)).click();

       switchTo().frame(FRAME);
       WITH_OUT_LISENCE.click();

       actions().moveToElement(NOT_REGISTERED).click();
       NOT_REGISTERED.click();

       actions().moveToElement(NO_VIN).click();
       NO_VIN.click();

       sleep(HALF_SECOND);
       CHASSIS_1.scrollIntoView(false).click();
       CHASSIS_2.click();

       sleep(HALF_SECOND);
       ENTER_THE_NUMBER.click();
       actions().moveToElement(ENTER_THE_NUMBER).sendKeys(CHASSIS_NUMBER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       PASSENGER_1.click();
       PASSENGER_2.click();

       sleep(HALF_SECOND);
       ENGINE_POWER_1.click();
       ENGINE_POWER_2.setValue(ENGINE_POWER_NUMBER).shouldBe(Condition.visible).pressEnter();

       sleep(HALF_SECOND);
       HORSEPOWER.click();
       HORSE_POWER.click();

       sleep(HALF_SECOND);
       CATEGORYB.click();
       CATEGORY_B.click();

       sleep(HALF_SECOND);
       PERSONAL_1.click();
       PERSONAL_2.click();

       sleep(HALF_SECOND);
       STAMP.click();
       actions().moveToElement(STAMP).sendKeys(STAMP_AVTO).pause(TIME_TO_PAUSE).sendKeys(Keys.chord((Keys.ENTER))).build().perform();

       sleep(HALF_SECOND);
       RELEASE.click();
       actions().moveToElement(RELEASE).sendKeys(RELEASE_AVTO).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       MODEL.click();
       actions().moveToElement(MODEL).sendKeys(MODEL_AVTO).pause(TIME_TO_PAUSE).sendKeys(Keys.chord((Keys.ENTER))).build().perform();

       sleep(HALF_SECOND);
       SERIA_PTS.scrollIntoView(true).click();
       actions().moveToElement(SERIA_PTS).sendKeys(SERIA_PTS_AVTO).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       NUMBER_PTS.click();
       actions().moveToElement(NUMBER_PTS).sendKeys(NUMBER_PTS_AVTO).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       DATA_PTS.click();
       actions().moveToElement(DATA_PTS).sendKeys(DATA_PTS_AVTO).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       TERM_1_YEAR_1.click();
       TERM_1_YEAR_2.click();

       sleep(HALF_SECOND);
       SCROLL_TO_1_YEAR.scrollIntoView(true);

       sleep(HALF_SECOND);
       DATA_START_OSAGO.click();
       actions().moveToElement(DATA_START_OSAGO).sendKeys(DATA_OSAGO).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       BUTTON_NEXT_1.click();

       LIMITED.click();

       sleep(HALF_SECOND);
       SURNAME.click();
       actions().moveToElement(SURNAME).sendKeys(SURNAME_USER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       NAME.click();
       actions().moveToElement(NAME).sendKeys(NAME_USER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       MIDDLE_NAME.click();
       actions().moveToElement(MIDDLE_NAME).sendKeys(MIDDLE_NAME_USER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       DATE_OF_BIRTH.click();
       actions().moveToElement(DATE_OF_BIRTH).sendKeys(DATE_OF_BIRTH_USER).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       sleep(HALF_SECOND);
       DRIVER_LIC_SERIA.click();
       actions().moveToElement(DRIVER_LIC_SERIA).sendKeys(DRIVER_LIC_SERIA_USER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       DRIVER_LIC_NUMBER.click();
       actions().moveToElement(DRIVER_LIC_NUMBER).sendKeys(DRIVER_LIC_NUMBER_USER).pause(TIME_TO_PAUSE).build().perform();

       sleep(HALF_SECOND);
       DRIVER_LIC_DATA.click();
       actions().moveToElement(DRIVER_LIC_DATA).sendKeys(DRIVER_LIC_DATA_USER).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       BUTTON_NO.click();

       BUTTON_NEXT_2.click();

       sleep(HALF_SECOND);
       LOGIN.click();
       actions().moveToElement(LOGIN).sendKeys(LOGIN_).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       sleep(HALF_SECOND);
       PASSWORD.click();
       actions().moveToElement(PASSWORD).sendKeys(PASSWORD_).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       CHECK_BOX_GIVE.click();

       sleep(HALF_SECOND);
       BUTTON_NEXT_3.click();

       RESIDENT.click();

       PASSPORT.click();
       PASSPORT_RF.click();

       sleep(HALF_SECOND);
       SERIA_PASSPORT.click();
       actions().moveToElement(SERIA_PASSPORT).sendKeys(SERIA_PASSPORT_USER).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       sleep(HALF_SECOND);
       NUMBER_PASSPORT.click();
       actions().moveToElement(NUMBER_PASSPORT).sendKeys(NUMBER_PASSPORT_USER).pause(TIME_TO_PAUSE).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

       sleep(HALF_SECOND);
       REGIST_ADDRESS.click();
       actions().moveToElement(REGIST_ADDRESS).sendKeys(ADDRESS).pause(TIME_TO_PAUSE).sendKeys(Keys.DOWN, Keys.ENTER).pause(TIME_TO_PAUSE).build().perform();

       BUTTON_NEXT_4.click();

       sleep(HALF_SECOND);
       CHECK_BOX_OK.click();

       BUTTON_NEXT_5.click();

       sleep(SLEEP_END);

       Configuration.holdBrowserOpen = true;

    }
}
