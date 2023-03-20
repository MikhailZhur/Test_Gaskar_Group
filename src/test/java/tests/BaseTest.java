package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void openBrowser() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://gaskar.group";
        Configuration.screenshots = false;
    }
}
