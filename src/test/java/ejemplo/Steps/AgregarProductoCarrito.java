package ejemplo.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class AgregarProductoCarrito {

    @Given("Me encuentro en la pagina de productos")
    public void abrirPagina() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-test, 'inventory-list')]")));

    }


    @When("El usuario agrega un producto")
    public void agregarProducto() {
        Hooks.driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
    }

    @Then("El usuario debe de ver la lista de productos relacionados")
    public void validarSeccionProductos() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));

        WebElement elemento = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//button[contains(text(), 'Remove')]")
        ));
        assertTrue(elemento.isDisplayed());



    }
}