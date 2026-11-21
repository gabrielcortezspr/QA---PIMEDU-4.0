package pageobj.resources;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Classe runner para execução dos testes BDD com Cucumber.
 * Utiliza JUnit para rodar os cenários definidos nos arquivos .feature.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"})
public class RunCucumberTest {

    // Não é necessário implementar métodos, a configuração é feita pelas anotações.
}
