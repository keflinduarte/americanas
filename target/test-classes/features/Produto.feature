Feature: Search for a product and do the checkout

  Background:
    Given User access Americanas website

    Scenario: a
      And User inserts "Moto G6" on Search field
      And User press Enter
      And User selects a product
      And User clicks on Comprar button
      And User clicks on Continuar button to checkout
      And User selects "2" as Quantidade
      And User checks the "R$ 3.198,00" as Total price
      And User checks the "em até 10x s/ juros" checkout message
      And User clicks the Continuar button to buy the product
