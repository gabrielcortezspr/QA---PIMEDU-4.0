package com.example;



import static org.junit.Assert.*;



import org.junit.Test;



public class ValidacaoIgualdadeTest {

    

    @Test 
    
    public void validacaoIgualidade_Sucesso() {

        String resultadoObtido = "Registro salvo com sucesso!";

        assertEquals("Registro salvo com sucesso!", resultadoObtido);

    }



 //   @Test

    public void validacaoIgualdade_Falha() {

    String resultadoObtido = "Registro excluido com sucesso!";

    //alterar o texto para 'Registro salvo com sucesso' para o teste falhar

    assertEquals("Registro excluido com sucesso!", resultadoObtido);

}}

    