package com.example;



import org.junit.Test;

import static org.junit.Assert.*;



public class ValidacaoVerdadeiroFalsoTest {

    

    @Test

    public void validacaoVerdadeiro_Sucesso () {

        // espera que eu passe um true

        boolean campoEstaPresente = false;

        assertTrue(campoEstaPresente); 

        

    }

    

    @Test

    public void validacaoVerdadeiro_Falha() {

        // espera que eu passe um false

        //trocar para true para apresentar o erro

        boolean campoEstaPresente = false;

        assertFalse("Campo não está presente", campoEstaPresente);

    }



}