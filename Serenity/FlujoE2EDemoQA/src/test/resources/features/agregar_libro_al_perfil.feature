Feature: Agregar libro al perfil


  @FlujoExitoso
  Scenario: agregar exitosamente un libro al perfil
    Given El usuario escoge el modulo de Book Store
    When El usuario hace el flujo para agregar un libro al perfil
    Then El usuario verifica que El libro se haya agregado