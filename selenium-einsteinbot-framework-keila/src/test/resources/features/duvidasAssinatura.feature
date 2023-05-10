#Author: keila.da.silva@accenture.com
 @duvidasassinatura
Feature: Verificar FAQ Duvidas de Assinatura

 
  Scenario Outline: Validar menu de Dúvidas de Assinatura
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Duvida Assinatura
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
    Then digito Duvida Assinatura
    Given que clico no botao "<botao>" do menu do fluxo Duvida Assinatura
    Then valido o texto do botao "<botao>" do fluxo Duvida Assinatura
    And Logout

    Examples: 
      | email                            | senha    | botao                         |
      | glbteste.19101424@mailinator.com | 12345679 | Não lembro por onde contratei |
      | glbteste.19101424@mailinator.com | 12345679 | Tenho um vale-presente        |
      | glbteste.19101424@mailinator.com | 12345679 | Não aparece minha assinatura  |
      | glbteste.19101424@mailinator.com | 12345679 | Usar depois de cancelar       |
