package com.example;

import org.junit.Test;

/**
 * Exemplo de primeiros testes automatizados com JUnit.
 * Mostra a execução de métodos anotados com @Test.
 */
public class MeuPrimeiroTesteTest {

    /**
     * Teste 1: imprime mensagem ao ser executado.
     */
    @Test
    public void teste1 () {
        System.out.println("Teste1 executado");
    }

    /**
     * Teste 2: imprime mensagem ao ser executado.
     */
    @Test
    public void teste2 () {
        System.out.println("Teste2 executado");
    }

    /**
     * Este método não é um teste pois não possui a anotação @Test.
     */
    public void naoEUmTeste () {
        System.out.println("Esta mensagem não deve aparecer");
    }

}

