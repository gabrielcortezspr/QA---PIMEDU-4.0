package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Exemplo de uso de pré-condições (@Before) e pós-condições (@After) em testes JUnit.
 * Mostra a ordem de execução dos métodos em relação aos testes.
 */
public class PreEPosCondicoesDeTeste {

    /**
     * Executa antes de cada teste.
     */
    @Before
    public void preCondicao() {
        System.out.println("Executou a pre condicao");
    }

    /**
     * Teste 1: imprime mensagem ao ser executado.
     */
    @Test
    public void exibicaoPrePosCondicao_Teste1() {
        System.out.println("Executou o Teste 1");
    }

    /**
     * Teste 2: imprime mensagem ao ser executado.
     */
    @Test
    public void exibicaoPrePosCondicao_Teste2() {
        System.out.println("Executou o Teste 2");
    }

    /**
     * Executa após cada teste.
     */
    @After
    public void posCondicao() {
        System.out.println("Executou a pos condicao");
    }

}

