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
    UsuarioGoogle Jacqueline;

    @Managed
    WebDriver driver;


    @Test
    public void deberiamos_ver_resultados_relevantes(){

        Jacqueline.ingresar_a_dogpile();

        Jacqueline.busca_por_palabra_clave("bits americas");

        Jacqueline.deberia_ver_resultados_con_palabra("bits");
    }
}

