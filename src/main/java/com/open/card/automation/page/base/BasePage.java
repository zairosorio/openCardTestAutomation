package com.open.card.automation.page.base;

import com.open.card.automation.page.utils.SpecialMetods;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BasePage extends PageObject {


    private static WebDriverWait wait;
    private static WebDriver webDriver;
    private static JavascriptExecutor jsExecutor;

    public BasePage() {
    }

    public void configuracionesIniciales() {
        webDriver = this.getDriver();
        wait = new WebDriverWait(webDriver, 30L);
        jsExecutor = (JavascriptExecutor) webDriver;
    }

    public void abrirNavegadorEn() {
        SpecialMetods.configProperties();
        webDriver.navigate().to(SpecialMetods.properties.getProperty("url"));
    }

    private void validarDisponibilidadDelObjeto(By element) {
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est� habilitado", webDriver.findElement(element).isDisplayed());
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est� visible", webDriver.findElement(element).isEnabled());
    }



    public void click(By elementBy) {
        this.validarDisponibilidadDelObjeto(elementBy);
        webDriver.findElement(elementBy).click();
    }

    public void escribirTexto(By elementBy, String text) {
        this.validarDisponibilidadDelObjeto(elementBy);
        webDriver.findElement(elementBy).sendKeys(new CharSequence[]{text});
    }

    public String obtenerTexto(By elementBy) {
        this.validarDisponibilidadDelObjeto(elementBy);
        return webDriver.findElement(elementBy).getText();
    }

    public void validarIgual(By elementBy, String expectedText) {
        Assert.assertEquals(this.obtenerTexto(elementBy), expectedText);
    }

    public WebElement elElemento(By by) {
        return webDriver.findElement(by);
    }

    public void validarPresenciaDeObjeto(By by) {
        Assert.assertTrue(webDriver.findElement(by).isEnabled());
    }


}
