# language Es

Feature: Open card Automation
  el usuario se encuantra en la pagina open card y desea buscar un producto

  @Buscar
  Scenario: Buscar Producto
    Given el usuario ingresa a la pagina
    When  ingresar el producto "iPhone" y buscar.
    And Seleccionar la primera opción que aparezca.
    And  Agregar el producto al carrito de compras.
    And Ingresar al botón del carrito de compras.
    And Presionar View Cart
    Then Validar que el "iPhone" seleccionado se encuentre en el carrito de compras.
    And  Remover el iPhone del carrito de compras.
    Then Validar que el "iPhone" ya no se encuentre en el carrito de compras.


