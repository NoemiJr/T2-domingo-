package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class BuscarPage extends BaseClass{
    By buscar = By.xpath("//input[@placeholder='¿Qué te apetece escuchar?']");
    By buscarMixGenero = By.xpath("//*[@id=\"searchPage\"]/div/div/section[10]/div[2]/div[1]/div/div[2]/a/div");

    public BuscarPage(WebDriver driver) {
        super(driver);
    }

    public void escribirBuscador(String aBuscar){agregarTexto(esperarAElementoWeb(buscar), aBuscar);}
    public String obtenerGenero(){return obtenerTexto(esperarAElementoWeb(buscarMixGenero));}
}