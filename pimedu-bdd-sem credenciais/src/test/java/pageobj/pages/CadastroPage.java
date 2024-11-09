package pageobj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage extends BasePage{

    public CadastroPage(WebDriver navegador) {
        super(navegador);
    }

    public void botaoAbrirCadastro(){
       navegador.findElement(By.id("btn-1")).click();
    }

    public void preencherEmailCadastro(String email){
        navegador.findElement(By.id("email-input")).sendKeys(email);
    }
    
    public void botaoCadastrar(){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();
    }

    public boolean cadastroEnviado(String texto) {
        return navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section/div/div/div[1]/h4")).getText().contains("Registre-se como aluno");
    }
}
