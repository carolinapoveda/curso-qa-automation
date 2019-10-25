import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestPageBits {

    private WebDriver driver;

    @Before
    public void abrirDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");

       driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test
    public void comenzar_un_proyecto() throws InterruptedException {

        driver.get("https://www.bitsamericas.com");

        driver.findElement(By.xpath("//a[contains(text(),'Contáctenos')]")).click();
        driver.findElement(By.xpath("//input[@id='contact_us__correo_electronico']")).sendKeys("Jacqueline.Buitrago@bitsamericas.com");
        driver.findElement(By.xpath("//input[@id='contact_us__telefono']")).sendKeys("2345678");
        driver.findElement(By.xpath("//input[@id='contact_us__nombre']")).sendKeys("Jacqueline Buitrago");
        driver.findElement(By.xpath("//input[@id='contact_us__organizacion']")).sendKeys("Bits");
        driver.findElement(By.xpath("//ng-select[@id='contact_us__pais']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Colombia");
        driver.findElement(By.xpath("//input[@id='contact_us__ciudad']")).sendKeys("Bogotá");
        driver.findElement(By.xpath("//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Desarrollo");
        driver.findElement(By.xpath("//div[@class='ui-select-choices-row active']//a[@class='dropdown-item']")).click();
        driver.findElement(By.xpath("//ng-select[@id='contact_us__productos_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("iMedical");
        driver.findElement(By.xpath("//textarea[@id='contact_us__comentario']")).sendKeys("Prueba Bits");
        driver.findElement(By.xpath("//form[@id='formulario_contacto']//label[contains(text(),'He leído y acepto los')]")).click();

        Thread.sleep(4000);

    }
    @After
    public void cerrarDriver(){
        driver.quit();
    }



}

