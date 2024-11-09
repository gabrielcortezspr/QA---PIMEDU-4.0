package pimedu;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginSenhaEmBrancoTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)).pageLoadTimeout(Duration.ofSeconds(30));
        navegador.get("https://pimedu.homero.app.br/");
    }

    @Test
    public void loginSenhaEmBranco()  throws IOException {
        Properties credentials = loadCredentials("password/credentials.txt");
        String username = credentials.getProperty("username");

        navegador.findElement(By.id("btn-0")).click();
        navegador.findElement(By.id("username-input")).sendKeys(username);
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[2]/div[1]/input")).sendKeys(" ");

        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();

        assertTrue(navegador.findElement(By.id("error-msg")).getText().contains("Esse campo é obrigatório"));
    }
    
    private Properties loadCredentials(String filePath) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        properties.load(reader);
        reader.close();
        return properties;
    }

}
