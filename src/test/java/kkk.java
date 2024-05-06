import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.ScrollIntoView;
import com.codeborne.selenide.commands.ScrollTo;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
import com.codeborne.selenide.selector.WithTextCaseInsensitive;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.awt.*;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class kkk {

    @Test
    public void osago() {
        Configuration.pageLoadTimeout = 5000;
        Configuration.browserSize = "1920x1080";
        open("https://www.rgs.ru/auto/osago");
        
        sleep(500);
        $(new ByTextCaseInsensitive("Понятно")).click();
        sleep(500);

        assertEquals (title(), "ОСАГО онлайн: калькулятор еОСАГО", "Не тудой приперся");
        Wait().until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='action-item btn--basic']"))).click();

        switchTo().frame($x("//*[@id='RESOLUTE_INSURANCE']"));
        $(new ByTextCaseInsensitive("Нет госномера")).click();

        $x("//div[contains(text(),'Легковые ТС')]").click();
        $x("//div[text()='Легковые ТС (B)']").click();
        sleep(500);

        $x("(//div[@class='input-group'])[1]").click();
        sleep(500);
        $x("//*[@placeholder='Мощность двигателя']").setValue("87").shouldBe(Condition.visible).pressEnter();

        $(new ByTextCaseInsensitive("л.с.")).click();
        $x("//div[text()='л.с.']").click();

        sleep(500);
        $x("//div[contains(text(),'Легковой')]").click();
        $x("//div[text()='Легковой']").click();

        sleep(500);
        $x("//div[contains(text(),'Личная')]").click();
        $x("//div[text()='Личная']").click();

        sleep(500);
        $x("//div[contains(text(),'Марка')]").click();
        actions().moveToElement($x("//div[contains(text(),'Марка')]")).sendKeys("ВАЗ").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        sleep(500);
        $x("//*[@placeholder='Год выпуска']").click();
        actions().moveToElement($x("//*[@placeholder='Год выпуска']")).sendKeys("2012").pause(500).build().perform();

        $x("//div[contains(text(),'Модель')]").click();
        sleep(500);
        actions().moveToElement($x("//div[contains(text(),'Модель')]")).sendKeys("2190 Granta").pause(500).sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        sleep(500);

        actions().moveToElement($x("//*[@for='content.object.data.noVin_custom_input']")).click();
        $x("//*[@for='content.object.data.noVin_custom_input']").click(); //нет вин номера

        actions().moveToElement($x("//*[@for='content.object.data.noGosNumber_custom_input']")).click();
        $x("//*[@for='content.object.data.noGosNumber_custom_input']").click(); //не поставлен на учёт

        sleep(500);
        $x("//div[contains(text(),'Шасси')]").scrollIntoView(true).click();
        $x("//div[text()='Шасси']").click();

        sleep(500);
        $x("//*[@placeholder='Укажите номер']").click();
        actions().moveToElement($x("//*[@placeholder='Укажите номер']")).sendKeys("X7MXKN7FP6M004128").pause(500).build().perform();

        $(new WithTextCaseInsensitive("Страховое возмещение вреда,")).scrollIntoView(false);

        sleep(500);
        $x("//*[@name='content.object.data.pts.seria']").scrollIntoView(true).click();
        actions().moveToElement($x("//*[@name='content.object.data.pts.seria']")).sendKeys("62НН").pause(500).build().perform();

        sleep(500);
        $x("//*[@placeholder='Номер']").click();
        actions().moveToElement($x("//*[@placeholder='Номер']")).sendKeys("236123").pause(500).build().perform();

        sleep(500);
        $x("//*[@placeholder='дд.мм.гггг']").click();
        actions().moveToElement($x("//*[@placeholder='дд.мм.гггг']")).sendKeys("22.01.2019").pause(500).build().perform();

        sleep(500);
        $x("//div[contains(text(),'1 год')]").click();
        $x("//div[text()='1 год']").click();

        sleep(500);
        $x("//*[@name='content.object.data.periods[0].beginDate']").click();
        actions().moveToElement($x("//*[@name='content.object.data.periods[0].beginDate']")).sendKeys("10.05.2024").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        $x("//button[@class='btn btn-secondary']").click();

        $(new WithTextCaseInsensitive("Ограниченное")).click();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].lastName']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].lastName']")).sendKeys("Жух").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].firstName']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].firstName']")).sendKeys("Мух").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].middleName']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].middleName']")).sendKeys("Вах").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].dob']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].dob']")).sendKeys("15.04.1996").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].data.driverLicense.seria']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].data.driverLicense.seria']")).sendKeys("9936").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].data.driverLicense.number']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].data.driverLicense.number']")).sendKeys("965481").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].data.driverLicense.seria']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].data.driverLicense.seria']")).sendKeys("9936").pause(500).build().perform();

        sleep(500);
        $x("//*[@name='content.insuredPerson.list[0].data.experienceFrom']").click();
        actions().moveToElement($x("//*[@name='content.insuredPerson.list[0].data.experienceFrom']")).sendKeys("10.11.2023").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();

        $x("//button[@class='btn btn-outline-primary'][2]").click();


        Configuration.holdBrowserOpen = true;

    }
}

