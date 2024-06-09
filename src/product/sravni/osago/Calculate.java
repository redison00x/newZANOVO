package product.sravni.osago;

import product.services.data.BeforeTests;
import static com.codeborne.selenide.Selenide.*;
import static product.services.data.Constants.*;
import static product.services.data.Urls.RGS_OSAGO;
import static product.sravni.osago.PageElements.*;
import static test.product.ui.UiHelper.*;
import static test.product.ui.UiHelper.simpleActionClick;

public class Calculate {

    public static void startCalculate () {

       pathToFrame (RGS_OSAGO, I_SEE, TITLE, WRONG, CLICABLE, FRAME, WITH_OUT_LISENCE);

       actionClickOneElement(NOT_REGISTERED);
       actionClickOneElement(NO_VIN);

       simpleClickTwoElements(CHASSIS_1,CHASSIS_2);

       actionClickAndEnter(ENTER_THE_NUMBER,CHASSIS_NUMBER);

       simpleClickTwoElements(PASSENGER_1,PASSENGER_2);

       twoElementsShouldBe(ENGINE_POWER_1, ENGINE_POWER_2, ENGINE_POWER_NUMBER);

       simpleClickTwoElements(HORSEPOWER, HORSE_POWER);

       simpleClickTwoElements(CATEGORYB,CATEGORY_B);

       simpleClickTwoElements(PERSONAL_1,PERSONAL_2);

       actionClickAndEnter(STAMP,STAMP_AVTO);

       simpleActionClick(RELEASE,RELEASE_AVTO);

       actionClickAndEnter(MODEL,MODEL_AVTO);

       simpleActionClick(SERIA_PTS,SERIA_PTS_AVTO);

       simpleActionClick(NUMBER_PTS,NUMBER_PTS_AVTO);

       simpleActionClick(DATA_PTS,DATA_PTS_AVTO);

       simpleClickTwoElements(TERM_1_YEAR_1,TERM_1_YEAR_2);

       SCROLL_TO_1_YEAR.scrollIntoView(true);

       actionClickAndEnter(DATA_START_OSAGO,DATA_OSAGO);

       elementClick(BUTTON_NEXT_1);

       elementClick(LIMITED);

       simpleActionClick(SURNAME,SURNAME_USER);

       simpleActionClick(NAME,NAME_USER);

       simpleActionClick(MIDDLE_NAME,MIDDLE_NAME_USER);

       actionClickAndEnter(DATE_OF_BIRTH,DATE_OF_BIRTH_USER);

       actionClickAndEnter(DRIVER_LIC_SERIA,DRIVER_LIC_SERIA_USER);

       actionClickAndEnter(DRIVER_LIC_NUMBER,DRIVER_LIC_NUMBER_USER);

       actionClickAndEnter(DRIVER_LIC_DATA,DRIVER_LIC_DATA_USER);

       elementClick(BUTTON_NO);

       elementClick(BUTTON_NEXT_2);

       actionClickAndEnter(LOGIN,LOGIN_L);

       actionClickAndEnter(PASSWORD,PASSWORD_P);

       elementClick(CHECK_BOX_GIVE);

       elementClick(BUTTON_NEXT_3);

       elementClick(RESIDENT);

       simpleClickTwoElements(PASSPORT,PASSPORT_RF);

       actionClickAndEnter(SERIA_PASSPORT,SERIA_PASSPORT_USER);

       actionClickAndEnter(NUMBER_PASSPORT,NUMBER_PASSPORT_USER);

       addressAction(REGIST_ADDRESS,ADDRESS);

       elementClick(BUTTON_NEXT_4);

       elementClick(CHECK_BOX_OK);

       elementClick(BUTTON_NEXT_5);

       sleep(SLEEP_END);
    }
}
