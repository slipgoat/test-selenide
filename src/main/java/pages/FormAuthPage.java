package pages;

import components.FormAuthComponent;

import static com.codeborne.selenide.Selenide.$;

public class FormAuthPage {
    private final FormAuthComponent formAuthComponent;

    public FormAuthPage() {
        this.formAuthComponent = new FormAuthComponent();
    }

    public String getTitleText() {
        return $("h2").getText();
    }

    public FormAuthComponent getFormAuth() {
        return formAuthComponent;
    }
}
