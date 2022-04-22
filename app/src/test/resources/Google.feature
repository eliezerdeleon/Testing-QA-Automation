Feature: Probar la busqueda en google

Scenario: Busco algo en google
    Given navego a google
    When busco algo
    And click on the search button
    Then obtengo resultados
