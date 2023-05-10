#Author: keila.da.silva@accenture.com
Feature: Verificar Fluxo de Acesso

@teste
  Scenario Outline: Validar fluxo "Acesso" no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Acesso
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
    Then digito Acesso
    Given que clico no botao "<botao>" do menu do fluxo acesso
    Then valido o texto do botao "<botao>" do fluxo acesso
    And Logout

    Examples: 
      | email                            | senha    | botao                       |
     # | glbteste.19101424@mailinator.com | 12345679 | Erro ao fazer login         |
     # | glbteste.19101424@mailinator.com | 12345679 | Acesso não autorizado       |
     # | glbteste.19101424@mailinator.com | 12345679 | Fazer login com Facebook    |
      | glbteste.19101424@mailinator.com | 12345679 | E-mail de validação         |
      | glbteste.19101424@mailinator.com | 12345679 | Não consigo acessar Disney+ |
      | glbteste.19101424@mailinator.com | 12345679 | Como assistir o Disney+     |
      

      Scenario Outline: Validar botao "<botao>" no bot Globoplay com Combo Disney+ ativo
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
   Then seleciono o produto do combo
    When quando o bot Globoplay é exibido
    Then digito Acesso
    Given que clico no botao "<botao>" do menu do fluxo acesso
    Then valido o texto do botao "<botao>" do fluxo acesso com Disney+ ativo
    And Logout

    Examples: 
      | email                            | senha    | botao                       |
      | glbteste.28121329@mailinator.com | 12345679 | Não consigo acessar Disney+ |
      | glbteste.28121329@mailinator.com | 12345679 | Como assistir o Disney+     |
      
      @validarbotoesfluxoacesso
      Scenario Outline: Validar botao "<botao>" no bot Globoplay com Combo Disney+ inativo
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
   Then seleciono o produto do combo
    When quando o bot Globoplay é exibido
    Then digito Acesso
    Given que clico no botao "<botao>" do menu do fluxo acesso
    Then valido o texto do botao "<botao>" do fluxo acesso com Disney+ inativo
    And Logout

    Examples: 
      | email                            | senha    | botao                       |
     | glbteste.28121714@mailinator.com | 12345679 | Não consigo acessar Disney+ |
     # | glbteste.28121714@mailinator.com | 12345679 | Como assistir o Disney+     |
      
      