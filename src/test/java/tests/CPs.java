package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;


public class CPs {
    //Atributos
    private HomePage homePage;
//-------------------------------------
    private LoginPage loginPage;
    private GooglePage googlePage;
    private FacePage facePage;
    private TelefonoPage telefonoPage;

    private BuscarPage buscarPage;

    private ApplePage applePage;

//------------------------------------------
    private RegisterPage registerPage;
    private WebDriver driver;
    private String browser = "CHROME";
    private String propertyDriver = "webdriver.chrome.driver";
    private String urlDriver = System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe";
    private String url = "https://www.spotify.com/";

    @BeforeMethod
    public void preparacionTests(){
        homePage = new HomePage(driver); //Se crea la page del home
        homePage.conexionBrowser(browser,propertyDriver,urlDriver); //Se conecta el driver de chrome
        registerPage = new RegisterPage(homePage.getDriver()); //se crea la page de registro
//--------------------------------------------------------
        loginPage = new LoginPage(homePage.getDriver());
        googlePage = new GooglePage(loginPage.getDriver());
        facePage = new FacePage(loginPage.getDriver());
        telefonoPage = new TelefonoPage(loginPage.getDriver());
        applePage = new ApplePage(loginPage.getDriver());
        buscarPage = new BuscarPage(homePage.getDriver());

//---------------------------------------------------------------
        homePage.cargarPagina(url);
        homePage.maximizarBrowser();
    }

   /* @Test
    public void CP001_Registro_Fallido_Captcha_en_blanco(){
        homePage.irARegistrarte();
        registerPage.completarFormularioRegistro("domingo.saavedra@tsoftglobal.com", "domingo.saavedra@tsoftglobal.com", "123454321", "Pobre Domingo", "31", "Abril", "1990");
        Assert.assertEquals(registerPage.obtenerErrorCaptchaVacio(),"Confirma que no eres un robot.");
    }
*/
    @AfterMethod
    public void posTests(){
        registerPage.cerrarBrowser();
    }

@Test
    public void  CP001_Iniciar_Sesion(){
    homePage.iraIniciarsesion();
    loginPage.googlesesion();
    String titulo = googlePage.ObtenerTitulos();
    Assert.assertEquals("Inicia sesión: Cuentas de Google",titulo);
}
@Test
    public void CP002_Iniciar_Sesion_Facebook(){
        homePage.iraIniciarsesion();
        loginPage.facesesion();
       facePage.faceiniciarsersion("jesica.rodriguez@Tsoft.com","39402075");
       String mesajeAlerta = facePage.MensajeAlerta();
       Assert.assertEquals("El correo electrónico que has introducido no está conectado a una cuenta. Encuentra tu cuenta e inicia sesión.", mesajeAlerta);
}
@Test
    public void CP003_Iniciar_Sesion_Teléfono(){
        homePage.iraIniciarsesion();
        loginPage.telefonosesion();
        telefonoPage.telefonoIniciar("3804531454");

}
    @Test
    public void CP001_Buscar_Genero() throws InterruptedException {
        homePage.irABuscar();
        buscarPage.escribirBuscador("Hip hop");
        Assert.assertEquals(buscarPage.obtenerGenero(),"Hip hop");
    }
}

