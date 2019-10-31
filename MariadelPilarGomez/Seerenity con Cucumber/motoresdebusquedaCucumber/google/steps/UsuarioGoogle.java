package motoresdebusquedaCucumber.google.steps;

import motoresdebusquedaCucumber.google.pageobject.GooglePaginaPrincipal;
import motoresdebusquedaCucumber.google.pageobject.GooglePaginaResultado;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class UsuarioGoogle extends ScenarioActor {
    String actor;

    @Steps
    GooglePaginaPrincipal paginaPrincipal;
    @Steps
    GooglePaginaResultado paginaResultados;

    @Step("#actor ingresa a la pagina principal de google$")
    public void ingresar_a_google() {
        paginaPrincipal.setDefaultBaseUrl("https://www.google.com/");
        paginaPrincipal.open();
    }

    @Step("#actor realiza una busqueda de: {0}")
    public void busca_por_la_palabra_clave(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
    }

    @Step("#actor deberia visualizar los resultados que contengan la palabra: {0}")
    public void se_generan_los_resultados_con_la_palabra(String palabraEsperada) {
        List<String> resultados = paginaResultados.obtenerResultados();
        resultados.replaceAll(String::toLowerCase);
        for (int i=0;i<resultados.size();i++) {
            System.out.println(resultados.get(i));
        }

       assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraEsperada)));

    }
}
