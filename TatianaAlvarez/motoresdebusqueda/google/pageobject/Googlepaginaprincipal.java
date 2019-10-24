

package motoresdebusqueda.google.pageobject;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com")
public class Googlepaginaprincipal extends PageObject {

    @FindBy(xpath = "//input[@name='q']")
    WebElementFacade cajaDeBusqueda;

    public void ingresarPalabraClave(String palabraClave) {
        cajaDeBusqueda.typeAndEnter("palabraClave");
    }


}







