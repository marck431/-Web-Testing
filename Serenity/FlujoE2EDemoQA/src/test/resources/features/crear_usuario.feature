Feature: Crear usuario

  @UsuarioNuevo
  Scenario: la persona podra crear un usuario
    When El usuario consume el servicio de crear usuario
    Then El servicio le responde 201 y ve su user id

 @UsuarioQueExiste
  Scenario: la persona no puede crear un usuario con el mismo username
    When El usuario consume el servicio de crear usuario ya creado
    Then El servicio le responde 406 y ve un mensaje user exists