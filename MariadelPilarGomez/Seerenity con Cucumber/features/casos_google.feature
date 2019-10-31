
@Cucumber
Feature: Busqueda de Google de Bits Americas
  esta feature se trata de realizar una busqueda o multiples busquedas en google y revisar los resultados obtenidos de esas
  busquedas.

  @Regresion
  Scenario Outline: Buscar resultados relevantes
    Given Que Pilar ingresa a google
    When Pilar realiza una busqueda de: <Busqueda>
    Then Pilar deberia visualizar los resultados que contengan la palabra: <PalabraEsperada>

    Examples:

    |Descripción                      |Busqueda              |PalabraEsperada|
    |Búsqueda de Bits                 |Bits Americas         |Bits           |
    |Búsqueda Cucumber                |Programacion cucumber |cucumber       |
    |Búsqueda del lenguaje Guerkin    |lenguaje guerkin      |guerkin        |

