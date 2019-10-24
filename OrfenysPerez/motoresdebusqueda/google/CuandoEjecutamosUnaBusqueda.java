package motoresdebusqueda.google;

import motoresdebusqueda.google.steps.UsuarioGoogle;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)

 public class CuandoEjecutamosUnaBusqueda {

    @Steps
    UsuarioGoogle Orfenys;

    @Managed
    WebDriver driver;


    @Test
    public void deberiamos_ver_resultados_relevantes(){

        Orfenys.ingresar_a_dogpile();

        Orfenys.busca_por_palabra_clave("bits americas");

        Orfenys.deberia_ver_resultados_con_palabra("bits");
    }
}

