#Author: keila.da.silva@accenture.com
Feature: Verificar FAQ Esqueci E-mail
@esqueciemail
  Scenario Outline: Validar FAQ Esqueci E-mail
     Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito Esqueci e-mail
		And Logout
		
    Examples: 
      | email                            | senha    |
      | glbteste.19101424@mailinator.com | 12345679 |
