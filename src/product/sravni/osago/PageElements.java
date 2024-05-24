package product.sravni.osago;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;
import product.services.data.Constants;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static product.services.data.Constants.*;

public class PageElements {
    private PageElements () {}

    protected static final SelenideElement I_SEE = $(new ByTextCaseInsensitive(OK));

    protected static final SelenideElement CLICABLE = $x("//a[@class='action-item btn--basic']");

    protected static final SelenideElement FRAME = $x("//*[@id='RESOLUTE_INSURANCE']");

    protected static final SelenideElement WITH_OUT_LISENCE = $(new ByTextCaseInsensitive(NOLICENSEPLATE));

    protected static final SelenideElement NOT_REGISTERED = $x("//*[@for='content.object.data.noGosNumber_custom_input']");

    protected static final SelenideElement NO_VIN = $x("//*[@for='content.object.data.noVin_custom_input']");

    protected static final SelenideElement CHASSIS_1 = $x("//div[contains(text(),'Шасси')]");

    protected static final SelenideElement CHASSIS_2 = $x("//div[text()='Шасси']");

    protected static final SelenideElement ENTER_THE_NUMBER = $x("//*[@placeholder='Укажите номер']");

    protected static final SelenideElement PASSENGER_1 = $x("//div[contains(text(),'Легковой')]");

    protected static final SelenideElement PASSENGER_2 = $x("//div[text()='Легковой']");

    protected static final SelenideElement ENGINE_POWER_1 = $x("(//div[@class='input-group'])[1]");

    protected static final SelenideElement ENGINE_POWER_2 = $x("//*[@placeholder='Мощность двигателя']");

    protected static final SelenideElement HORSEPOWER = $(new ByTextCaseInsensitive(HP));

    protected static final SelenideElement HORSE_POWER = $x("//div[text()='л.с.']");

    protected static final SelenideElement CATEGORYB = $x("//div[contains(text(),'B')]");

    protected static final SelenideElement CATEGORY_B = $x("//div[text()='B']");

    protected static final SelenideElement PERSONAL_1 = $x("//div[contains(text(),'Личная')]");

    protected static final SelenideElement PERSONAL_2 =$x("//div[text()='Личная']");

    protected static final SelenideElement STAMP = $x("//div[contains(text(),'Марка')]");

    protected static final SelenideElement RELEASE = $x("//*[@placeholder='Год']");

    protected static final SelenideElement MODEL =$x("//div[contains(text(),'Модель')]");

    protected static final SelenideElement SERIA_PTS = $x("//*[@name='content.object.data.pts.seria']");

    protected static final SelenideElement NUMBER_PTS = $x("//*[@placeholder='Номер']");

    protected static final SelenideElement DATA_PTS = $x("//*[@placeholder='дд.мм.гггг']");

    protected static final SelenideElement TERM_1_YEAR_1 = $x("//div[contains(text(),'1 год')]");

    protected static final SelenideElement TERM_1_YEAR_2 = $x("//div[text()='1 год']");

    protected static final SelenideElement SCROLL_TO_1_YEAR = $(new WithTextCaseInsensitive(Constants.SCROLLTO1YEAR));

    protected static final SelenideElement DATA_START_OSAGO = $x("//*[@name='content.object.data.periods[0].beginDate']");

    protected static final SelenideElement BUTTON_NEXT_1 = $x("//button[@class='btn btn-secondary']");

    protected static final SelenideElement LIMITED = $(new WithTextCaseInsensitive(LIMITED_O));

    protected static final SelenideElement SURNAME = $x("//*[@name='content.insuredPerson.list[0].lastName']");

    protected static final SelenideElement NAME = $x("//*[@name='content.insuredPerson.list[0].firstName']");

    protected static final SelenideElement MIDDLE_NAME = $x("//*[@name='content.insuredPerson.list[0].middleName']");

    protected static final SelenideElement DATE_OF_BIRTH =$x( "//*[@name='content.insuredPerson.list[0].dob']");

    protected static final SelenideElement DRIVER_LIC_SERIA = $x("//*[@name='content.insuredPerson.list[0].data.driverLicense.seria']");

    protected static final SelenideElement DRIVER_LIC_NUMBER = $x("//*[@name='content.insuredPerson.list[0].data.driverLicense.number']");

    protected static final SelenideElement DRIVER_LIC_DATA = $x("//*[@name='content.insuredPerson.list[0].data.experienceFrom']");

    protected static final SelenideElement BUTTON_NO = $x("//button[@class='btn btn-outline-primary'][2]");

    protected static final SelenideElement BUTTON_NEXT_2 = $x("//*[@class='btn btn-secondary']");

    protected static final SelenideElement LOGIN = $x("//*[@placeholder='Логин (email)']");

    protected static final SelenideElement PASSWORD = $x("//*[@placeholder='Пароль']");

    protected static final SelenideElement CHECK_BOX_GIVE = $(new WithTextCaseInsensitive(CHECKBOXGIVE));

    protected static final SelenideElement BUTTON_NEXT_3 = $x("//*[@class='my-3 btn btn-secondary btn-block']");

    protected static final SelenideElement RESIDENT = $x("//*[@class='w-100 btn btn-primary']");

    protected static final SelenideElement PASSPORT = $x("//*[@class='SelectFieldInner__single-value css-1uccc91-singleValue']");

    protected static final SelenideElement PASSPORT_RF =$x("//div[text()='Паспорт гражданина РФ']");

    protected static final SelenideElement SERIA_PASSPORT = $x("//*[@placeholder='Серия']");

    protected static final SelenideElement NUMBER_PASSPORT = $x("//*[@placeholder='Номер']");

    protected static final SelenideElement REGIST_ADDRESS = $x("//*[@placeholder='Адрес регистрации']");

    protected static final SelenideElement BUTTON_NEXT_4 = $x("//*[@class='btn btn-secondary btn-block']");

    protected static final SelenideElement BUTTON_NEXT_5 = $x("//*[@class='btn btn-secondary btn-block']");

    protected static final SelenideElement CHECK_BOX_OK = $(new WithTextCaseInsensitive(CHECKBOXOK));


}
