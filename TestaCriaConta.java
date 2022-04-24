package com.company;

import java.util.Scanner;

public class TestaCriaConta {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Bank conta1 = new Bank();
        Bank conta2 = new Bank();
        conta1.transfere(conta2,20);
        System.out.println(conta1.getSaldo());


    }
}
