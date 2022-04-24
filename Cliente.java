package com.company;

import java.util.Scanner;

public class Cliente {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    String nome = scanner.nextLine();
    String cpf;
    String profissao;



    //GETTERS E SETTERS


    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = scanner2.nextLine();
    }

    public String getNome() {


        return nome;
    }

    public void setNome() {

        this.nome = scanner1.nextLine();
    }

    public String getProfissao() {


        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = scanner1.nextLine();
    }
}
