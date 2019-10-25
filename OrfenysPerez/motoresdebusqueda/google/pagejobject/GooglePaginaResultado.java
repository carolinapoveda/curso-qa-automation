package motoresdebusqueda.google.pagejobject;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class GooglePaginaResultado extends PageObject {

    public static final String TITULO_RESULTADO = "#web-bing__title";

    public List<String> obtenerResultados() {
        return findAll(TITULO_RESULTADO)
                .stream()
                .map(element ->element.getAttribute("texContent"))
                .collect(Collectors.toList());
    }
}
