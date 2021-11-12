package com.demoblaze.test.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/AddToCart.feature",
        glue = "com.demoblaze.test.stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "@regression",
        plugin = {"pretty","html:target/cucumber-html-report.html"})
public class AddToCartRunner {
}
