Feature: Check the creation of a new account on Americanas website

  Background:
    Given User access Americanas website
    And User clicks on Cadastre-se button
    When User clicks on Cliente Novo Cadastrar button
    Then User should see the "cadastre-se" form

    Scenario: Check if Email is already registered
      Given User inserts "teste@hotmail.com" as Email
      And User inserts "12" as Senha
      When User clicks on Criar seu Cadastro button
      Then User gets the message "E-mail já cadastrado"

    Scenario: Check if Password is Strong enough
      Given User inserts "teste_dextra@hotmail.com" as Email
      And User inserts "12" as Senha
      And User should see the "fraca" validation
      When User clicks on Criar seu Cadastro button
      Then User should see the "Senha precisa ter entre 6 a 50 caracteres." password message

    Scenario: Check if CPF is valid
      Given User inserts "teste_dextra@hotmail.com" as Email
      And User inserts "@Dextra_123#" as Senha
      And User should see the "ótima" validation
      And User inserts "11111111111" as CPF
      When User clicks on Criar seu Cadastro button
      Then User should see the "Campo inválido" as CPF validation message

    Scenario: Complete
      Given User inserts "teste_dextra@hotmail.com" as Email
      And User inserts "@Dextra_123#" as Senha
      And User should see the "ótima" validation
      And User inserts "97728327801" as CPF
      And User inserts "Teste Dextra" as Nome
      And User inserts "01011990" as Nascimento
      And User mark the "feminino" checkbox
      And User inserts "15999999999" as Telefone
      When User clicks on Criar seu Cadastro button

