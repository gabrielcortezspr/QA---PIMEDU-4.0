import java.util.Random;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
//import org.testng.annotations.Test;

public class Cadastro {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = new ChromeDriver();
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
        // Função para criar emails randomicos:
        Random rand = new Random();
        int randomNum = rand.nextInt((10000 - 1) + 1) + 1;

        //Preencher o campo Email
        //loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste@teste.com");
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("teste" + randomNum + "@email.com");

        //Clicar no botão SingUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();
        
        WebElement cadastro = navegador.findElement((By.id("form")));

        cadastro.findElement(By.id("id_gender1")).click();

        cadastro.findElement((By.id("password"))).sendKeys("123456");

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[18]")).click();

        cadastro.findElement((By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[7]"))).click();

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[12]")).click();

        cadastro.findElement(By.id("newsletter")).click();

        cadastro.findElement(By.id("optin")).click();

        cadastro.findElement(By.id("first_name")).sendKeys("Antonio");

        cadastro.findElement(By.id("last_name")).sendKeys("Wellington");

        cadastro.findElement(By.id("address1")).sendKeys("casa");

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[4]")).click();

        cadastro.findElement(By.id("state")).sendKeys("Ceará");

        cadastro.findElement(By.id("city")).sendKeys("Fortaleza");

        cadastro.findElement(By.id("zipcode")).sendKeys("0000000");

        cadastro.findElement(By.id("mobile_number")).sendKeys("00000000");
        //saindo do formulario

        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();

    }

   //@After
    public void tearDown(){

        navegador.quit();

    }

   
}
