package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.Init.getDriver;

public class SberPage extends BasePage {
    @FindBy(xpath = "//span/../../..//h2[contains(text(), 'Страхование путешественников')]")
    private static WebElement h2;

    @FindBy(xpath = "//b[contains(text(), 'Оформить онлайн')]")
    private WebElement sendToPolicy;

    public WebElement checkH2() {
        Assert.assertEquals("Страхование путешественников", h2.getText());
        return h2;
    }

    public void selectSendToPolicy() {
        waitForElement(sendToPolicy);
        waitForClickable(sendToPolicy);
        sendToPolicy.click();
    }

    public SberPage() {
        this.driver = getDriver();
    }
}
