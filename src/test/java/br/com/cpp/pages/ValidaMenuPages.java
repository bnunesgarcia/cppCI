package br.com.cpp.pages;

import br.com.cpp.runner.RunCucumberTest;
import br.com.cpp.constants.DashboardConstants;
import br.com.cpp.constants.MenuPerfilDeAcessoConstants;
import br.com.cpp.constants.MenuUsuariosConstants;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidaMenuPages extends RunCucumberTest {
    public void menuDeveEstarDisponivel(String menu) {
        if (menu.equals("administracao")) {
            driver.findElement(By.xpath(DashboardConstants.ADM_MENU_XPATH)).isDisplayed();
        } else if (menu.equals("perfil e audiencia")) {
            driver.findElement(By.xpath(DashboardConstants.PERFILAUDIENCIA_MENU_XPATH)).isDisplayed();
        } else if (menu.equals("estudo cpp")) {
            driver.findElement(By.xpath(DashboardConstants.ESTUDOCPP_MENU_XPATH)).isDisplayed();
        }
    }

    public void validaExistenciaDoMenu(String menu) {
        if (menu.equals("administracao")) {
            driver.findElement(By.xpath(DashboardConstants.ADM_MENU_XPATH)).isDisplayed();
        } else if (menu.equals("perfil e audiencia")) {
            driver.findElement(By.xpath(DashboardConstants.PERFILAUDIENCIA_MENU_XPATH)).isDisplayed();
        } else if (menu.equals("estudo cpp")) {
            driver.findElement(By.xpath(DashboardConstants.ESTUDOCPP_MENU_XPATH)).isDisplayed();
        }
    }

    public void usuarioClicaNoMenu(String menu) {
        if (menu.equals("administracao")) {
            driver.findElement(By.xpath(DashboardConstants.ADM_MENU_XPATH)).click();
        } else if (menu.equals("perfil e audiencia")) {
            driver.findElement(By.xpath(DashboardConstants.PERFILAUDIENCIA_MENU_XPATH)).click();
        } else if (menu.equals("estudo cpp")) {
            driver.findElement(By.xpath(DashboardConstants.ESTUDOCPP_MENU_XPATH)).click();
        }
    }

    public void submenuDeveEstarDisponivel(String submenu) {
        if (submenu.equals("usuario")) {
            driver.findElement(By.xpath(DashboardConstants.USUARIO_MENU_XPATH)).isEnabled();
        } else if (submenu.equals("perfil de acesso")) {
            driver.findElement(By.xpath(DashboardConstants.PERFILACESSO_MENU_XPATH)).isEnabled();
        }
    }

    public void acessarSubmenu(String submenu) {
        if (submenu.equals("usuario")) {
            driver.findElement(By.xpath(DashboardConstants.USUARIO_MENU_XPATH)).click();
        } else if (submenu.equals("perfil de acesso")) {
            driver.findElement(By.xpath(DashboardConstants.PERFILACESSO_MENU_XPATH)).click();
        }
    }

    public void validaAcessoAoSubmenu(String submenu){
        if (submenu.equals("usuario")) {
            WebElement element = driver.findElement(By.xpath(MenuUsuariosConstants.TITLEUSER_SCREEN_XPATH));
            String text = element.getText();
//            System.out.println(text);
            Assert.assertEquals(text, "Administrar Usuários");
        } else if (submenu.equals("perfil de acesso")) {
            WebElement element = driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.TITLEPERFILACESSO_SCREEN_XPATH));
            String text = element.getText();
//            System.out.println(text);
            Assert.assertEquals(text, "Administrar Perfis de Acesso");
        }
    }

    public void validaAcessoAosRelatorios(String relatorio){
        if (relatorio.equals("perfil e audiencia")){
            WebElement element = driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.HEADER_SCREEN_XPATH));
            String text = element.getText();
            Assert.assertEquals(text, "Record CPP | Perfil e Audiência");
            System.out.println(text);
        } else if (relatorio.equals("estudo cpp")) {
            WebElement element = driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.HEADER_SCREEN_XPATH));
            String text = element.getText();
            Assert.assertEquals(text, "Record CPP | Estudo de CPP");
            System.out.println(text);
        }
    }
}
