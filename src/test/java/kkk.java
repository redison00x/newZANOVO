import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class kkk {

    @Test
    public void osago() {
        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1920x1080";
        open(allTheVariable.osago);

        sleep(500);
        $(new ByTextCaseInsensitive(allTheVariable.iSee)).click();
        sleep(500);

        assertEquals (title(), allTheVariable.title, allTheVariable.wrong);
        Wait().until(ExpectedConditions.elementToBeClickable(By.xpath(allTheVariable.clicable))).click();

        switchTo().frame($x(allTheVariable.frame));
        $(new ByTextCaseInsensitive(allTheVariable.noLicensePlate)).click();

        actions().moveToElement($x(allTheVariable.notRegistered)).click();
        $x(allTheVariable.notRegistered).click(); //не поставлен на учёт

        actions().moveToElement($x(allTheVariable.noVIN)).click();
        $x(allTheVariable.noVIN).click(); //нет вин номера

        sleep(500);
        $x(allTheVariable.chassis).scrollIntoView(true).click();
        $x(allTheVariable.chassis1).click();

        sleep(500);
        $x(allTheVariable.enterTheNumber).click();
        actions().moveToElement($x(allTheVariable.enterTheNumber)).sendKeys("X7MXKN7FP6M004128").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.passanger).click();
        $x(allTheVariable.passanger2).click();

        $x(allTheVariable.enginePower1).click();
        sleep(500);
        $x(allTheVariable.enginePower2).setValue("87").shouldBe(Condition.visible).pressEnter();

        $(new ByTextCaseInsensitive(allTheVariable.hp)).click();
        $x(allTheVariable.hP).click();

        $x(allTheVariable.categoryB).click();
        $x(allTheVariable.categoryb).click();

        sleep(500);
        $x(allTheVariable.personal).click();
        $x(allTheVariable.personal2).click();

        sleep(500);
        $x(allTheVariable.stamp).click();
        actions().moveToElement($x(allTheVariable.stamp)).sendKeys("ВАЗ").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        sleep(500);
        $x(allTheVariable.release).click();
        actions().moveToElement($x(allTheVariable.release)).sendKeys("2012").pause(500).build().perform();

        $x(allTheVariable.model).click();
        sleep(500);
        actions().moveToElement($x(allTheVariable.model)).sendKeys("2190 Granta").pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        sleep(500);

        sleep(500);
        $x(allTheVariable.seriaPTS).scrollIntoView(true).click();
        actions().moveToElement($x(allTheVariable.seriaPTS)).sendKeys("62НН").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.numberPTS).click();
        actions().moveToElement($x(allTheVariable.numberPTS)).sendKeys("236123").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.dataPTS).click();
        actions().moveToElement($x(allTheVariable.dataPTS)).sendKeys("22.01.2019").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.term1yearC).click();
        $x(allTheVariable.term1year).click();

        $(new WithTextCaseInsensitive(allTheVariable.scroll1Year)).scrollIntoView(true);

        sleep(500);
        $x(allTheVariable.dataOsago).click();
        actions().moveToElement($x(allTheVariable.dataOsago)).sendKeys("15.05.2024").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        $x(allTheVariable.buttonNext1).click();

        $(new WithTextCaseInsensitive(allTheVariable.limited)).click();

        sleep(500);
        $x(allTheVariable.surname).click();
        actions().moveToElement($x(allTheVariable.surname)).sendKeys("Жух").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.name).click();
        actions().moveToElement($x(allTheVariable.name)).sendKeys("Мух").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.middleName).click();
        actions().moveToElement($x(allTheVariable.middleName)).sendKeys("Вах").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.dateOfBirth).click();
        actions().moveToElement($x(allTheVariable.dateOfBirth)).sendKeys("15.04.1996").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        sleep(500);
        $x(allTheVariable.driverLincSeria).click();
        actions().moveToElement($x(allTheVariable.driverLincSeria)).sendKeys("9936").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.driverLincNumber).click();
        actions().moveToElement($x(allTheVariable.driverLincNumber)).sendKeys("965481").pause(500).build().perform();

        sleep(500);
        $x(allTheVariable.driverLicData).click();
        actions().moveToElement($x(allTheVariable.driverLicData)).sendKeys("10.11.2023").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        $x(allTheVariable.buttonNo).click(); //нет

        $x(allTheVariable.buttonNext2).click();

        sleep(500);
        $x(allTheVariable.login).click();
        actions().moveToElement($x(allTheVariable.login)).sendKeys("redison00x@yandex.ru").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        sleep(500);
        $x(allTheVariable.password).click();
        actions().moveToElement($x(allTheVariable.password)).sendKeys("TV23MD").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        $(new WithTextCaseInsensitive(allTheVariable.checkBox1)).click();

        sleep(500);
        $x(allTheVariable.buttonNext3).click();

        $x(allTheVariable.registAddress).click();
        sleep(500);
        actions().moveToElement($x(allTheVariable.registAddress)).sendKeys("г Нижний Новгород, ул Ульянова, д 29, кв. 23").pause(500).sendKeys(Keys.DOWN, Keys.ENTER).pause(500).build().perform();
        sleep(500);

        $x(allTheVariable.buttonNext4).click();

        sleep(500);
        $(new WithTextCaseInsensitive(allTheVariable.checkBox2)).click();

        $x(allTheVariable.buttonNext5).click();

        sleep(30000);


        Configuration.holdBrowserOpen = true;

    }
}

