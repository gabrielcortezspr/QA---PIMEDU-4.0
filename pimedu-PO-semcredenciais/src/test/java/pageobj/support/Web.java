package pageobj.support;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {
        public static WebDriver createChrome(){
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts()
        .implicitlyWait(Duration.ofSeconds(20))
        .pageLoadTimeout(Duration.ofSeconds(30));
        navegador.get("https://pimedu.homero.app.br/");

        return navegador;
    }
}
