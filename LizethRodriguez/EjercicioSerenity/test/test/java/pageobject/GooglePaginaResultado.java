package pageobject;

import net.serenitybdd.core.pages.PageObject;

import java.util.List;
import java.util.stream.Collectors;

public class GooglePaginaResultado extends PageObject {

    public static final String TITULO_RESULTADO = ".web-bing_tittle";

    public List<String> obtenerResultados(){

        return findAll(TITULO_RESULTADO)
                .stream()
                .map(element -> element.getAttribute("textContext"))
                .collect(Collectors.toList());
    }

}
