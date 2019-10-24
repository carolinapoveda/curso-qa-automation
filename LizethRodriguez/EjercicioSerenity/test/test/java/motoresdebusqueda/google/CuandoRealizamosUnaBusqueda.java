package motoresdebusqueda.google;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.UsuarioGoogle;

@RunWith(SerenityRunner.class)

public class CuandoRealizamosUnaBusqueda {

    @Steps

    UsuarioGoogle lizeth;

    @Managed
    WebDriver driver;

    @Test

    public void deberiamos_ver_resultados_relevantes (){

        lizeth.ingresar_a_google();

        lizeth.busca_por_palabra_clave("Bits Americas");

        lizeth.se_generan_resultados_con_la_palabra("Bits");

    }

}
