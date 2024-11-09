import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CriarPreCadastro {

    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");
        //Criar formulario
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        
        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("nomeCurso");

        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste@teste.com");

        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        
        navegador.quit();
    }

   
}
