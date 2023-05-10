#Author: keila.da.silva@accenture.com

Feature: Conferir menu generico Globoplay
    #validarmenugenerico
    @login
  Scenario Outline: Logar no Minha conta cliente Ativo
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then o menu generico é exibido

    Examples: 
      | email                            | senha    |
      | glbteste.19101424@mailinator.com | 12345679 |
      
    @validarbotoesmenugenerico
    Scenario Outline: Validar botao "<botao>" Menu Genérico cliente Ativo no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then o menu generico é exibido
    Given que clico no botao "<botao>" do menu inicial
    Then valido o texto do botao "<botao>" 
    And Logout
    
     Examples: 
     	 | email                            | senha    |botao														|
 #     | glbteste.19101424@mailinator.com | 12345679 |Ativar Smart TV		  						|
  #    | glbteste.19101424@mailinator.com | 12345679 |Erros ao assistir								|
 		#	 | glbteste.19101424@mailinator.com | 12345679 |Alterar plano	    							|
 			 | glbteste.19101424@mailinator.com | 12345679 |Alterar forma de pagamento			|
 			# | glbteste.19101424@mailinator.com | 12345679 |Mais produtos Globo							|
     #  | glbteste.19101424@mailinator.com | 12345679 |Outros Assuntos									|