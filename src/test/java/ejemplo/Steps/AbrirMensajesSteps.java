package ejemplo.Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ejemplo.Steps.Hooks.driver;
import static org.junit.Assert.assertTrue;

public class AbrirMensajesSteps {

    @When("El usuario haga click en DM")
    public void abrirMensajes(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement dmButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[aria-label='Mensajes de Direct']")));
        dmButton.click();
    }

    @Then("El usuario debe de ver la seccion de mensajes")
    public void verListaMensajes(){
        boolean visible = Hooks.driver.findElement(By.xpath("//h2[text()='Tus mensajes']")).isDisplayed();
        assertTrue(visible);
    }
}