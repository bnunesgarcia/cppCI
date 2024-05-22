package br.com.concorrencia.steps;

import br.com.concorrencia.pages.ValidaCadastroPages;
import br.com.concorrencia.runner.RunCucumberTest;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class AdcionaUsuariosEPerfilDeAcessoSteps extends RunCucumberTest {
    ValidaCadastroPages validaCadastroPages = new ValidaCadastroPages();
    @Então("o botao de adcionar {} deve estar disponivel")
    public void botao_add_usuarios_ou_perfil_acesso(String tipoCadastro){
        validaCadastroPages.botaoAddUsuariosOuPerfilAcesso(tipoCadastro);
    }
    @E("o usuario clica no botao para adcionar {}")
    public void clicar_no_botao_para_add_usuario_ou_perfil_de_acesso(String tipoCadastro){
        validaCadastroPages.clicarBotaoAddUsuarioOuPerfilDeAcesso(tipoCadastro);
    }
    @E("a tela de cadastro de {} deve estar disponivel")
    public void valida_acesso_tela_cadastra_usuario_ou_perfil_de_acesso(String tipoCadastro){
        validaCadastroPages.validaAcessoTelaCadastroUsuarioOuPerfilDeAcesso(tipoCadastro);
    }
    @E("a tela de cadastro de {} deve conter os campos especificados")
    public void campos_tela_cadastro_usuario_ou_perfil_de_acesso(String tipoCadastro){
        validaCadastroPages.camposTelaCadastroUsuarioOuPerfilDeAcesso(tipoCadastro);
    }
}
