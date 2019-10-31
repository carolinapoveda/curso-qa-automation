package motoresdebusqueda.google;

import motoresdebusqueda.google.steps.UsuarioGoogle;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)

public class CuandoRealizamosUnaBusqueda {

    @Steps

    UsuarioGoogle pilar;

    @Managed
    WebDriver driver;

    @Test

    public void deberiamos_ver_resultados_relevantes () {

        pilar.ingresar_a_google();

        pilar.busca_por_la_palabra_clave("Bits Americas");

        pilar.se_generan_los_resultados_con_la_palabra("Bits");

    }
}
