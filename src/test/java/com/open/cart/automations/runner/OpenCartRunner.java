package com.open.cart.automations.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/open_cart.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.open.cart.automations.stepsdefinitions",
        tags = "@Buscar"
)
public class OpenCartRunner {


}
