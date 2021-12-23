package com.br.zup.tdd;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

public class Conversor {

    private static final int[] DECIMAIS =
            {9000, 8000, 7000, 6000,5000, 4000, 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMANOS =
            {"_IX", "_VIII","_VII","_VI", "_V","_IV","M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
                    "IX", "V", "IV", "I"};

    public  String conversorParaNumeroRomano(int decimal) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < DECIMAIS.length; i++) {
            int parteInteira = decimal / DECIMAIS[i];
            decimal -= DECIMAIS[i] * parteInteira;
            resultado.append(join("", nCopies(parteInteira, ROMANOS[i])));
        }
        return resultado.toString();
    }
}
