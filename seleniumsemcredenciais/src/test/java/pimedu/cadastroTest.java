package pimedu;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

/**
 * Teste automatizado de cadastro de e-mail no sistema PIMEDU usando Selenium WebDriver.
 */
public class cadastroTest {

    private WebDriver navegador;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @Before
    public void setUp(){
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)).pageLoadTimeout(Duration.ofSeconds(20));
        navegador.get("https://pimedu.homero.app.br/");
    }

    /**
     * Testa o fluxo de cadastro de e-mail.
     */
    @Test
    public void cadastroEmail()
    {
       navegador.findElement(By.id("btn-1")).click();
       navegador.findElement(By.id("email-input")).sendKeys("teste@email.com");
       navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();

       // Valida se o cadastro foi enviado com sucesso
       assertTrue(navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section/div/div/div[1]/h4")).getText().contains("Registre-se como aluno"));
    }
}
