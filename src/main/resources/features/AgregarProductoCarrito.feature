Feature: Buscar productos
  Background:
    Given que abro la página de login
    When ingreso usuario "standard_user" y contraseña "secret_sauce"
    Then debo ver la página inicial

  Scenario: Ver lista de productos de preferencia
    Given Me encuentro en la pagina de productos
    When El usuario agrega un producto
    Then El usuario debe de ver la lista de productos relacionados