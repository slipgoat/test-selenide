package steps.page;

import components.FlashMessageComponent;
import io.qameta.allure.Step;
import pages.SecureAreaPage;
import steps.component.FlashMessageSteps;

public class SecureAreaPageSteps {
    private final SecureAreaPage secureAreaPage;
    private final FlashMessageSteps flashMessageSteps;

    public SecureAreaPageSteps() {
        secureAreaPage = new SecureAreaPage();
        flashMessageSteps = new FlashMessageSteps();
    }

    @Step("Get title text")
    public String getTitleText() {
        return secureAreaPage.getTitleText();
    }

    @Step("Log out")
    public FormAuthPageSteps logout() {
        secureAreaPage.logout();
        return new FormAuthPageSteps();
    }

    @Step("Get successful authorization message text")
    public String getSuccessMessage() {
        return flashMessageSteps.getMessage().trim();
    }

    @Step("Close successful authorization message text")
    public SecureAreaPageSteps closeSuccessMessage() {
        flashMessageSteps.close();
        return this;
    }

    @Step("Check that message status is success")
    public Boolean isFlashMessageSuccess() {
        return flashMessageSteps.getStatus().equals(FlashMessageComponent.SUCCESS);
    }
}
