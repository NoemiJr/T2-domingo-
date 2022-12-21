package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class TelefonoPage extends BaseClass {
    public TelefonoPage(WebDriver driver) {
        super(driver);
    }
    By locatorTelefono = By.xpath("//input[@id='phonelogin-phonenumber']");

    public void telefonoIniciar(String Numero){
        agregarTexto(esperarAElementoWeb(locatorTelefono),Numero);
        click(esperarAElementoWeb(locatorTelefono));
    }

}
