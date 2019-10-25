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
    public void  abirDriver(){

        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test

    public void comenzar_un_proyecto(){

        driver.get("https://www.bitsamericas.com/inicio");

        driver.findElement(By.xpath("//a[contains(text(),'Contáctenos')]")).click();

        driver.findElement(By.xpath("//input[@id='contact_us__correo_electronico']")).sendKeys("pilar.gomez@bitsamericas.com");

        driver.findElement(By.cssSelector("#contact_us__telefono")).sendKeys("8521962");

        driver.findElement(By.xpath("//input[@id='contact_us__nombre']")).sendKeys("Pilar Gomez");

        driver.findElement(By.xpath("//input[@id='contact_us__organizacion']")).sendKeys("Bits Americas");

        driver.findElement(By.xpath("//ng-select[@id='contact_us__pais']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Colombia");

        driver.findElement(By.xpath("//input[@id='contact_us__ciudad']")).sendKeys("Bogotá");

        driver.findElement(By.xpath("//ng-select[@id='contact_us__servicios_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("Soporte y mantenimiento");

        driver.findElement(By.xpath("//ng-select[@id='contact_us__productos_de_interes']//span[@class='btn btn-default btn-secondary form-control ui-select-toggle']")).sendKeys("iMedical");

        driver.findElement(By.xpath("//textarea[@id='contact_us__comentario']")).sendKeys("Muy bien gracias");
    }

        @After
        public void cerrarDriver(){

        driver.quit();

        }
   }
