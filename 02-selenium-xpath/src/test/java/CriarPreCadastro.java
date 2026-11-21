import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Teste automatizado de pré-cadastro em site de exemplo usando Selenium WebDriver.
 * Demonstra preenchimento de formulário simples.
 */
public class CriarPreCadastro {

    /**
     * Testa o fluxo de pré-cadastro.
     */
    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
        // Localiza o formulário de cadastro
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        // Preenche o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("nomeCurso");
        // Preenche o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste@teste.com");
        // Clica no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        navegador.quit();
    }

}
