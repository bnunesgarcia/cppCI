$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/autenticacao_teste.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Ser integrado ao Microsoft Active Directory da Record, validando o login de rede",
  "description": "Eu como usuario de rede da Record\r\nQuero acessar a nova aplicação Analise de concorrencia   \r\nPara validar que o acesso a aplicação está sendo validado através do Microsoft Active Directory da Record",
  "id": "ser-integrado-ao-microsoft-active-directory-da-record,-validando-o-login-de-rede",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 9,
  "name": "Validar autenticacao para acesso a nova aplicacao",
  "description": "",
  "id": "ser-integrado-ao-microsoft-active-directory-da-record,-validando-o-login-de-rede;validar-autenticacao-para-acesso-a-nova-aplicacao",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 8,
      "name": "@teste"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "que eu acesse a aplicacao Analise de concorrencia",
  "keyword": "Dado "
});
formatter.step({
  "line": 11,
  "name": "o usuario clicar na opcao de entrar com login de rede",
  "keyword": "Quando "
});
formatter.match({
  "location": "AcessarAplicacao.acessar_aplicacao()"
});
formatter.result({
  "duration": 1514200500,
  "status": "passed"
});
formatter.match({
  "location": "AcessarAplicacao.clicar_no_btnLogin()"
});
formatter.result({
  "duration": 721772200,
  "status": "passed"
});
});