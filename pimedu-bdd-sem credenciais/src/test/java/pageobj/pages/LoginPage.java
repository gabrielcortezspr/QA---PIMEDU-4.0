package pageobj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }
    
    public LoginPage botaoAbrirLogin(){
       navegador.findElement(By.id("btn-0")).click();
        return this;
    }

    public LoginPage preencherUsernameLogin(String email){
        navegador.findElement(By.id("username-input")).sendKeys(email);
        return this;
    }    

    public LoginPage preencherSenhaLogin(String senha){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[2]/div[1]/input")).sendKeys(senha);
        return this;
    }

    public LoginPage botaoEntrar(){
        navegador.findElement(By.xpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button/span")).click();
        return this;
    }
    
    public boolean loginRealizado() {
        return navegador.findElement(By.xpath("/html/body/div[1]/main/section/main/h4")).getText().contains("Todos os cursos");
        }

}
