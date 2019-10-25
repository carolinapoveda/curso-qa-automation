package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import pageobject.GooglePaginaPrincipal;
import pageobject.GooglePaginaResultado;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class UsuarioGoogle {

    GooglePaginaPrincipal paginaPrincipal;
    GooglePaginaResultado paginaResultados;

    String actor;

    @Step("#actor Ingresa a la página principal de Google")
    public void ingresar_a_google() {
        paginaPrincipal.open();
    }
    @Step("#actor Realiza una búsqueda de la palabra: {0} ")
    public void busca_por_palabra_clave(String palabraClave) {
        paginaPrincipal.ingresaPalabraClave(palabraClave);

    }
    @Step("#actor Deberia visualizar los resultados con las palabra: {0}")
    public void se_generan_resultados_con_la_palabra(String palabraEsperada) {

        List<String> resultados = paginaResultados.obtenerResultados();
        resultados.replaceAll(String::toLowerCase);
        for (int i=0;i<resultados.size();i++){
            System.out.println(resultados.get(i));
        }

        assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraEsperada)));
    }
}
