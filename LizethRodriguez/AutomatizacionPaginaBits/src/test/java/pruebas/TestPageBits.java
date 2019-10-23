package pruebas;
import org.junit.Test;
import org.openqa.selenium.By;


public class TestPageBits extends BaseTestSuite{



    @Test

    public void comenzar_un_proyecto(){

        driver.get("https://www.bitsamericas.com/");

        paginaPrincipal.irAContactenos();

        contactenos.ingresarCorreo();

        contactenos.ingresarTelefono();

        contactenos.ingresarNombre();

        contactenos.ingresarOrganizacion();

        contactenos.seleccionarPais();

        contactenos.ingresarCiudad();

        contactenos.seleccionarServicio();

        contactenos.seleccionarProdcuto();

        contactenos.ingresarComentario();

        contactenos.darClicTerminosCondiciones();



    }




}
