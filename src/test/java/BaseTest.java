import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import config.CustomConfiguration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import steps.page.MainPageSteps;

public class BaseTest {
    public MainPageSteps openMainPage() {
        Selenide.open(CustomConfiguration.getCommon().host());
        return new MainPageSteps();
    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.baseUrl = CustomConfiguration.getCommon().hubUrl();
        Configuration.browser = CustomConfiguration.getCommon().browser();
        Configuration.startMaximized = true;
    }

    @AfterMethod(alwaysRun = true)
        public void tearDown() {
            WebDriverRunner.closeWebDriver();
    }
}
