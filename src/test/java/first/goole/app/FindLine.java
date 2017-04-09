package first.goole.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.text;

public class FindLine {
    @Test
    public void userFindPage() {
        open("http://google.ru");

        $(By.name("q")).setValue("selenium").pressEnter();

        $("div.srg cite").shouldHave(text("seleniumhq.org"));

        $(By.xpath("//a[@class='q qs' and (.='Images' or .='Картинки')]")).click();

        assertTrue($("a.rg_l").getAttribute("href").contains("seleniumhq.org"));

        $(By.xpath("//a[@class='q qs' and (.='All' or .='Все')]")).click();

        $("div.srg cite").shouldHave(text("seleniumhq.org"));
    }
}
