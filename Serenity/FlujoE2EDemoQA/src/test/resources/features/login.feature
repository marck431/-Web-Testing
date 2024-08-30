Feature: El cliente podra logearse

  @loginExitoso
  Scenario: Login exitoso
    Given el usuario esta en la pagina de login
    When el usuario ingresa sus credenciales
    Then el usuario deberia ingresar a la pagina

  @loginNoExitoso
  Scenario: Login no exitoso
    Given el usuario esta en la pagina de login
    When el usuario ingresa sus credenciales erradas
    Then el usuario deberia ver un mensaje de error