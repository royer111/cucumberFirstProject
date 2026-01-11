Feature: Login de usuario
  Scenario: Login válido
    Given que abro la página de login
    When ingreso usuario "standard_user" y contraseña "secret_sauce"
    Then debo ver la página inicial
