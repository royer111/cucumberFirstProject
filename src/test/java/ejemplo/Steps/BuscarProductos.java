package ejemplo.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BuscarProductos {

    @Given("Ingreso a la pagina de mercado libre")
    public void abrirPagina() {
        Hooks.driver.get("https://www.mercadolibre.com.co/");
    }


    @When("El usuario busca {string} en la barra de busqueda")
    public void buscarProducto(String producto) {
        Hooks.driver.findElement(By.xpath("//input[@id='cb1-edit']")).sendKeys(producto);
        Hooks.driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("El usuario debe de ver la lista de productos relacionados")
    public void validarSeccionProductos() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(5));

        WebElement elemento = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(text(), 'Encuentra Tu Persona Vitamina')]")
        ));
        elemento.click();


    }
}