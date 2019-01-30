package pages;

import support.DriverQA;

import java.util.NoSuchElementException;

public class Produto {

    public DriverQA driver;

    public Produto(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void searchProduto(String value) {
        driver.sendKeys(value, "h_search-input");
    }

    public void searchPressEnter(){
        driver.sendKeyboard("h_search-input", "ENTER");
    }

    public void selectProduct() {
        driver.click("//*[@id=\"content-middle\"]/div[4]/div/div/div/div[1]/div[1]/a/section/div[2]", "xpath");
    }

    public void clickComprarBtn() {
        driver.click("btn-buy");
    }

    public void clickContinuarCheckOut() {
        driver.click("btn-continue");
    }

    public void selectQntd(String value) {
        driver.selectByText(value, "//*[@id=\"app\"]/section/section/div[1]/div[1]/section/ul/li/div[2]/div[2]/div/select", "xpath");
    }

    public String checkTotalPrice() {
        return driver.getText("//*[@id=\"app\"]/section/section/div[1]/div[1]/section/ul/li/div[2]/div[4]/span", "xpath");
    }

    public String checkMsg() {
        return driver.getText("//*[@id=\"app\"]/section/section/div[2]/div/div/div", "xpath");
    }

    public void clickCntCompra(){
        driver.click("buy-button");
    }
}
