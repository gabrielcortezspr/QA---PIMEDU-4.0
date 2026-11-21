package pageobj.pages;

import org.openqa.selenium.WebDriver;

/**
 * Classe base para todos os Page Objects.
 * Centraliza o WebDriver para ser reutilizado pelas páginas filhas.
 */
public class BasePage {
    
    /**
     * WebDriver protegido para acesso pelas subclasses.
     */
    protected WebDriver navegador;

    /**
     * Construtor recebe o WebDriver já configurado.
     */
    public BasePage (WebDriver navegador){
        this.navegador = navegador;
    }
}
