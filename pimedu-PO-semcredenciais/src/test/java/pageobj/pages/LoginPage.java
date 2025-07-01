package pageobj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a tela de Login do sistema PIMEDU.
 * Encapsula as ações e elementos da tela de login.
 */
public class LoginPage extends BasePage{

    /**
     * Construtor recebe o WebDriver já configurado.
     */
    public LoginPage(WebDriver navegador) {
        super(navegador);
    }
    
    /**
     * Clica no botão para abrir o formulário de login.
     */
    public LoginPage botaoAbrirLogin(){
       navegador.findElement(By.id("btn-0")).click();
        return this;
    }

    /**
     * Preenche o campo de e-mail/usuário no login.
     */
    public LoginPage preencherUsernameLogin(String email){
        navegador.findElement(By.id("username-input")).sendKeys(email);
        return this;
    }    

    /**
     * Preenche o campo de senha no login.
     */
    public LoginPage preencherSenhaLogin(String senha){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[2]/div[1]/input")).sendKeys(senha);
        return this;
    }

    /**
     * Clica no botão para efetuar o login.
     */
    public LoginPage botaoEntrar(){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();
        return this;
    }
    
    /**
     * Verifica se o login foi realizado com sucesso.
     * @return true se a tela "Todos os cursos" estiver visível
     */
    public boolean loginRealizado() {
        return navegador.findElement(By.xpath("/html/body/div[1]/main/section/main/h4")).getText().contains("Todos os cursos");
        }

}
