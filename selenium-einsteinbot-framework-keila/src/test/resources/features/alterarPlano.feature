#Author: keila.da.silva@accenture.com
Feature: Verificar o fluxo Alterar Plano 

  Scenario Outline: Validar fluxo "Alterar Plano" no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    And Logout

    Examples: 
      | email                            | senha    |
      | glbteste.19101424@mailinator.com | 12345679 |

  #Login Globoplay básico Mensal
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano no bot Globoplay
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.19101424@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.19101424@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.19101424@mailinator.com | 12345679 | Disney+                                |
      | glbteste.19101424@mailinator.com | 12345679 | discovery+                             |
      | glbteste.19101424@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.19101424@mailinator.com | 12345679 | Premiere                               |
      | glbteste.19101424@mailinator.com | 12345679 | Telecine                               |
      | glbteste.19101424@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com addon Discovery Mensal
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e addon discovery+
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto Globoplay
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente que possui ADDON discovery+
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.01111405@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.01111405@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.01111405@mailinator.com | 12345679 | Disney+                                |
      | glbteste.01111405@mailinator.com | 12345679 | discovery+                             |
      | glbteste.01111405@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.01111405@mailinator.com | 12345679 | Premiere                               |
      | glbteste.01111405@mailinator.com | 12345679 | Telecine                               |
      | glbteste.01111405@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com addon Disney+ Mensal
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e addon disney+
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto Globoplay
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente que possui ADDON disney+
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.07111654@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.01111405@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.07111654@mailinator.com | 12345679 | Disney+                                |
      | glbteste.01111405@mailinator.com | 12345679 | discovery+                             |
      | glbteste.01111405@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.01111405@mailinator.com | 12345679 | Premiere                               |
      | glbteste.01111405@mailinator.com | 12345679 | Telecine                               |
      | glbteste.01111405@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com addon Deezer Mensal
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e addon deezer premium
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto Globoplay
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente que possui ADDON deezer premium
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.08111146@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.08111146@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.08111146@mailinator.com | 12345679 | Disney+                                |
      | glbteste.08111146@mailinator.com | 12345679 | discovery+                             |
      | glbteste.08111146@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.08111146@mailinator.com | 12345679 | Premiere                               |
      | glbteste.08111146@mailinator.com | 12345679 | Telecine                               |
      | glbteste.08111146@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com Telecine
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e Telecine
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente que possui Telecine
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.08111748@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.08111748@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.08111748@mailinator.com | 12345679 | Disney+                                |
      | glbteste.08111748@mailinator.com | 12345679 | discovery+                             |
      | glbteste.08111748@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.08111748@mailinator.com | 12345679 | Premiere                               |
      | glbteste.08111748@mailinator.com | 12345679 | Telecine                               |
      | glbteste.08111748@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay anual
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay ANUAL
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente que possui Globoplay Anual
    And Logout

    Examples: 
      | email                          | senha    | botao                                  |
      | glbteste.111743@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.111743@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.111743@mailinator.com | 12345679 | Disney+                                |
      | glbteste.111743@mailinator.com | 12345679 | discovery+                             |
      | glbteste.111743@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.111743@mailinator.com | 12345679 | Premiere                               |
      | glbteste.111743@mailinator.com | 12345679 | Telecine                               |
      | glbteste.111743@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com Canal de compra VIVO
 
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e canal de compra VIVO
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente Globoplay Canal de Compra VIVO
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.14110956@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.14110956@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.14110956@mailinator.com | 12345679 | Disney+                                |
      | glbteste.14110956@mailinator.com | 12345679 | discovery+                             |
      | glbteste.14110956@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.14110956@mailinator.com | 12345679 | Premiere                               |
      | glbteste.14110956@mailinator.com | 12345679 | Telecine                               |
      | glbteste.14110956@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com Canal de compra GOOGLE
 # @validarbotoesfluxoalterarplano
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e canal de compra GOOGLE
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente Globoplay Canal de Compra GOOGLE
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.14111604@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.14111604@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.14111604@mailinator.com | 12345679 | Disney+                                |
      | glbteste.14111604@mailinator.com | 12345679 | discovery+                             |
      | glbteste.14111604@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.14111604@mailinator.com | 12345679 | Premiere                               |
      | glbteste.14111604@mailinator.com | 12345679 | Telecine                               |
      | glbteste.14111604@mailinator.com | 12345679 | Trocar para bianual                    |

  #Login Globoplay com Canal de compra APPLE
 
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com produto globoplay e canal de compra APPLE
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido
    Then digito alterar plano
    Given que clico no botao "<botao>" do menu do fluxo alterar plano
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente Globoplay Canal de Compra APPLE
    And Logout

    Examples: 
      | email                            | senha    | botao                                  |
      | glbteste.14111608@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
      | glbteste.14111608@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.14111608@mailinator.com | 12345679 | Disney+                                |
      | glbteste.14111608@mailinator.com | 12345679 | discovery+                             |
      | glbteste.14111608@mailinator.com | 12345679 | Deezer Premium                         |
      | glbteste.14111608@mailinator.com | 12345679 | Premiere                               |
      | glbteste.14111608@mailinator.com | 12345679 | Telecine                               |
      | glbteste.14111608@mailinator.com | 12345679 | Trocar para bianual    								|
      
      
       #Login Globoplay com cliente suspenso por Saldo
      

  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com Cliente SUSPENSO SALDO
  
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido com smart intervention do Suspenso por Saldo
    Then digito alterar plano no cliente suspenso por saldo
    Given que clico no botao "<botao>" do menu do fluxo alterar plano cliente Globoplay Suspenso por Saldo
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente Globoplay Suspenso por Saldo
    And Logout

    Examples: 
       | email                            | senha    | botao                                  |
     # | glbteste.17111715@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
     # | glbteste.17111715@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
     # | glbteste.17111715@mailinator.com | 12345679 | Disney+                                |
     # | glbteste.17111715@mailinator.com | 12345679 | discovery+                             |
     # | glbteste.17111715@mailinator.com | 12345679 | Deezer Premium                         |
      # | glbteste.17111715@mailinator.com | 12345679 | Premiere                               |
      # | glbteste.17111715@mailinator.com | 12345679 | Telecine                               |
       | glbteste.17111715@mailinator.com | 12345679 | Trocar para bianual                    |                 

       
          #Login Globoplay com cliente suspenso por Cadastro
       
 @validarbotoesfluxoalterarplano 
  Scenario Outline: Validar botao "<botao>" do fluxo alterar plano com Cliente SUSPENSO CADASTRO
  
    Given que acesso a url
    When informo o "<email>"
    And a "<senha>"
    Then clico no botao Entrar
    Given que seleciono o produto
    And clico no botao atendimento
    When quando o bot Globoplay é exibido com smart intervention do Suspenso por Cadastro
    Then digito alterar plano no cliente suspenso por Cadastro
    Given que clico no botao "<botao>" do menu do fluxo alterar plano cliente Globoplay Suspenso por Cadastro
    Then valido o texto do botao "<botao>" do fluxo alterar plano com cliente Globoplay Suspenso por Cadastro
    And Logout

    Examples: 
       | email                            | senha    | botao                                  |
     # | glbteste.22111657@mailinator.com | 12345679 | Trocar de plano mensal para anual      |
     # | glbteste.22111657@mailinator.com | 12345679 | Trocar para Globoplay + canais ao vivo |
      | glbteste.22111657@mailinator.com | 12345679 | Disney+                                |
     # | glbteste.22111657@mailinator.com | 12345679 | discovery+                             |
    #  | glbteste.22111657@mailinator.com | 12345679 | Deezer Premium                         |
     #  |glbteste.22111657@mailinator.com  | 12345679 | Premiere                               |
     #  | glbteste.22111657@mailinator.com | 12345679 | Telecine                               |
     #  | glbteste.22111657@mailinator.com | 12345679 | Trocar para bianual        |