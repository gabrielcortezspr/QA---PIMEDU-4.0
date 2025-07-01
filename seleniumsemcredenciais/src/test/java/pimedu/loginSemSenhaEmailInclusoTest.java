package pimedu;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Teste automatizado de login com campo de senha em branco.
 * Valida a mensagem de erro exibida pelo sistema.
 */
public class loginSemSenhaEmailInclusoTest {
    private WebDriver navegador;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @Before
    public void setUp(){
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)).pageLoadTimeout(Duration.ofSeconds(30));
        navegador.get("https://pimedu.homero.app.br/");
    }

    /**
     * Testa o login com senha em branco e valida a mensagem de erro.
     */
    @Test
    public void loginSenhaEmBranco() {
        navegador.findElement(By.id("btn-0")).click();
        navegador.findElement(By.id("username-input")).sendKeys("melissa.sousa@irede.org.br");
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[2]/div[1]/input")).sendKeys(" ");

        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();

        // Valida se a mensagem de erro "Esse campo é obrigatório" é exibida
        assertTrue(navegador.findElement(By.id("error-msg")).getText().contains("Esse campo é obrigatório"));
    }

}
