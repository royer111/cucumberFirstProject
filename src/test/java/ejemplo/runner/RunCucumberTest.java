package ejemplo.runner;

import org.junit.platform.suite.api.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features/BuscarProductos.feature")
@ConfigurationParameter(key = "cucumber.glue", value = "ejemplo.Steps")
@ConfigurationParameter(key = "cucumber.plugin", value = "pretty, html:target/cucumber-report.html")
public class RunCucumberTest {}
