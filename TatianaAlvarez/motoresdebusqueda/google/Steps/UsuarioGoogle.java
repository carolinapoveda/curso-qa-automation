
package motoresdebusqueda.google.Steps;

import motoresdebusqueda.google.pageobject.GooglePaginaResultados;
import net.thucydides.core.annotations.Step;
import motoresdebusqueda.google.pageobject.Googlepaginaprincipal;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class UsuarioGoogle {

    Googlepaginaprincipal paginaPrincipal;
    GooglePaginaResultados paginaResultados;

    String actor;



    @Step("#actor Ingresa a la pagina principal de google")

    public void ingresar_a_google() {
        paginaPrincipal.open();


    }

    @ Step("#actor realiza busqueda de palabra: {0}")
    public void busca_por_palabra_clave(String palabraClave) {

        paginaPrincipal.ingresarPalabraClave(palabraClave);

    }

    @Step("#actor deberia visualizar los resultados con la palabra: {0} ")

    public void se_generan_resultados_con_palabra(String palabraesperada) {
        List<String> resultados = paginaResultados.obtenerResultados();
        resultados.replaceAll(String::toString);
        for(int i=0;i<resultados.size();i++){
            System.out.println(resultados.get(i));
        }

     assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabraesperada)));

    }


}

