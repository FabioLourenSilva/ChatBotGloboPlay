#Author: keila.da.silva@accenture.com
@validarbotoesfluxocadastro
Feature: Verificar FAQ de Cadastro

  Scenario Outline: Validar menu de Cadastro
   Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Cadastro
    And Logout
    
    Examples: 
      | email                            | senha    |
      | glbteste.19101424@mailinator.com | 12345679 |
      
   Scenario Outline: Validar botao "<botao>" no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Cadastro
    Given que clico no botao "<botao>" do menu do fluxo Cadastro
    Then valido o texto do botao "<botao>" do fluxo Cadastro
    And Logout

    Examples: 
      | email                            | senha    | botao                       |
      | glbteste.19101424@mailinator.com | 12345679 | Alterar E-mail         |
      | glbteste.19101424@mailinator.com | 12345679 | Alterar foto de perfil       |
      | glbteste.19101424@mailinator.com | 12345679 | Atualizar Dados    |
  
  
    