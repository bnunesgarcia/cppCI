package br.com.cpp.pages;

import br.com.cpp.runner.RunCucumberTest;
import br.com.cpp.constants.MenuPerfilDeAcessoConstants;
import br.com.cpp.constants.MenuUsuariosConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidaCadastroPages extends RunCucumberTest {

    public void botaoAddUsuariosOuPerfilAcesso(String tipoCadastro) {
        if (tipoCadastro.equals("usuarios")) {
            driver.findElement(By.xpath(MenuUsuariosConstants.ADDUSER_BTN_XPATH)).isDisplayed();
        } else if (tipoCadastro.equals("perfis de acesso")) {
            driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.ADDPERFILACESSO_BTN_XPATH)).isDisplayed();
        }
    }

    public void clicarBotaoAddUsuarioOuPerfilDeAcesso(String tipoCadastro){
        if (tipoCadastro.equals("usuarios")) {
            driver.findElement(By.xpath(MenuUsuariosConstants.ADDUSER_BTN_XPATH)).click();
        } else if (tipoCadastro.equals("perfis de acesso")) {
            driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.ADDPERFILACESSO_BTN_XPATH)).click();
        }
    }

    public void validaAcessoTelaCadastroUsuarioOuPerfilDeAcesso(String tipoCadastro){
        if (tipoCadastro.equals("usuarios")) {
            WebElement element = driver.findElement(By.xpath(MenuUsuariosConstants.TITLEADDUSER_SCREEN_XPATH));
            String text = element.getText();
//            System.out.println(text);
            Assert.assertEquals(text, "Cadastrar Novo Usuário");
        } else if (tipoCadastro.equals("perfis de acesso")) {
            WebElement element = driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.TITLEADDACCESSPROFILE_SCREEN_XPATH));
            String text = element.getText();
//            System.out.println(text);
            Assert.assertEquals(text, "Cadastrar Novo Perfil de Acesso");
        }
    }

    public void camposTelaCadastroUsuarioOuPerfilDeAcesso(String tipoCadastro){
        if (tipoCadastro.equals("usuarios")) {
            String[] xpaths = {
                    MenuUsuariosConstants.REGISTERNAMEFIELD_XPATH,
                    MenuUsuariosConstants.REGISTEREMAILFIELD_XPATH,
                    MenuUsuariosConstants.REGISTERLOGINFIELD_XPATH,
                    MenuUsuariosConstants.REGISTERACCESSPROFILEFIELD_XPATH,
                    MenuUsuariosConstants.SAVENEWUSER_BTN_XPATH,
                    MenuUsuariosConstants.CANCELREGISTERUSER_BTN_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        } else if (tipoCadastro.equals("perfis de acesso")) {
            String[] xpaths = {
                    MenuPerfilDeAcessoConstants.REGISTERTITLEFIELD_XPATH,
                    MenuPerfilDeAcessoConstants.REGISTERDESCRIPTTION_FIELD_XPATH,
                    MenuPerfilDeAcessoConstants.SAVENEWACCESSPROFILE_BTN_XPATH,
                    MenuPerfilDeAcessoConstants.CANCELREGISTERACCESSPROFILE_BTN_XPATH
            };
            for (String xpath : xpaths) {
                driver.findElement(By.xpath(xpath)).isDisplayed();
            }
        }
    }
}
