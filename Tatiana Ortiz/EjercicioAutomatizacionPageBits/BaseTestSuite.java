package Pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.PaginaPrincipal;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {

    WebDriver driver;
    PaginaPrincipal paginaPrincipal;

    private void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(this.driver);
    }

    @Before

    public void abrir_driver(){

        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After

    public void cerrar_driver(){

        driver.quit();
    }
}
