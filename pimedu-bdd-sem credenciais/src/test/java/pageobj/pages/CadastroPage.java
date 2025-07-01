package pageobj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page Object para a tela de Cadastro do sistema PIMEDU.
 * Encapsula as ações e elementos da tela de cadastro.
 */
public class CadastroPage extends BasePage{

    /**
     * Construtor recebe o WebDriver já configurado.
     */
    public CadastroPage(WebDriver navegador) {
        super(navegador);
    }

    /**
     * Clica no botão para abrir o formulário de cadastro.
     */
    public void botaoAbrirCadastro(){
       navegador.findElement(By.id("btn-1")).click();
    }

    /**
     * Preenche o campo de e-mail no cadastro.
     */
    public void preencherEmailCadastro(String email){
        navegador.findElement(By.id("email-input")).sendKeys(email);
    }
    
    /**
     * Clica no botão para enviar o cadastro.
     */
    public void botaoCadastrar(){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();
    }

    /**
     * Verifica se o cadastro foi enviado com sucesso.
     * @return true se a tela "Registre-se como aluno" estiver visível
     */
    public boolean cadastroEnviado(String texto) {
        return navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section/div/div/div[1]/h4")).getText().contains("Registre-se como aluno");
    }
}
