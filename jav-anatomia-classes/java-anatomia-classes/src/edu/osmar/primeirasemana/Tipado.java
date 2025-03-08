package edu.osmar.primeirasemana;

public class Tipado {
    public static void main(String [] args) {
        double salarioInicial = 2500;

        short numeroCurto = 1;
        int numeroInteiro = numeroCurto;
        short numeroCurto2 = (short) numeroInteiro;

        // Constantes podem ser declarados com o prefixo "final" e deixar tudo em caixa alta

        final double VALOR_PI = 3.14;
        System.out.println(VALOR_PI);
    }
}
