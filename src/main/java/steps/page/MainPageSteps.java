package steps.page;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage;

    public MainPageSteps() {
        mainPage = new MainPage();
    }

    @Step("Go to Form Authentication")
    public FormAuthPageSteps goToFormAuth() {
        mainPage.clickLink("Form Authentication");
        return new FormAuthPageSteps();
    }
}
