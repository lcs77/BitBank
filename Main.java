package com.company;

public class Main {

    public static void main(String[] args) {
	Bank conta1 = new Bank();
    conta1.getTitular().setCpf("135.003.634-07");

    conta1.getTitular().setProfissao("bombeiro");
    conta1.setNumero(74548);
    conta1.setAgencia(787);
    conta1.criaConta();


    conta1.deposita(45454);
    //conta1.infoConta();


    }
}
