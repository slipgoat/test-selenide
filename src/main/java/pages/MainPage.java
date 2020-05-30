package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$$;

public class MainPage {
    public void clickLink(String linkText) {
        $$("li a").findBy(Condition.text(linkText)).click();
    }
}
