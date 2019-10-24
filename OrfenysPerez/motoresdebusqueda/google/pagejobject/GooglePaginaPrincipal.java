package motoresdebusqueda.google.pagejobject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.google.com/")
public class GooglePaginaPrincipal extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    WebElementFacade cajaDeBusqueda;


    public void ingresarPalabraClave(String palabraClave) {
        cajaDeBusqueda.typeAndEnter(palabraClave);

    }

}
