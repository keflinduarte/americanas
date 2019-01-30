package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import pages.Produto;
import support.BaseSteps;

public class ProdutoSteps extends BaseSteps {

    public static Produto produto = new Produto(driver);

    @And("^User inserts \"([^\"]*)\" on Search field$")
    public void userInsertsOnSearchField(String value) throws Throwable {
        produto.searchProduto(value);
    }

    @And("^User press Enter$")
    public void userPressEnter() {
        produto.searchPressEnter();
    }

    @And("^User selects a product$")
    public void userSelectsAProduct() {
        produto.selectProduct();
    }

    @And("^User clicks on Comprar button$")
    public void userClicksOnComprarButton() {
        produto.clickComprarBtn();
    }

    @And("^User clicks on Continuar button to checkout$")
    public void userClicksOnContinuarButtonToCheckout() {
        produto.clickContinuarCheckOut();
    }

    @And("^User selects \"([^\"]*)\" as Quantidade$")
    public void userSelectsAsQuantidade(String value) throws Throwable {
        produto.selectQntd(value);
    }

    @And("^User checks the \"([^\"]*)\" as Total price$")
    public void userChecksTheAsTotalPrice(String value) throws Throwable {
        Assert.assertEquals(value, produto.checkTotalPrice());
    }

    @And("^User checks the \"([^\"]*)\" checkout message$")
    public void userChecksTheCheckoutMessage(String value) throws Throwable {
        Assert.assertEquals(value, produto.checkMsg());
    }

    @And("^User clicks the Continuar button to buy the product$")
    public void userClicksTheContinuarButtonToBuyTheProduct() {
        produto.clickCntCompra();
    }
}
