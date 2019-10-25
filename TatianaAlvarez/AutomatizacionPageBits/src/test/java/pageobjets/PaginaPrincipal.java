package pageobjets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {

    @FindBy(xpath = ",//a[contains(text(),'Contáctenos')]")
    WebElement botonContactenos;

    public void irAContactenos (){
        botonContactenos.click();

    }

    public PaginaPrincipal(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
}
