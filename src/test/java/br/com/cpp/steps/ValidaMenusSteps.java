package br.com.cpp.steps;

import br.com.cpp.runner.RunCucumberTest;
import br.com.cpp.pages.ValidaMenuPages;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class ValidaMenusSteps extends RunCucumberTest {

    ValidaMenuPages validaMenus = new ValidaMenuPages();
    @Então("a funcionalidade {} deve estar disponivel")
    public void a_funcionalidade_deve_estar_disponivel(String menu) {
        validaMenus.menuDeveEstarDisponivel(menu);
    }
    @E("o menu {} estiver disponivel")
    public void menu_deve_estar_disponivel(String menu) {
        validaMenus.validaExistenciaDoMenu(menu);
    }

    @E("o usuario clica no menu {}")
    public void o_usuario_clica_no_menu(String menu) {
        validaMenus.usuarioClicaNoMenu(menu);
    }
    @Então("o submenu {} deve estar disponivel")
    public void o_submenu_deve_estar_disponivel(String submenu) {
        validaMenus.submenuDeveEstarDisponivel(submenu);
    }
    @E("o usuario acessa o submenu {}")
    public void o_usuario_acessa_o_submenu(String submenu) {
        validaMenus.acessarSubmenu(submenu);
    }
    @E("o acesso ao submenu {} deve ser realizado com sucesso")
    public void valida_acesso_ao_submenu(String submenu){
        validaMenus.validaAcessoAoSubmenu(submenu);
    }
    @Então("o acesso a tela do relatorio {} deve ser realizado com sucesso")
    public void valida_acesso_aos_relatorios(String relatorio){
        validaMenus.validaAcessoAosRelatorios(relatorio);
    }

}
