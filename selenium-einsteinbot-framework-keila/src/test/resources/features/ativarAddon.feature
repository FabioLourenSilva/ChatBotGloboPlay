#Author: keila.da.silva@accenture.com
Feature: Verificar o fluxo Ativar Addon 

     Scenario Outline: Validar botao "<botao>" do fluxo ativar addon com familia Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito ativar addon
    Given que clico no botao "<botao>" do menu do fluxo ativar addon com familia globoplay
    Then valido o texto do botao "<botao>" do fluxo ativar addon familia globoplay
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.19101424@mailinator.com | 12345679 | Disney+													       |
      | glbteste.19101424@mailinator.com | 12345679 | Deezer Premium												 |
      
 @validarativaraddon     
Scenario Outline: Validar o fluxo ativar addon com combo Disney+
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito ativar addon para o combo Disney
    And Logout
      
      Examples: 
      | email                            | senha    |
      | glbteste.28121714@mailinator.com | 12345679 |