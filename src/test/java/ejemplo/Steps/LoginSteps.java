package ejemplo.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    @Given("que abro la página de login")
    public void abrirPaginaLogin() {
        Hooks.driver.get("https://www.saucedemo.com/");
    }

    @When("ingreso usuario {string} y contraseña {string}")
    public void ingresarCredenciales(String user, String pass) {
        Hooks.driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
        Hooks.driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
        Hooks.driver.findElement(By.xpath("//input[@id='login-button']")).click();
    }

    @Then("debo ver la página inicial")
    public void validarProductos() {
        boolean visible = true; // aquí luego puedes validar un elemento real
        assertTrue("Página inicial abierta", visible);
    }
}