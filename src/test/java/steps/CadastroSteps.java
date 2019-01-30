package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Cadastro;
import support.BaseSteps;

public class CadastroSteps extends BaseSteps {

    public static Cadastro cadastro = new Cadastro(driver);

    @Given("^User access Americanas website$")
    public void userAccessAmericanasWebsite() {
        cadastro.openPage();
    }

    @Then("^User clicks on Cadastre-se button$")
    public void userClicksOnCadastreSeButton() {
        cadastro.clickCadastreBtn();
    }

    @Then("^User clicks on Cliente Novo Cadastrar button$")
    public void userClicksOnClienteNovoCadastrarButton() {
        cadastro.clickClienteNovo();
    }

    @Then("^User should see the \"([^\"]*)\" form$")
    public void userShouldSeeTheForm(String value) throws Throwable {
        Assert.assertEquals(value, cadastro.checkCadastreForm());
    }
}
