Feature: Eliminar libros del perfil

  Background:
    Given El usuario escoge el modulo de Book Store

  Scenario: El usuario podrá borrar los libros del perfil
    Given El usuario ingresa al Bookstore
    When El usuario quiere eliminar los libros
    Then El usuario debera ver que se borraron