package steps;

import io.qameta.allure.Step;
import org.junit.Assert;
import pages.SendAppPage;

import java.util.LinkedHashMap;

import static org.junit.Assert.assertTrue;

public class SendAppSteps {
    @Step("поле {0} заполняется значением {1}")
    public void fillField(String field, String value) {
        new SendAppPage().fillField(field, value);
    }

    @Step("поле {0} заполнено значением {1}")
    public void checkFillField(String field, String value) {
        String actual = new SendAppPage().getFillField(field);
        Assert.assertEquals(String.format("Значение поля [%s] равно [%s]. Ожидалось - [%s]", field, actual, value), actual, value);
    }

    @Step("заполняются поля")
    public void fillFields(LinkedHashMap<String, String> fields) {
        fields.forEach(this::fillField);
    }

    @Step("поля заполнены верно")
    public void checkFillFields(LinkedHashMap<String, String> fields) {
        fields.forEach(this::checkFillField);
    }

    @Step("нажимается кнопка 'Продолжить'")
    public void clickSendButton() {
        new SendAppPage().sendResult();
    }

    @Step("сообщение об ошибке - При заполнении данных произошла ошибка {0}")
    public void checkErrorMessage(String validationMessage) {
        String actualTitle = new SendAppPage().getFieldErrorMessage();
        assertTrue(String.format("Сообщение равно [%s]. Ожидалось - [%s]",
                actualTitle, validationMessage), actualTitle.contains(validationMessage));
    }
}
