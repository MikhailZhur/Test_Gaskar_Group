package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckValidationContactFormTests extends BaseTest{

    private final SelenideElement
                            linkContact = $("div [href='https://gaskar.group/contact']"),
                            fieldInfo = $("[field='tn_text_1601390172510']"),
                            submitButton = $("[type='submit']"),
                            clueMessage = $(".t-input-error");

    @Test
    public void checkContactLoad() {
        open("/ru");
        linkContact.click();
        fieldInfo.shouldHave(text("мы с вами свяжемся"));
        submitButton.click();
        clueMessage.shouldHave(text("Обязательное поле"));

    }

}
