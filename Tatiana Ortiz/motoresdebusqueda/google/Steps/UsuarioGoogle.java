package motoresdebusqueda.google.Steps;

import motoresdebusqueda.google.pageobject.GooglePaginaPrincipal;
import motoresdebusqueda.google.pageobject.GooglePaginaResultados;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioGoogle {
    GooglePaginaPrincipal paginaPrincipal;
    GooglePaginaResultados paginaResultados;

    String actor;

    @Step("#actor ingresa a la pagina principal de google")
    public void ingresar_a_google() {

        paginaPrincipal.open();
    }

    @Step ("#actor realiza una busqueda de la palabra: {0}")
    public void busca_por_la_palabra_clave(String palabraClave) {

        paginaPrincipal.ingresarPalabraClave(palabraClave);
    }

    @Step ("#actor deberia revisar los resultados con la palabra {0}")
    public void se_genera_resultados_con_palabra(String palabraEsperada) {

        List<String> resultados = paginaResultados.obtenerResultados();
        resultados.replaceAll(String::toLowerCase);
        for (int i=0; i<resultados.size(); i++){
            System.out.println(resultados.get(i));
        }
        assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraEsperada)));
    }
}
