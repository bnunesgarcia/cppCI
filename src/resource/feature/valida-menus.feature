# language: pt

    Funcionalidade: Validar tela inicial da aplicação CPP

        Esquema do Cenario: Validar Tela inicial da aplicacao
            Dado que o usuario acesse a aplicacao cpp
            E o campo para acesso com bot MFA esteja disponivel
            Quando o login e realizado
            Então a funcionalidade <menu> deve estar disponivel

            Exemplos:
            | menu               |
            | administracao      |
            | perfil e audiencia |
            | estudo cpp         |

        Esquema do Cenario: Validar Submenus administrativos da aplicação CPP
            Dado que o usuario acesse a aplicacao cpp
            E o campo para acesso com bot MFA esteja disponivel
            Quando o login e realizado
            E o menu <menu> estiver disponivel
            E o usuario clica no menu <menu>
            Então o submenu <submenu> deve estar disponivel
            E o usuario acessa o submenu <submenu>
            E o acesso ao submenu <submenu> deve ser realizado com sucesso

            Exemplos:
                | menu          | submenu          |
                | administracao | usuario          |
                | administracao | perfil de acesso |

        Esquema do Cenario: Validar acesso aos relatórios da aplicação CPP
            Dado que o usuario acesse a aplicacao cpp
            E o campo para acesso com bot MFA esteja disponivel
            Quando o login e realizado
            E o menu <menu> estiver disponivel
            E o usuario clica no menu <menu>
            Então o acesso a tela do relatorio <menu> deve ser realizado com sucesso

            Exemplos:
                | menu               |
                | perfil e audiencia |
                | estudo cpp         |