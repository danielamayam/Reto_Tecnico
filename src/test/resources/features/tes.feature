@RetoEscenarios
Feature: Selección de fecha en JQuery Datepicker

  @scenarioUno
  Scenario: Seleccionar el día 15 del mes actual en el calendario
    Given El "Daniel" abrio la página principal de JQuery Datepicker
    When El usuario selecciona la fecha quince del mes actual
    Then La fecha seleccionada debe aparecer en el campo de texto "06/15/2025"

  @scenarioDos
  Scenario: Selección de una fecha específica en un mes diferente
    Given El "Daniel" abrio la página principal de JQuery Datepicker
    When Selecciona el día dies del próximo mes
    Then La fecha seleccionada debe aparecer en el campo de texto "07/10/2025"

  @scenarioTres
  Scenario Outline: Escribe de una fecha específica
    Given El "Daniel" abrio la página principal de JQuery Datepicker
    When Escribe la fecha en le campo de texto "<fecha>"
    Then La fecha seleccionada debe aparecer en el campo de texto ""

    Examples: Tabla
      | fecha      |
      | 07/10/2025 |