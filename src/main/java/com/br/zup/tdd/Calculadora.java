package com.br.zup.tdd;

public class Calculadora {

    public int somar(int x, int y){
        int resultado = x + y;

        if(resultado < 0 && (x < 0 && y < 0)){
           return resultado;
        }else if (resultado < 0){
            return resultado * -1;
        }

        return resultado;
    }

    public int subtrair(int x, int y){
        int resultado = 0;
        if (y>=0){
            resultado = x - y;
        }else if (y<0){
            resultado = x + y;
        }

        return resultado;
    }

    public int multiplicar(int x, int y){
        int resultado = x * y;
        return resultado;
    }

    public int dividir(int x, int y){
        int resultado = x / y;
        return resultado;
    }

}
