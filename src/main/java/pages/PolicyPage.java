package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

import static util.Init.getDriver;

public class PolicyPage extends BasePage {
    @FindBy(xpath = "//h3[contains(text(), 'Минимальная')]")
    private WebElement minimal;

    @FindBy(xpath = "//button[contains(text(), 'Оформить')]")
    private WebElement sendButton;

    public void selectMinimal() {
        minimal.click();
    }

    public void selectSendButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(sendButton);
        wait.until(ExpectedConditions.visibilityOf(sendButton));
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        sendButton.click();
    }

    public PolicyPage() {
        this.driver = getDriver();
    }
}
