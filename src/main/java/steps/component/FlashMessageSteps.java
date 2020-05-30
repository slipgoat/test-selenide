package steps.component;

import components.FlashMessageComponent;
import io.qameta.allure.Step;

public class FlashMessageSteps {
    private final FlashMessageComponent flashMessageComponent;

    public FlashMessageSteps() {
        this.flashMessageComponent = new FlashMessageComponent();
    }

    @Step("Get flash message text")
    public String getMessage() {
        return flashMessageComponent.getText();
    }

    @Step("Get status")
    public String getStatus() {
        String status = flashMessageComponent.getStatus();
        if (status == null) {
            throw new IllegalStateException("Undefined flash message status");
        }

        return status;
    }

    @Step("Check presence of flash message")
    public Boolean isVisible() {
        return flashMessageComponent.isVisible();
    }

    @Step("Close")
    public void close() {
        flashMessageComponent.close();
    }
}
