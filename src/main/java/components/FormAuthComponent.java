package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class FormAuthComponent {
    public FormAuthComponent setUsername(String username) {
        root().$("#username").val(username);
        return this;
    }

    public FormAuthComponent setPassword(String password) {
        root().$("#password").val(password);
        return this;
    }

    public void submit() {
        root().$("button").click();
    }

    private SelenideElement root() {
        return $("#login");
    }
}
