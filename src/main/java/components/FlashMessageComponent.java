package components;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import config.CustomConfiguration;

import static com.codeborne.selenide.Selenide.$;

public class FlashMessageComponent {
    public static final String ERROR = "error";
    public static final String SUCCESS = "success";

    public String getText() {
        return root().getText();
    }

    public String getStatus() {
        if (isErrorMessage()) {
            return ERROR;
        } else if (isSuccessMessage()) {
            return SUCCESS;
        }

        return null;
    }

    public Boolean isVisible() {
        return root().isDisplayed();
    }

    public void close() {
        root().$(".close").click();
        root().waitUntil(Condition.not(Condition.visible), CustomConfiguration.getCommon().baseTimeoutMills());
    }

    private Boolean isErrorMessage() {
        return root().getAttribute("class").contains(ERROR);
    }

    private Boolean isSuccessMessage() {
        return root().getAttribute("class").contains(SUCCESS);
    }

    private SelenideElement root() {
        return $(".flash");
    }
}
