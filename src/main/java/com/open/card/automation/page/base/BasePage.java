package com.open.card.automation.page.base;

import com.open.card.automation.page.utils.SpecialMetods;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage extends PageObject {

    private JavascriptExecutor js;
    private static WebDriverWait wait;
    private static WebDriver webDriver;
    private static JavascriptExecutor jsExecutor;
    private final Logger logger = Logger.getLogger(BasePage.class.getName());

    public BasePage() {
    }

    public void addCss(By element) {
        WebElement webElement = webDriver.findElement(element);
        js = (JavascriptExecutor) webDriver;
        try {
            js.executeScript("arguments[0].setAttribute('style', 'border:3px solid red')", webElement);
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
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
        addCss(element);
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est� habilitado", webDriver.findElement(element).isDisplayed());
        Assert.assertTrue("[Error] El Elemento " + element.toString() + ", no est� visible", webDriver.findElement(element).isEnabled());
    }


    public void click(By elementBy) {
        addCss(elementBy);
        this.validarDisponibilidadDelObjeto(elementBy);
        webDriver.findElement(elementBy).click();
    }

    public void escribirTexto(By elementBy, String text) {
        addCss(elementBy);
        this.validarDisponibilidadDelObjeto(elementBy);
        webDriver.findElement(elementBy).sendKeys(new CharSequence[]{text});
    }

    public String obtenerTexto(By elementBy) {
        addCss(elementBy);
        this.validarDisponibilidadDelObjeto(elementBy);
        return webDriver.findElement(elementBy).getText();
    }

    public void validarIgual(By elementBy, String expectedText) {
        Assert.assertEquals(this.obtenerTexto(elementBy), expectedText);
    }

    public void validarPresenciaDeObjeto(By elementBy) {
        addCss(elementBy);
        Assert.assertTrue(webDriver.findElement(elementBy).isEnabled());
    }


}
