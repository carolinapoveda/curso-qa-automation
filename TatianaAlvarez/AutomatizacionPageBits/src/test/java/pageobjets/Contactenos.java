package pageobjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactenos {

    @FindBy (css = "#contact_us__correo_electronico")
    WebElement correo;

    public void ingresarcorreo(){
        correo.sendKeys("tatiana.alvarez@bistamericas.com");
    }

    @FindBy(css = "#contact_us__telefono")
    WebElement telefono;

    public void ingresarTelefono(){
        telefono.sendKeys("3157318513");
    }

     @FindBy (css = "#contact_us__nombre")
     WebElement nombre;

    public void  ingresarNombre(){
        nombre.sendKeys("Tatiana Alvarez");
    }

    @FindBy (css= "#contact_us__organizacion")
    WebElement organizacion;

    public void ingresarOrganizacion(){
        organizacion.sendKeys("BITS Americas");
    }

    @FindBy(xpath = "//ng-select[@id='contact_us__pais']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")
    WebElement pais;

    public void ingresarPais(){
        pais.sendKeys("Colombia");
    }

    @FindBy (xpath = "//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")
    WebElement ciudad;

    public void ingresarCiudad(){
    ciudad.sendKeys("Bogotá");

    }

    @FindBy (xpath = "//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")
    WebElement servicio;


    public void ingresarServicio(){
        servicio.sendKeys("Desarrollo de Software ");
    }




 public Contactenos (WebDriver driver){
     PageFactory.initElements(driver, this);

}

}
