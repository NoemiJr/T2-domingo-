package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class FacePage extends BaseClass {
    public FacePage(WebDriver driver) {
        super(driver);
    }
    //atributos

    By locatorFaceCorreo = By.xpath("//input[@id='email']");
    By locatorContrase = By.xpath("//input[@id='pass']");
    By locatorbtnFace = By.xpath("//*[@id=\"loginbutton\"]");

    By locatorMensajeAlerta = By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div");

     //metodos
    public void faceiniciarsersion (String correo, String contrasenia){
        agregarTexto(esperarAElementoWeb(locatorFaceCorreo),correo);
        agregarTexto(esperarAElementoWeb(locatorContrase),contrasenia);
        click(esperarAElementoWeb(locatorbtnFace));
    }
    public String MensajeAlerta (){
        return obtenerTexto(esperarAElementoWeb(locatorMensajeAlerta));
    }



}
