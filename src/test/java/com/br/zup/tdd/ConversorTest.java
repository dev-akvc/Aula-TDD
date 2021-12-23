package com.br.zup.tdd;

import org.junit.Assert;
import org.junit.Test;

public class ConversorTest {
    @Test
    public void testarMetodoParaConverterNumeroRomano() {
        String resultado = new Conversor().conversorParaNumeroRomano(5478);

        Assert.assertEquals("_VCDLXXVIII", resultado);
    }

    @Test
    public void testarMetodoParaConverterNumeroRomanoCaminhoNegativo() {
        Assert.assertThrows(RuntimeException.class, () -> {
            new Conversor().conversorParaNumeroRomano(-5478);
        });
    }
}
