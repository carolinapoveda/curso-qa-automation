package motoresdebusqueda.google.steps;

import motoresdebusqueda.google.pagejobject.GooglePaginaPrincipal;
import motoresdebusqueda.google.pagejobject.GooglePaginaResultado;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;


import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioGoogle {

    GooglePaginaPrincipal paginaPrincipal;
    GooglePaginaResultado paginaResultado;

    String actor;

    @Step("#actor ingresa a la pagina principal de google")
    public void ingresar_a_dogpile() {
        paginaPrincipal.open();

    }

    @Step("#actor realiza una busqueda  de la palabra: {0}")
    public void busca_por_palabra_clave(String palabraClave) {
        paginaPrincipal.ingresarPalabraClave(palabraClave);
    }

    @Step("#actor deberia ver resulatdos con palabra: {0}")
    public void deberia_ver_resultados_con_palabra(String palabraEsperada) {
        List<String> resultados = paginaResultado.obtenerResultados();
        resultados.replaceAll(String::toLowerCase);
        for (int i = 0; i<resultados.size();i++){
            System.out.println(resultados.get(i));
        }
        assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraEsperada)));

    }
}
