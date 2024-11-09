import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
//import org.testng.annotations.Test;

public class BeforeEAfter {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)).pageLoadTimeout(Duration.ofSeconds(30));
        navegador.get("https://automationexercise.com/login");
    }

    @Test
    public void chromeTest(){
        //WebDriver navegador = new ChromeDriver();
        //navegador.get("https://automationexercise.com/login");
        //Criar formulario
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        
        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("nomeCurso");

        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste@teste.com");

        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        
        assertTrue(navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/p")).getText().contains("Email Address already exist!"));

        
    }

    @After
    public void tearDown(){

        //navegador.quit();

    }

   
}
