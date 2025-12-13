Feature: Ver chats

  Background:
    Given que abro la página de login
    When ingreso usuario "3245646473" y contraseña "Instagram10."
    Then debo ver la página inicial de instagram

  Scenario: Ver lista de chats de mensajes directos
    When El usuario haga click en DM
    Then El usuario debe de ver la seccion de mensajes