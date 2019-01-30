Feature: Search for a product and do the checkout

  Background:
    Given User access Americanas website

  Scenario: Complete the account and checkout a product
    Given User inserts "teste_dextra1@hotmail.com" as Email
    And User inserts "@Dextra_123#" as Senha
    And User should see the "ótima" validation
    And User inserts "97728327801" as CPF
    And User inserts "Teste Dextra" as Nome
    And User inserts "01011990" as Nascimento
    And User mark the "feminino" checkbox
    And User inserts "15999999999" as Telefone
    When User clicks on Criar seu Cadastro button
    And User inserts "Moto G6" on Search field
    And User press Enter
    And User selects a product
    And User clicks on Comprar button
    And User clicks on Continuar button to checkout
    And User selects "2" as Quantidade
    And User checks the "R$ 3.198,00" as Total price
    And User checks the "em até 10x s/ juros" checkout message
    And User clicks the Continuar button to buy the product
