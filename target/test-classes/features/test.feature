#Author: Camilo Sierra kjosiro@gmail.com

@tag
Feature: Compras web
  Se requiere agregar diez articulos al carrito de compras

  @tag1
  Scenario: Agregar articulos al carrito de compras
    Given Se ingresa a la pagina web
    When Se agreguen diez articulos al carrito
    And Se toma evidencia del carrito con los diez articulos
    And Se eliminan los diez articulos del carrito
    Then Se evidencian carrito vacio
 