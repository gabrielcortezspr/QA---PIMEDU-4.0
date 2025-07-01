package pageobj.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobj.pages.LoginPage;
import pageobj.support.Web;;

/**
 * Classe de Step Definitions do Cucumber.
 * Liga as etapas do arquivo .feature aos métodos Java.
 */
public class StepDefinitions {
    private WebDriver navegador;
    String username;
    String password;

    /**
     * Carrega as credenciais do arquivo externo.
     */
    private Properties loadCredentials(String filePath) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        properties.load(reader);
        reader.close();
        return properties;
    }

    /**
     * Dado que o usuário está na homepage, inicializa o navegador.
     */
    @Given("O usuario esta na Homepage")
    public void o_usuario_esta_na_homepage() {
        navegador = Web.createChrome();
    }

    /**
     * Quando o usuário abrir a tela de login, carrega as credenciais e clica no botão de login.
     */
    @When("O usuario abrir a tela de Login")
    public void o_usuario_abrir_a_tela_de_login() throws IOException  {    
        Properties credentials = loadCredentials("src\\credentials.txt");
        username = credentials.getProperty("username");
        password = credentials.getProperty("password");
        new LoginPage(navegador).botaoAbrirLogin();
    }

    /**
     * Quando realizar o login, preenche os campos e clica em entrar.
     */
    @When("Realizar o login")
    public void realizar_o_login(){
        new LoginPage(navegador)
        .botaoAbrirLogin()
        .preencherUsernameLogin(username)
        .preencherSenhaLogin(password)
        .botaoEntrar();
    }

    /**
     * Então a tela de cursos deve ser exibida, validando o login.
     */
    @Then("A tela de cursos deve ser exibida")
    public void a_tela_de_cursos_deve_ser_exibida() {
        new LoginPage(navegador).loginRealizado();
    }

}
