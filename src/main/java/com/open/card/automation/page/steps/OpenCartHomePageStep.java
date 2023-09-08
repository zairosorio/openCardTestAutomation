package com.open.card.automation.page.steps;

import com.open.card.automation.page.base.BasePage;
import com.open.card.automation.page.pageobjet.OpenCartHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class OpenCartHomePageStep extends BasePage {

    @Steps
    OpenCartHomePage openCartHomePage;


    @Step
    public void openTheBrowser() {
        configuracionesIniciales();
        abrirNavegadorEn();

    }

    @Step
    public void ingresarProducto(String s) {
        escribirTexto(openCartHomePage.campo_producto, s);
        click(openCartHomePage.boton_buscar);
    }

    @Step
    public void seleccionarPrimerProducto(){
        click(openCartHomePage.selecciono_producto);
    }

    @Step
    public void agregarProductoCarrito(){
        click(openCartHomePage.agradar_a_carrito);
    }
    @Step
    public void ir_a_carrito(){
        click(openCartHomePage.ir_a_carrito);
    }
    @Step
    public void ver_Producto(){
        click(openCartHomePage.ver_carrito);
    }
    @Step
    public void validar_Producto(String s){
        validarIgual(openCartHomePage.producto_en_carrito,s);
    }
    @Step
    public void eliminarProducto(){
        click(openCartHomePage.eliminar_del_carrito);
    }

    @Step
    public void validoCarritoVacio(){
        validarPresenciaDeObjeto(openCartHomePage.carrito_vacio);
    }


}
