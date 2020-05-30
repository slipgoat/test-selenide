package steps.page;

import components.FlashMessageComponent;
import io.qameta.allure.Step;
import pages.FormAuthPage;
import steps.component.FlashMessageSteps;

public class FormAuthPageSteps {
    private final FormAuthPage formAuthPage;
    private final FlashMessageSteps flashMessageSteps;

    public FormAuthPageSteps() {
        this.formAuthPage = new FormAuthPage();
        this.flashMessageSteps = new FlashMessageSteps();
    }

    @Step("Get title text")
    public String getTitleText(){
        return formAuthPage.getTitleText();
    }

    @Step("Log in with username - {username}, password - {password}")
    public SecureAreaPageSteps login(String username, String password) {
        formAuthPage.getFormAuth().setUsername(username)
                .setPassword(password)
                .submit();
        return new SecureAreaPageSteps();
    }

    public String getFlashMessage() {
        return flashMessageSteps.getMessage();
    }

    public void closeFlashMessage() {
        flashMessageSteps.close();
    }

    public Boolean isFlashMessageVisible() {
        return flashMessageSteps.isVisible();
    }

    @Step("Check that message status is error")
    public Boolean isFlashMessageError() {
        return flashMessageSteps.getStatus().equals(FlashMessageComponent.ERROR);
    }

    @Step("Check that message status is success")
    public Boolean isFlashMessageSuccess() {
        return flashMessageSteps.getStatus().equals(FlashMessageComponent.SUCCESS);
    }
}
