package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    //las pages tienen por objetivo centralizar los localizador y acciones de pagina

    // Locators
    By locatorBtnRegistrarte = By.xpath("//button[contains(text(),'Registrarte')]");
    By iniciar = By.xpath("//button[@data-testid='login-button']");
    By verBtnBuscar = By.xpath("//span[contains(text(),'Buscar')]");

    By iniciarBT = By.xpath("//button[@data-testid='login-button']");



    //Acciones
    public void irARegistrarte(){click(esperarAElementoWeb(locatorBtnRegistrarte));}
    public void iraIniciarsesion(){click(esperarAElementoWeb(iniciar));}
    public void irABuscar(){click(esperarAElementoWeb(verBtnBuscar));}
}
