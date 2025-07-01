package pageobj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageobj.pages.LoginPage;
import pageobj.support.Web;

/**
 * Teste automatizado de login utilizando Page Object Model.
 * Lê as credenciais de um arquivo externo e executa o fluxo de login.
 */
public class LoginTest {

    private WebDriver navegador;

    /**
     * Inicializa o navegador antes de cada teste.
     */
    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    /**
     * Testa o login com credenciais válidas.
     */
    @Test
    public void login() throws IOException {
        Properties credentials = loadCredentials("src\\credentials.txt");
        String username = credentials.getProperty("username");
        String password = credentials.getProperty("password");

        new LoginPage(navegador)
        .botaoAbrirLogin()
        .preencherUsernameLogin(username)
        .preencherSenhaLogin(password)
        .botaoEntrar()
        .loginRealizado();
    }

    /**
     * Lê as credenciais do arquivo externo.
     */
    private Properties loadCredentials(String filePath) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        properties.load(reader);
        reader.close();
        return properties;
    }
}
