package listeners;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.File;
import java.io.IOException;

public class FailedScreenshotsListener extends TestListenerAdapter {
    @Override
    public void onTestFailure(ITestResult tr) {
        super.onTestFailure(tr);
        File screenShotFile = Screenshots.takeScreenShotAsFile();
        try {
            byte[] screenShotBytes = Files.toByteArray(screenShotFile);
            saveScreenshot(screenShotBytes);
        } catch (IOException e) {
            //
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }
}
