Feature: Buscar productos
  Scenario: Ver lista de productos de preferencia
    Given Ingreso a la pagina de mercado libre
    When El usuario busca "Encuentra a tu persona vitamina" en la barra de busqueda
    Then El usuario debe de ver la lista de productos relacionados