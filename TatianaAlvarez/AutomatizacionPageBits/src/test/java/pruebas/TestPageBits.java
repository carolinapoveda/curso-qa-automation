package pruebas;
import org.junit.Test;
import org.openqa.selenium.By;
import pageobjets.PaginaPrincipal;

public class TestPageBits extends BestTestSuite{


    @Test

    public void comenzar_un_proyecto() throws InterruptedException {

        driver.get("https://www.bitsamericas.com/");

        paginaPrincipal.irAContactenos();
        contactenos.ingresarcorreo();
        contactenos.ingresarTelefono();
        contactenos.ingresarNombre();
        contactenos.ingresarOrganizacion();
        contactenos.ingresarPais();
        contactenos.ingresarCiudad();

        driver.findElement(By.xpath("//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Desarrollo");

        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();

        driver.findElement(By.xpath("//ng-select[@id='contact_us__productos_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Medical");

        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();

        driver.findElement(By.xpath("//textarea[@id='contact_us__comentario']")).sendKeys("Comentario");

        driver.findElement(By.xpath("//form[@id='formulario_contacto']//label[contains(text(),'He leído y acepto los')]")).click();

        Thread.sleep(5000);

    }

    }






