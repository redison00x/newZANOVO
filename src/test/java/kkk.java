import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTextCaseInsensitive;
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
        open("https://www.rgs.ru/auto/osago");
        assertEquals (title(), "ОСАГО онлайн: калькулятор еОСАГО", "Не тудой приперся");
        Selenide.Wait().until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='action-item btn--basic']"))).click();

        switchTo().frame($x("//*[@id='RESOLUTE_INSURANCE']"));
        $(new ByTextCaseInsensitive("Нет госномера")).click();

        $x("//div[contains(text(),'Легковые ТС')]").click();
        $x("//div[text()='Легковые ТС (B)']").click();
        sleep(1000);

        $x("(//div[@class='input-group'])[1]").click();
        sleep(1000);
        $x("//*[@placeholder='Мощность двигателя']").setValue("87").shouldBe(Condition.visible).pressEnter();


        $(new ByTextCaseInsensitive("л.с.")).click();
        $x("//div[text()='л.с.']").click();

        sleep(1000);
        $x("//div[contains(text(),'Легковой')]").click();
        $x("//div[text()='Легковой']").click();

        sleep(1000);
        $x("//div[contains(text(),'Личная')]").click();
        $x("//div[text()='Личная']").click();

        sleep(1000);
        $x("//div[contains(text(),'Марка')]").click();
        actions().moveToElement($x("//div[contains(text(),'Марка')]")).sendKeys("ВАЗ").pause(500).sendKeys(Keys.chord(Keys.ENTER)).build().perform();
        sleep(1000);

        sleep(1000);
        $x("//*[@placeholder='Год выпуска']").click();
        actions().moveToElement($x("//*[@placeholder='Год выпуска']")).sendKeys("2012").pause(500).build().perform();

        $x("//div[contains(text(),'Модель')]").click();
        actions().moveToElement($x("//div[contains(text(),'Модель')]")).sendKeys("2190 Granta").sendKeys(Keys.chord(Keys.ENTER)).pause(500).build().perform();
        sleep(1000);




    }
}

