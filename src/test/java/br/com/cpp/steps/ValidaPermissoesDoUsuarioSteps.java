package br.com.cpp.steps;

import br.com.cpp.pages.ValidaPermissoesPages;
import io.cucumber.java.pt.E;

public class ValidaPermissoesDoUsuarioSteps {

    ValidaPermissoesPages validaPermissoes = new ValidaPermissoesPages();

    @E("o campo para pesquisa de permissoes deve estar disponivel")
    public void valida_campo_pesquisa_permissoes_do_usuario(){
        validaPermissoes.validaCampoPesquisaPermissoesDoUsuario();
    }
    @E("as permissoes especificadas devem estar disponiveis")
    public void valida_permissoes_do_usuario(){
        validaPermissoes.validaPermissoesDoUsuario();
    }

}
