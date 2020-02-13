package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.Init.getDriver;

public class MainPage extends BasePage {

    @FindBy(xpath = "//ul[@class = 'lg-menu__list']//button[@class = 'lg-menu__link']/span[contains(text(), 'Страхование')]")
    private WebElement menuItems;

    @FindBy(xpath = "//div[@class = 'lg-menu__sub']//a[contains(text(), 'Страхование путешественников')]")
    private WebElement menuInsurance;

    public MainPage() {
        this.driver = getDriver();
    }

    public void selectMenuItem() {
        menuItems.click();
    }

    public void selectInsuranceItem() {
        menuInsurance.click();
    }
}
