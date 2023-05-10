#Author: keila.da.silva@accenture.com

Feature: Verificar FAQ de Pagamento

  Scenario Outline: Validar FAQ "Pagamento" no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Pagamento
    And Logout

    Examples: 
      | email                            | senha    |
      | glbteste.19101424@mailinator.com | 12345679 |
@validarbotoesfaqpagamentos
  Scenario Outline: Validar botao "<botao>" no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Pagamento
    Given que clico no botao "<botao>" do menu da FAQ de Pagamentos
    Then valido o texto do botao "<botao>" da FAQ de Pagamentos
    And Logout

    Examples: 
      | email                            | senha    | botao                             |
      | glbteste.19101424@mailinator.com | 12345679 | Já paguei                         |
      | glbteste.19101424@mailinator.com | 12345679 | Quantos dias demora               |
      | glbteste.19101424@mailinator.com | 12345679 | Pagar fatura                      |
      | glbteste.19101424@mailinator.com | 12345679 | Passou do prazo                   |
      | glbteste.19101424@mailinator.com | 12345679 | Quantidade de assinaturas por CPF |
      | glbteste.19101424@mailinator.com | 12345679 | Não venceu                        |
      | glbteste.19101424@mailinator.com | 12345679 | O plano não foi parcelado         |
      | glbteste.19101424@mailinator.com | 12345679 | Reagendar pagamento               |
