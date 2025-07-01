package pageobj.support;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Classe utilitária para configuração do WebDriver (Selenium).
 * Centraliza a criação e configuração do navegador Chrome.
 */
public class Web {
    /**
     * Cria e retorna uma instância do ChromeDriver já configurada.
     * Define timeouts e abre a página inicial do sistema.
     */
    public static WebDriver createChrome(){
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts()
            .implicitlyWait(Duration.ofSeconds(20))
            .pageLoadTimeout(Duration.ofSeconds(30));
        navegador.get("https://pimedu.homero.app.br/");

        return navegador;
    }
}
