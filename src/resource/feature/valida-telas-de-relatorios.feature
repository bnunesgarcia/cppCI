# language: pt

Funcionalidade: Tela de relatorios

    Esquema do Cenario: Validar Tela inicial da aplicacao
        Dado que o usuario acesse a aplicacao cpp
        E o campo para acesso com bot MFA esteja disponivel
        Quando o login e realizado
        E o menu <menu> estiver disponivel
        E o usuario clica no menu <menu>
        Então o acesso a tela do relatorio <menu> deve ser realizado com sucesso
        E a tela <menu> deve conter os filtros especificados
        E a tela <menu> deve conter os botoes de acão especificados


        Exemplos:
            | menu               |
            | perfil e audiencia |
            | estudo cpp         |