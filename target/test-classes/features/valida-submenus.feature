# language: pt

Funcionalidade: Gerenciamento de usuarios

    Esquema do Cenario: Validar Tela de gerenciamento de usuarios
        Dado que o usuario acesse a aplicacao cpp
        E o campo para acesso com bot MFA esteja disponivel
        Quando o login e realizado
        E o usuario clica no menu <menu>
        E o usuario acessa o submenu <submenu>
        Então o acesso ao submenu <submenu> deve ser realizado com sucesso
        E a tela <submenu> deve conter os filtros que foram especificados
        E a tela <submenu> deve conter os botoes de acao especificados

        Exemplos:
        | menu              | submenu          |
        | administracao     | usuario          |
        | administracao     | perfil de acesso |

    Esquema do Cenario: Validar colunas com informações de usuarios
        Dado que o usuario acesse a aplicacao cpp
        E o campo para acesso com bot MFA esteja disponivel
        Quando o login e realizado
        E o usuario clica no menu <menu>
        E o usuario acessa o submenu <submenu>
        Então o acesso ao submenu <submenu> deve ser realizado com sucesso
        E a tabela <tabela> deve ser exibido
        E a tabela de <tabela> cadastrados deve conter as colunas especificadas
        E a tabela de <tabela> cadastrados deve conter os botoes de acao especificados

        Exemplos:
            | menu          | submenu          | tabela           |
            | administracao | usuario          | usuarios         |
            | administracao | perfil de acesso | perfis de acesso |

    Esquema do Cenário: Validar telas de cadastro de usuarios e perfis de acesso
        Dado que o usuario acesse a aplicacao cpp
        E o campo para acesso com bot MFA esteja disponivel
        Quando o login e realizado
        E o usuario clica no menu <menu>
        E o usuario acessa o submenu <submenu>
        Então o botao de adcionar <tipo_cadastro> deve estar disponivel
        E o usuario clica no botao para adcionar <tipo_cadastro>
        E a tela de cadastro de <tipo_cadastro> deve estar disponivel
        E a tela de cadastro de <tipo_cadastro> deve conter os campos especificados

        Exemplos:
            | menu          | submenu          | tipo_cadastro    |
            | administracao | usuario          | usuarios         |
            | administracao | perfil de acesso | perfis de acesso |

    Cenario: Validar lista de permissoes do usuario
        Dado que o usuario acesse a aplicacao cpp
        E o campo para acesso com bot MFA esteja disponivel
        Quando o login e realizado
        E o usuario clica no menu administracao
        E o usuario acessa o submenu perfil de acesso
        E o usuario clica no botao para adcionar perfis de acesso
        E a tela de cadastro de perfis de acesso deve estar disponivel
        E o campo para pesquisa de permissoes deve estar disponivel
        E as permissoes especificadas devem estar disponiveis
