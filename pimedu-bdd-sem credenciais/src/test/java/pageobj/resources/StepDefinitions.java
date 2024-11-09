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

public class StepDefinitions {
    private WebDriver navegador;
    String username;
    String password;


    private Properties loadCredentials(String filePath) throws IOException {
        Properties properties = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        properties.load(reader);
        reader.close();
        return properties;
    }

    @Given("O usuario esta na Homepage")
    public void o_usuario_esta_na_homepage() {
        // Write code here that turns the phrase above into concrete actions
        navegador = Web.createChrome();
    }
    @When("O usuario abrir a tela de Login")
    public void o_usuario_abrir_a_tela_de_login() throws IOException  {    
        Properties credentials = loadCredentials("src\\credentials.txt");
        username = credentials.getProperty("username");
        password = credentials.getProperty("password");
        new LoginPage(navegador).botaoAbrirLogin();
    }

    @When("Realizar o login")
    public void realizar_o_login(){
        new LoginPage(navegador)
        .botaoAbrirLogin()
        .preencherUsernameLogin(username)
        .preencherSenhaLogin(password)
        .botaoEntrar();
    }

    @Then("A tela de cursos deve ser exibida")
    public void a_tela_de_cursos_deve_ser_exibida() {
        new LoginPage(navegador).loginRealizado();
    }

}
