package pages;

import support.DriverQA;

public class Cadastro {

    public DriverQA driver;

    public Cadastro(DriverQA stepDriver){
        driver = stepDriver;
    }

    public void openPage(){
        String url = "https://www.americanas.com.br";
        driver.openURL(url);
    }

    public void clickCadastreBtn() {
        driver.click("h_user");
    }

    public void clickClienteNovo() {
        driver.click("//*[@id=\"h_user\"]/span[2]/div/a[2]", "xpath");
    }

    public String checkCadastreForm() {
        return driver.getText("//*[@id=\"root\"]/div/div[2]/h2/span", "xpath");
    }
}
