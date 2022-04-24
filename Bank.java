package com.company;

import java.util.Scanner;

public class Bank {
    Scanner scan = new Scanner(System.in);
    private int numero;
    private int agencia;
    protected Cliente titular = new Cliente();
    protected double saldo;
    Investimento investimento = new Investimento();

    public Bank(){
        criaConta();
        infoConta();
    }



     // MÉTODOS

    void criaConta(){
        System.out.print("BEM VINDO AO BIT BANK!");
        System.out.println("Digite seu nome completo : ");
        titular.setNome();
        System.out.println("Bem vindo " + getTitular().getNome());
        System.out.println();
        System.out.println("Por favor me informe seu cpf : ");
        titular.setCpf("");
        System.out.println("Número de Cpf computado " + getTitular().getCpf());
        System.out.println();
        System.out.println();



        System.out.println("informe sua agência: ");
        setAgencia(scan.nextInt());
        System.out.println(" Informe o número do cartão: ");
        setNumero(scan.nextInt());
        System.out.println();
        System.out.println("tudo certo " + titular.getNome() + " nos informe o valor que irá ser depositado R$: ");
        deposita(scan.nextDouble());
        System.out.println(titular.getNome() + "seu saldo é de R$ "  + this.saldo);



    }

    void infoConta(){
        System.out.println("Nome do cliente: " + titular.getNome());
        System.out.println("Número da agência : "+getAgencia());
        System.out.println("Número do cartão: " + getNumero());
        System.out.println("Número do CPF: "+titular.getCpf());
        System.out.println(" Seu saldo é de R$: "+getSaldo());

    }
    boolean saque(double valor){
        if (this.saldo < valor)
            return false;
        else {
            this.saldo -= valor;
            return true;
        }
    }
    boolean deposita(double valor){
        this.saldo += valor;
        return true;
    }
    boolean transfere(Bank destino ,double valor){
        if (this.saldo >= 0 ){
            destino.deposita(valor);
            saque(valor);
            return true;}
        else
        return false;

    }



    // GETTERS E SETTERS


    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {

        this.agencia = agencia;
    }

    public double getSaldo() {

        return saldo;
    }

    public int getNumero() {

        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {

        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
