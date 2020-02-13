package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {
    @Step("выбран пункт меню")
    public void selectMenuItem() {
        new MainPage().selectMenuItem();
    }

    @Step("выбран вид страхования")
    public void selectMenuInsurance() {
        new MainPage().selectInsuranceItem();
    }

}


