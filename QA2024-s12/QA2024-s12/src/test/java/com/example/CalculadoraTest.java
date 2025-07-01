package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Teste unitário para a classe Calculadora.
 * Demonstra o uso do assertEquals para validar operações matemáticas.
 */
public class CalculadoraTest {

    Calculadora calculo = new Calculadora();

    // Exemplo de teste comentado para mostrar erro proposital
    /*
    @Test
    public void soma (){
        assertEquals(4,calculo.calc(4, 4)); // valor incorreto
    }
    */

    // Teste correto de soma
    @Test
    public void soma (){
        assertEquals(5,calculo.calc(2, 3)); // valor correto
    }

}