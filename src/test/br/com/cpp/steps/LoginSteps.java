package br.com.concorrencia.steps;


import br.com.concorrencia.runner.RunCucumberTest;
import constants.LoginConstants;
import constants.MenuPerfilDeAcessoConstants;
import org.openqa.selenium.*;
import io.cucumber.java.pt.*;

public class LoginSteps extends RunCucumberTest {

    @Dado("que o usuario acesse a aplicacao cpp")
    public void que_eu_acesse_a_aplicacao_cpp() {
        driver.get(properties.getProperty("url"));
    }

    @E("o campo para acesso com bot MFA esteja disponivel")
    public void o_botao_Entrar_com_login_de_rede_esteja_disponível() {
        driver.findElement(By.xpath(LoginConstants.BTN_BOT_XPATH)).isDisplayed();
    }

    @Quando("o login e realizado")
    public void o_usuário_clica_no_botão_Entrar_com_login_de_rede() {
        driver.findElement(By.xpath(LoginConstants.BTN_BOT_XPATH)).click();
        driver.findElement(By.xpath(LoginConstants.IDTOKEN_FIELD_XPATH)).sendKeys(properties.getProperty("id-token"));
        driver.findElement(By.xpath(LoginConstants.ACCESSTOKEN_FIELD_XPATH)).sendKeys(properties.getProperty("access-token"));
        driver.findElement(By.xpath(LoginConstants.BTN_ENTRAR_XPATH)).click();
    }
}
