package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactenos {

    @FindBy(xpath = "#contact_us__telefono")
    WebElement ingreseCorreo;

    @FindBy(css = "#contact_us__telefono")
    WebElement ingreseTelefono;

    @FindBy(css = "#contact_us__nombre")
    WebElement ingreseNombre;

    @FindBy(css = "#contact_us__organizacion")
    WebElement ingreseOrganizacion;

    @FindBy(xpath = "//ng-select[@id='contact_us__pais']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")
    WebElement seleccionePais;

    @FindBy(xpath = "//input[@id='contact_us__ciudad']")
    WebElement ingreseCiudad;

    @FindBy(xpath = "//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")
    WebElement seleccioneServicio;

    @FindBy(xpath = "//ng-select[@id='contact_us__productos_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")
    WebElement getSeleccioneProducto;

    @FindBy(xpath = "//textarea[@id='contact_us__comentario']")
        WebElement ingreseComentario;

    @FindBy(xpath = "//form[@id='formulario_contacto']//label[contains(text(),'He leído y acepto los')]")
    WebElement clicTerminosCondiciones;


    public void ingresarCorreo(){
        ingreseCorreo.sendKeys("lizeth.rodriguez@bitsamericas.com");

    }

    public void ingresarTelefono(){
        ingreseTelefono.sendKeys("3024456985");
    }

    public void ingresarNombre(){
        ingreseNombre.sendKeys("Lizeth Rodriguez");
    }

    public void ingresarOrganizacion(){
        ingreseOrganizacion.sendKeys("Bits Americas");
    }

    public void seleccionarPais(){
        seleccionePais.sendKeys("Colombia");
        seleccionePais.click();
    }

    public void ingresarCiudad(){
        ingreseCiudad.sendKeys("Bogota");
    }

    public void seleccionarServicio(){
        seleccioneServicio.sendKeys("Soporte y mantenimiento");
        seleccioneServicio.click();
    }

    public void seleccionarProdcuto(){
        getSeleccioneProducto.sendKeys("Servicio de Outsourcing");
        getSeleccioneProducto.click();
    }

    public void ingresarComentario(){
        ingreseComentario.sendKeys("Prueba");
    }

    public void darClicTerminosCondiciones(){
        clicTerminosCondiciones.click();
    }

    public  Contactenos(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
