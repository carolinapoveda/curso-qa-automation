package motoresdebusqueda.google;

import motoresdebusqueda.google.Steps.UsuarioGoogle;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CuandoRealizamosUnaBusqueda {

    @Steps
    UsuarioGoogle tatiana;

    @Managed
    WebDriver driver;

    @Test
    public void deberiamos_ver_resultados_relevantes(){
        tatiana.ingresar_a_google();
        tatiana.busca_por_la_palabra_clave("Bits Americas");
        tatiana.se_genera_resultados_con_palabra("Bits");
    }
}
