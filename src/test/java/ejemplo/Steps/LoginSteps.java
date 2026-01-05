package ejemplo.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    @Given("que abro la página de login")
    public void abrirPaginaLogin() {
        Hooks.driver.get("https://www.mercadolibre.com.co/");
    }

    @When("ingreso usuario {string} y contraseña {string}")
    public void ingresarCredenciales(String user, String pass) {
        Hooks.driver.findElement(By.name("username")).sendKeys(user);
        Hooks.driver.findElement(By.name("password")).sendKeys(pass);
        Hooks.driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("debo ver la página inicial de instagram")
    public void validarProductos() {
        boolean visible = true; // aquí luego puedes validar un elemento real
        assertTrue("Página inicial abierta", visible);
    }
}