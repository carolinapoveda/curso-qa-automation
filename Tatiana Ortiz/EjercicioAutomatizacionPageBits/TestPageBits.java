package Pruebas;

import org.junit.Test;
import org.openqa.selenium.By;


public class TestPageBits extends BaseTestSuite {

    @Test
    public void comenzar_un_proyecto(){

        driver.get("https://www.bitsamericas.com/");

        paginaPrincipal.irAContactenos();

        driver.findElement(By.cssSelector("#contact_us__correo_electronico")).sendKeys("tatiana.ortiz@bitsamericas.com");

        driver.findElement(By.cssSelector("#contact_us__telefono")).sendKeys("3187157072");

        driver.findElement(By.cssSelector("#contact_us__nombre")).sendKeys("Tatiana Ortiz");

        driver.findElement(By.cssSelector("#contact_us__organizacion")).sendKeys("Bits Americas");

        driver.findElement(By.xpath("//ng-select[@id='contact_us__pais']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Colombia");

        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();

        driver.findElement(By.xpath("//input[@id='contact_us__ciudad']")).sendKeys("Cali");

        driver.findElement(By.xpath("//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Desarrollo");

        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();

        driver.findElement(By.xpath("//ng-select[@id='contact_us__productos_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Medical");

        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();

        driver.findElement(By.xpath("//textarea[@id='contact_us__comentario']")).sendKeys("Comentario");

        driver.findElement(By.xpath("//form[@id='formulario_contacto']//label[contains(text(),'He leído y acepto los')]")).click();
    }

}

