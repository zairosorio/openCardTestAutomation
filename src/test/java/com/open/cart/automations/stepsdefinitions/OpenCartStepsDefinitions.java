package com.open.cart.automations.stepsdefinitions;

import com.open.card.automation.page.base.BasePage;
import com.open.card.automation.page.steps.OpenCartHomePageStep;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OpenCartStepsDefinitions extends BasePage {


    @Steps
    OpenCartHomePageStep openCartHomePageStep;


    @Given("^el usuario ingresa a la pagina$")
    public void elUsuarioIngresaALaPagina() throws Exception {
        openCartHomePageStep.openTheBrowser();
    }

    @When("^ingresar el producto \"([^\"]*)\" y buscar\\.$")
    public void ingresarElProductoYBuscar(String producto) throws Exception {
        openCartHomePageStep.ingresarProducto(producto);
    }

    @When("^Seleccionar la primera opción que aparezca\\.$")
    public void seleccionarLaPrimeraOpciónQueAparezca() throws Exception {
        openCartHomePageStep.seleccionarPrimerProducto();
    }

    @When("^Agregar el producto al carrito de compras\\.$")
    public void agregarElProductoAlCarritoDeCompras() throws Exception {
        openCartHomePageStep.agregarProductoCarrito();
    }

    @When("^Ingresar al botón del carrito de compras\\.$")
    public void ingresarAlBotónDelCarritoDeCompras() throws Exception {
        openCartHomePageStep.ir_a_carrito();
    }

    @When("^Presionar View Cart")
    public void presionar() throws Exception {
        openCartHomePageStep.ver_Producto();
    }

    @Then("^Validar que el \"([^\"]*)\" seleccionado se encuentre en el carrito de compras\\.$")
    public void validarQueElSeleccionadoSeEncuentreEnElCarritoDeCompras(String arg1) throws Exception {
        openCartHomePageStep.validar_Producto(arg1);
    }

    @Then("^Remover el iPhone del carrito de compras\\.$")
    public void removerElIPhoneDelCarritoDeCompras() throws Exception {
        openCartHomePageStep.eliminarProducto();
    }

    @Then("^Validar que el (.*) ya no se encuentre en el carrito de compras\\.$")
    public void validarQueElYaNoSeEncuentreEnElCarritoDeCompras(String msj) throws Exception {
        openCartHomePageStep.validoCarritoVacio();
    }


}
