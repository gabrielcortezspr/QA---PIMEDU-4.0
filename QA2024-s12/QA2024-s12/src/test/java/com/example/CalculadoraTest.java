package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CalculadoraTest {

    Calculadora calculo = new Calculadora();

    /*

    //valor incorreto 

    @Test

    public void soma (){

        assertEquals(4,calculo.calc(4, 4));

    }

    */

    

// long expect

    //valor correto 

    @Test

    public void soma (){

        assertEquals(5,calculo.calc(2, 3));

    }

    

}