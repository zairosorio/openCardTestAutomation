package com.open.card.automation.page.pageobjet;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OpenCartHomePage extends PageObject {

    public final By campo_producto = By.xpath("//input[@name=\"search\"]");
    public final By boton_buscar = By.cssSelector("button.btn.btn-default.btn-lg");
    public final By selecciono_producto = By.xpath("//div[@class='caption']//a[1]");
    public final By agradar_a_carrito = By.id("button-cart");
    public final By ir_a_carrito = By.cssSelector("button.btn.btn-inverse");
    public final By ver_carrito = By.xpath("//strong[text()=' View Cart']");
    public final By producto_en_carrito = By.xpath("(//td[@class='text-left']//a)[2]");
    public final By eliminar_del_carrito = By.cssSelector("i.fa.fa-times-circle");
    public final By carrito_vacio = By.xpath("//div[@id='content']//p[(text()='Your shopping cart is empty!')]");

}