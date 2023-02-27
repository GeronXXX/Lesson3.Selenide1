import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class automationPractice {
    @AfterAll
    static void after() {Configuration.holdBrowserOpen = true;
    }
    @BeforeAll
    static void beforeALL() {
        Configuration.baseUrl = "https://github.com";
    }
    @Test
    void practiceForm() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(".js-wiki-more-pages-link").click();
        $(By.linkText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("3. Using JUnit5 extend test class:"));
    }
}
