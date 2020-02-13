package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.Init.getDriver;

public class SendAppPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class, 'active') and contains(., 'Оформление')]")
    private WebElement navMenu;

    @FindBy(xpath = "//input[@id = 'surname_vzr_ins_0']")
    private WebElement insuredLastName;

    @FindBy(xpath = "//input[@id = 'name_vzr_ins_0']")
    private WebElement insuredName;

    @FindBy(xpath = "//input[@id = 'birthDate_vzr_ins_0']")
    private WebElement insuredDateOfBirth;

    @FindBy(xpath = "//input[@id = 'person_lastName']")
    private WebElement payerLastName;

    @FindBy(xpath = "//input[@id = 'person_firstName']")
    private WebElement payerName;

    @FindBy(xpath = "//input[@id = 'person_middleName']")
    private WebElement payerMiddleName;

    @FindBy(xpath = "//input[@id = 'person_birthDate']")
    private WebElement payerDateOfBirth;

    @FindBy(xpath = "//input[@id = 'passportSeries']")
    private WebElement docSeries;

    @FindBy(xpath = "//input[@id = 'passportNumber']")
    private WebElement docNumber;

    @FindBy(xpath = "//input[@id = 'documentDate']")
    private WebElement docDate;

    @FindBy(xpath = "//input[@id = 'documentIssue']")
    private WebElement docIssue;

    @FindBy(xpath = "//button[contains(text(), 'Продолжить')]")
    private WebElement sendButton;

    @FindBy(xpath = "//div[@class ='alert-form alert-form-error']")
    private WebElement validationMessage;

    public SendAppPage() {
        this.driver = getDriver();
    }

    public void waitNavVisible() {
        waitForElement(navMenu);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Фамилия застрахованного":
                fillField(insuredLastName, value);
                break;
            case "Имя застрахованного":
                fillField(insuredName, value);
                break;
            case "Дата рождения застрахованного":
                fillField(insuredDateOfBirth, value);
                break;
            case "Фамилия страхователя":
                fillField(payerLastName, value);
                break;
            case "Имя страхователя":
                fillField(payerName, value);
                break;
            case "Отчество страхователя":
                fillField(payerMiddleName, value);
                break;
            case "Дата рождения страхователя":
                fillField(payerDateOfBirth, value);
                break;
            case "Серия паспорта":
                fillField(docSeries, value);
                break;
            case "Номер паспорта":
                fillField(docNumber, value);
                break;
            case "Дата выдачи паспорта":
                fillField(docDate, value);
                break;
            case "Кем выдан":
                fillField(docIssue, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }

    public String getFillField(String fieldName) {
        switch (fieldName) {
            case "Фамилия застрахованного":
                return insuredLastName.getAttribute("value");
            case "Имя застрахованного":
                return insuredName.getAttribute("value");
            case "Дата рождения застрахованного":
                return insuredDateOfBirth.getAttribute("value");
            case "Фамилия страхователя":
                return payerLastName.getAttribute("value");
            case "Имя страхователя":
                return payerName.getAttribute("value");
            case "Отчество страхователя":
                return payerMiddleName.getAttribute("value");
            case "Дата рождения страхователя":
                return payerDateOfBirth.getAttribute("value");
            case "Серия паспорта":
                return docSeries.getAttribute("value");
            case "Номер паспорта":
                return docNumber.getAttribute("value");
            case "Дата выдачи паспорта":
                return docDate.getAttribute("value");
            case "Кем выдан":
                return docIssue.getAttribute("value");
        }
        throw new AssertionError("Поле не объявлено на странице");
    }

    public String getFieldErrorMessage() {
        return validationMessage.getText();
    }

    public void sendResult() {
        sendButton.click();
    }
}
