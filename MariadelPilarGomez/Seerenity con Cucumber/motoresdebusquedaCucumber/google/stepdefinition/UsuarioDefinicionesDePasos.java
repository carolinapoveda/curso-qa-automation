package motoresdebusquedaCucumber.google.stepdefinition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import motoresdebusquedaCucumber.google.steps.UsuarioGoogle;
import net.thucydides.core.annotations.Steps;

import static org.hamcrest.MatcherAssert.assertThat;


public class UsuarioDefinicionesDePasos {


    @Steps(shared = true)
    UsuarioGoogle usuario;

    @Given("^Que (.*) ingresa a google$")
    public void ingresar_a_google(String nombreDeUsuario) {
        usuario.isCalled(nombreDeUsuario);
       usuario.ingresar_a_google();
    }

    @When("^(.*) realiza una busqueda de: (.*)$")
    public void busca_por_la_palabra_clave(String nombreDeUsuario,String palabraClave) {
        usuario.isCalled(nombreDeUsuario);
        usuario.busca_por_la_palabra_clave(palabraClave);
    }

    @Then("^(.*) deberia visualizar los resultados que contengan la palabra: (.*)$")
    public void se_generan_los_resultados_con_la_palabra(String nombreDeUsuario,String palabraEsperada) {
        usuario.isCalled(nombreDeUsuario);
        usuario.se_generan_los_resultados_con_la_palabra(palabraEsperada);
        }

}
