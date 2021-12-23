package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testarSomaDeDoisNumerosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, 2);

        Assert.assertEquals(4, resultado);
    }

    @Test
    public void testarSomaDeUmNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(2, -4);

        Assert.assertEquals(2, resultado);
    }

    @Test
    public void testarSomaDeDoisNumerosNegativosCaminhoPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(-2, -4);

        Assert.assertEquals(-6, resultado);
    }

    @Test
    public void testarSubtracaoDeDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(2,2);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void testarSubtracaoDeDoisNumerosNegativos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.subtrair(-4,-2);

        Assert.assertEquals(-6, resultado);
    }

    @Test
    public void testarMultiplicacaoDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(2,5);

        Assert.assertEquals(10,resultado);
    }

    @Test
    public void testarMultiplicacaoDoisNumerosNegativos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(-2,-5);

        Assert.assertEquals(10,resultado);
    }

    @Test
    public void testarDivisaoDoisNumerosPositivos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(12,3);

        Assert.assertEquals(4,resultado);
    }

    @Test
    public void testarDivisaoDoisNumerosNegativos(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(-12,-3);

        Assert.assertEquals(4,resultado);
    }

    @Test
    public void testarDivisaoNumeradorNegativoDenominadorPositivo(){
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(-12,3);

        Assert.assertEquals(-4,resultado);
    }

}
