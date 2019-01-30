package pages;

import support.DriverQA;

import java.util.NoSuchElementException;

public class CadastroForm {

    public DriverQA driver;

    public CadastroForm(DriverQA stepDriver) {
        driver = stepDriver;
    }

    public void insertEmail(String value) {
        driver.sendKeys(value, "email-input");
    }

    public void insertPassword(String value) {
        driver.sendKeys(value, "password-input");
    }

    public void clickCreateUserBtn() {
        driver.click("//*[@id=\"root\"]/div/div[2]/form/button", "xpath");
    }

    public String checkEmailMessage() {
        return driver.getText("//*[@id=\"email\"]/div", "xpath");
    }

    public String checkPasswordVld() {
        return driver.getText("//*[@id=\"password\"]/div/span", "xpath");
    }

    public String checkPasswordMsg() {
        return driver.getText("//*[@id=\"password\"]/div[2]", "xpath");
    }

    public void insertCPF(String value) {
        driver.sendKeys(value, "cpf-input");
    }

    public String checkCPFMsg() {
        return driver.getText("//*[@id=\"cpf\"]/div", "xpath");
    }

    public void insertNome(String value){
        driver.sendKeys(value, "name-input");
    }

    public void insertNascimento(String value) {
        driver.sendKeys(value, "birthday-input");
    }

    public void checkSexo(String value) {
        try{
            switch (value){
                case "feminino":
                    driver.click("//*[@id=\"gender\"]/div[2]/label", "xpath");
                    break;
                case "masculino":
                    driver.click("//*[@id=\"gender\"]/div[1]/label", "xpath");
                    break;
            }
        } catch (NoSuchElementException e){
            System.out.println("Elemento não encontrado");
        }
    }

    public void insertTelefone(String value) {
        driver.sendKeys(value, "phone-input");
    }
}

