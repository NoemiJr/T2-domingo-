package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BaseClass;

public class LoginPage extends BaseClass {

    By locatorbtniniG= By.xpath ("//button[@data-testid='google-login']");
    By locatorbtniniF= By.xpath("//button[@data-testid='facebook-login']");
    By locatorbtniniTelefono= By.xpath("//button[@data-testid='phone-login'] ");

    By locatorbtnApple = By.xpath("//button[@data-testid='apple-login']");

    public void googlesesion(){
        click(esperarAElementoWeb(locatorbtniniG));
    }
    public void facesesion(){
        click(esperarAElementoWeb(locatorbtniniF));
    }
    public void telefonosesion(){click(esperarAElementoWeb(locatorbtniniTelefono)); }

    public  void applesesion(){click(esperarAElementoWeb(locatorbtnApple));}

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
