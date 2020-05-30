package pages;

import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {
    public String getTitleText() {
        return $("h2").getText();
    }

    public void logout() {
        $("a.button").click();
    }
}
