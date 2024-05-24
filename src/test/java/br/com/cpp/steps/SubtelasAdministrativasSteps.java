    package br.com.cpp.steps;

    import br.com.cpp.runner.RunCucumberTest;
    import br.com.cpp.support.Expected;
    import br.com.cpp.support.Utils;
    import br.com.cpp.constants.MenuPerfilDeAcessoConstants;
    import br.com.cpp.constants.MenuUsuariosConstants;
    import org.junit.Assert;
    import org.openqa.selenium.*;
    import io.cucumber.java.pt.*;
    import java.util.List;

    public class SubtelasAdministrativasSteps extends RunCucumberTest {

        @E("a tela {} deve conter os filtros que foram especificados")
        public void filtrosDaTelaUsuarios(String tipoTela) {
            if (tipoTela.equals("usuario")){
                String[] xpaths = {
                        MenuUsuariosConstants.TEXTFREE_FILTER_XPATH,
                        MenuUsuariosConstants.ACCESSPROFILE_FILTER_XPATH,
                        MenuUsuariosConstants.USERSTATUS_FILTER_XPATH};
                for (String xpath : xpaths) {
                    driver.findElement(By.xpath(xpath)).isEnabled();
            }
            } else if (tipoTela.equals("perfil de acesso")){
                driver.findElement(By.xpath(MenuUsuariosConstants.TEXTFREE_FILTER_XPATH)).isEnabled();
            }
        }

        @E("a tela {} deve conter os botoes de acao especificados")
        public void eATelaDeveConterBotaoDeAcaoPesquisar(String tipoTela) {
            if (tipoTela.equals("usuario")) {
                String[] xpaths = {
                        MenuUsuariosConstants.SEARCH_USER_BTN_XPATH,
                        MenuUsuariosConstants.CLEANFILTER_USER_BTN_XPATH,
                        MenuUsuariosConstants.ADDUSER_BTN_XPATH};
                for (String xpath : xpaths) {
                    driver.findElement(By.xpath(xpath)).isEnabled();
                }
            } else if (tipoTela.equals("perfil de acesso")) {
                String[] xpaths = {
                        MenuPerfilDeAcessoConstants.SEARCH_PERFILACESSO_BTN_XPATH,
                        MenuPerfilDeAcessoConstants.CLEANFILTER_PERFILACESSO_BTN_XPATH,
                        MenuPerfilDeAcessoConstants.ADDPERFILACESSO_BTN_XPATH};
                for (String xpath : xpaths) {
                    driver.findElement(By.xpath(xpath)).isEnabled();
                }
            }
        }

        @E("a tabela {} deve ser exibido")
        public void exibicaoDeUsuariosCadastrados(String tipoTabela) {
            if (tipoTabela.equals("usuarios")) {
                driver.findElement(By.xpath(MenuUsuariosConstants.USERTABLE_XPATH)).isDisplayed();
            } else if (tipoTabela.equals("perfis de acesso")){
                driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.ACCESSPROFILE_TABLE_XPATH)).isDisplayed();
            }
        }

        @E("a tabela de {} cadastrados deve conter as colunas especificadas")
        public void validarColunas(String tipoTabela) {
            if (tipoTabela.equals("usuarios")) {
                List<Expected> colunasTabelaUsuario = Utils.expectedColumnUserTable();
                colunasTabelaUsuario.forEach(col -> {
                    String valor = driver.findElement(By.xpath(col.xpath)).getText();
                    Assert.assertEquals(col.valorEsperado, valor);
                });
            } else if (tipoTabela.equals("perfis de acesso")) {
                List<Expected> colunasTabelaPerfilDeAcesso = Utils.expectedColumnAccessProfileTable();
                colunasTabelaPerfilDeAcesso.forEach(col -> {
                    String valor = driver.findElement(By.xpath(col.xpath)).getText();
                    Assert.assertEquals(col.valorEsperado, valor);
                });
            }
        }

        @E("a tabela de {} cadastrados deve conter os botoes de acao especificados")
        public void validarBotoesDeAcaoDasTabelas(String tipoTabela) {
            if (tipoTabela.equals("usuarios")){
                driver.findElement(By.xpath(MenuUsuariosConstants.EDITUSERBTN_XPATH));
                driver.findElement(By.xpath(MenuUsuariosConstants.DELETEUSERBTN_XPATH));
            } else if(tipoTabela.equals("perfis de acesso")){
                driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.EDITACCESSPROFILEBTN_XPATH));
                driver.findElement(By.xpath(MenuPerfilDeAcessoConstants.DELETEACCESSPROFILEBTN_XPATH));
            }
        }
    }
