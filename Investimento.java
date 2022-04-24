package com.company;

import java.util.Scanner;

public class Investimento {
    Scanner scan = new Scanner(System.in);

    private static double taxaJuros = 0.9 ;
    private int mesesQuantidade;
    private double montante;
    private Bank banco;

    void selic(double quantidade){
        System.out.println("Digite a quantidade de anos : ");
        int a1 = scan.nextInt();
        this.mesesQuantidade = a1 / 12;

            this.montante = quantidade * Math.pow(1 + taxaJuros, a1);
            System.out.println("Você pode transformar " + quantidade + " em "+ montante +
                    " investindo durante " + a1 * 12 + " meses usando o tesouro direto!" );



    }




}
