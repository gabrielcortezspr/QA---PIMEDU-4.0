Feature: Login
    Scenario: Login com sucesso
    Given O usuario esta na Homepage
    When O usuario abrir a tela de Login
    And Realizar o login
    Then A tela de cursos deve ser exibida
