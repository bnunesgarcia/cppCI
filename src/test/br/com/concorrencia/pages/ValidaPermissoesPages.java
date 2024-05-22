package br.com.concorrencia.pages;

import br.com.concorrencia.runner.RunCucumberTest;
import br.com.concorrencia.support.Expected;
import br.com.concorrencia.support.Utils;
import constants.MenuPerfilDeAcessoConstants;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class ValidaPermissoesPages extends RunCucumberTest {

    public void validaCampoPesquisaPermissoesDoUsuario(){
        driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.SEARCHPERMISSIONFIELD_XPATH)).isDisplayed();
    }

    public void validaPermissoesDoUsuario(){
        List<Expected> permissionsUserList = Utils.expectedUserPermissions();
        permissionsUserList.forEach(col -> {
            String valor = driver.findElement(By.xpath(col.xpath)).getText();
            Assert.assertEquals(col.valorEsperado, valor);
        });
    }

}
