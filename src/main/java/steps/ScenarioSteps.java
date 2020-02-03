package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.Map;

public class ScenarioSteps {
    MainPageSteps mainPageSteps = new MainPageSteps();
    SberSteps sberSteps = new SberSteps();
    PolicySteps policySteps = new PolicySteps();
    SendAppSteps sendAppSteps = new SendAppSteps();

    @When("выбран пункт меню")
    public void selectMenuItem(){
        mainPageSteps.selectMenuItem();
    }

    @When("^выбран вид страхования$")
    public void selectMenuInsurance(){
        mainPageSteps.selectMenuInsurance();
    }

    @Then("^заголовок страницы - Страхование путешественников равен$")
    public void checkTitleSberPage(){
        sberSteps.checkPageTitle();
    }

    @When("^выполнено нажатие на кнопку Оформить онлайн$")
    public void clickBtnSendApp(){
        sberSteps.goToPolicyPage();
    }

    @When("^выбрана Минимальная сумма страховой защиты$")
    public void clickMinimal(){
        policySteps.selectMinimal();
    }

    @When("^нажата кнопка Оформить$")
    public void clickGoToSendAppPage(){
        policySteps.goToSendAppPage();
    }

    @When("^заполняются поля$")
    public void fillForm(DataTable fields){
        fields.asMap(String.class, String.class).forEach((field, value) -> sendAppSteps.fillField(field.toString(), value.toString()));

    }

    @Then("^значения полей равны$")
    public void checkFillFields(Map<String, String> fields){
        fields.forEach((field, value) -> sendAppSteps.checkFillField(field.toString(), value.toString()));
    }

    @When("^нажата кнопка продолжить$")
    public void clickSendButton(){
        sendAppSteps.clickSendButton();
    }

    @Then("^выведено сообщение об ошибке$")
    public void checkErrorMessage(){
        sendAppSteps.checkErrorMessage("При заполнении данных произошла ошибка");
    }

}
