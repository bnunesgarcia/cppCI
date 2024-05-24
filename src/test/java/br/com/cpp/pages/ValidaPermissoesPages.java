package br.com.cpp.pages;

import br.com.cpp.runner.RunCucumberTest;
import br.com.cpp.support.Expected;
import br.com.cpp.support.Utils;
import br.com.cpp.constants.MenuPerfilDeAcessoConstants;
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
