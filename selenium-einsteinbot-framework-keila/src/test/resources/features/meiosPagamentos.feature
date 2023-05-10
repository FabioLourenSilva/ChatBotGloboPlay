#Author: keila.da.silva@accenture.com 
 
Feature: Verificar FAQ de Meios de Pagamentos

  Scenario Outline: Validar menu de Meios de Pagamentos
	  Given que acesso a url 
    When informo o "<email>"
    And a "<senha>"
     Then clico no botao Entrar
		Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
    @meiospagamento
    Scenario Outline: Validar botão Formas de pagamento Globoplay
	 # Given que acesso a url 
    #When informo o "<email>"
   # And a "<senha>"
    #Then clico no botao Entrar
		#Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
	  Then informo Meios de pagamento
		When quando clico no botão Formas de pagamento Globoplay
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
       
        Scenario Outline: Validar botão Formas de pagamento dos combos Disney+
	#  Given que acesso a url 
  #  When informo o "<email>"
  #  And a "<senha>"
  # Then clico no botao Entrar
	#	Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Formas de pagamento dos combos Disney+
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
      
        Scenario Outline: Validar botão Alterar forma de pagamento atual
	 # Given que acesso a url 
    #When informo o "<email>"
    #And a "<senha>"
   #  Then clico no botao Entrar
		#Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Alterar forma de pagamento atual
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
     
    Scenario Outline: Validar botão Erro ao editar dados cartão
	  #Given que acesso a url 
    #When informo o "<email>"
    #And a "<senha>"
    #Then clico no botao Entrar
		#Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Erro ao editar dados cartão
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
         
        Scenario Outline: Validar botão Banco Itaú
	 # When informo o "<email>"
   # And a "<senha>"
 #Then clico no botao Entrar
		#Given que seleciono o produto 
		#And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Banco Itaú
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      

        Scenario Outline: Validar botão Cartão internacional
	# Given que acesso a url 
   # When informo o "<email>"
   # And a "<senha>"
  # Then clico no botao Entrar
		#Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Cartão internacional
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
    
        Scenario Outline: Validar botão Não tenho cartão e opção Sim
	#  Given que acesso a url 
  # When informo o "<email>"
 #   And a "<senha>"
  #  Then clico no botao Entrar
	#	Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Não tenho cartão
		And clico no botão Sim, quero ajuda
		And Fecho o bot
		
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 
      
      
       
        Scenario Outline: Validar botão Não tenho cartão e opção Não
	  #Given que acesso a url 
   # When informo o "<email>"
   # And a "<senha>"
   #Then clico no botao Entrar
	#	Given que seleciono o produto 
		And clico no botao atendimento
		When quando o bot é exibido
		Then informo Meios de pagamento
		When quando clico no botão Não tenho cartão
		And clico no botão Não é necesario
		And Fecho o bot
	
		Examples: 
      | email  																				 | senha 	 | 
      | glbteste.12081704@mailinator.com							 |12345678 | 