package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CadastroForm;
import support.BaseSteps;

public class CadastroFormSteps extends BaseSteps {

    public static CadastroForm cadastroForm = new CadastroForm(driver);

    @Given("^User inserts \"([^\"]*)\" as Email$")
    public void userInsertsAsEmail(String value) throws Throwable {
        cadastroForm.insertEmail(value);
    }

    @When("^User inserts \"([^\"]*)\" as Senha$")
    public void userInsertsAsSenha(String value) throws Throwable {
        cadastroForm.insertPassword(value);
    }

    @When("^User clicks on Criar seu Cadastro button$")
    public void userClicksOnCriarSeuCadastroButton() {
        cadastroForm.clickCreateUserBtn();
    }

    @Then("^User gets the message \"([^\"]*)\"$")
    public void userGetsTheMessage(String value) throws Throwable {
        Assert.assertEquals(value, cadastroForm.checkEmailMessage());
    }

    @And("^User should see the \"([^\"]*)\" validation$")
    public void userShouldSeeTheValidation(String value) throws Throwable {
        Assert.assertEquals(value, cadastroForm.checkPasswordVld());
    }

    @And("^User should see the \"([^\"]*)\" password message$")
    public void userShouldSeeThePasswordMessage(String value) throws Throwable {
        Assert.assertEquals(value, cadastroForm.checkPasswordMsg());
    }

    @And("^User inserts \"([^\"]*)\" as CPF$")
    public void userInsertsAsCPF(String value) throws Throwable {
        cadastroForm.insertCPF(value);
    }

    @Then("^User should see the \"([^\"]*)\" as CPF validation message$")
    public void userShouldSeeTheAsCPFValidationMessage(String value) throws Throwable {
        Assert.assertEquals(value, cadastroForm.checkCPFMsg());
    }

    @And("^User inserts \"([^\"]*)\" as Nome$")
    public void userInsertsAsNome(String value) throws Throwable {
        cadastroForm.insertNome(value);
    }

    @And("^User inserts \"([^\"]*)\" as Nascimento$")
    public void userInsertsAsNascimento(String value) throws Throwable {
        cadastroForm.insertNascimento(value);
    }

    @And("^User mark the \"([^\"]*)\" checkbox$")
    public void userMarkTheCheckbox(String value) throws Throwable {
        cadastroForm.checkSexo(value);
    }

    @And("^User inserts \"([^\"]*)\" as Telefone$")
    public void userInsertsAsTelefone(String value) throws Throwable {
        cadastroForm.insertTelefone(value);
    }
}
