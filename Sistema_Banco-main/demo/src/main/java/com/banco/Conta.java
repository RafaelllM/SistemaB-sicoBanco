package com.banco;

public class Conta {
    private String banco;
    private int agencia;
    private String usuario;
    private float saldo;


    public Conta(String banco,int agencia,String usuario,float saldo){
        this.banco = banco;
        this.agencia = agencia;
        this.usuario = usuario;
        this.saldo = saldo;
    }


    // Começo dos metodos utilizados:


    public void informação(){
        System.out.println("Olá " + usuario + " do banco " + banco + "agência " + agencia + "\nSeu saldo atual é: " + saldo);
    }


    public void depositar(float deposito){
        System.out.println("\nDEPOSITO REALIZADO:\n");
        float soma = deposito + saldo;
        System.out.println("valor depositado: " + deposito);
        System.out.println("seu saldo atual é: " + soma);
        saldo=soma;
    }
    

    public void transferir(float transferencia, Conta conta){
        System.out.println("\nPIX REALIZADO:\n");
        if(saldo < transferencia){
            System.out.println("voce não tem saldo o suficiente pra tranferir\n");
        }else{
            float sub = saldo - transferencia;
            System.out.println("foi transferido R$" + transferencia + " saldo atual :" + sub);
            conta.saldo = conta.saldo + transferencia;
            System.out.println(conta.usuario + " Recebeu um pix no valor de " + transferencia + " seu saldo atual é:" + conta.saldo + "\n");
            saldo = sub;
        }
    }
    

    public void sacar(float saque){
        System.out.println("\nSAQUE EFETUADO:\n");
        if(saldo < saque){
            System.out.println("voce não tem saldo o suficiente pra sacar");
        }else{
            float subtracao = saldo - saque;
            System.out.println("valor sacado: "+ saque);
            System.out.println("seu saldo atual é: " + subtracao);
            saldo = subtracao;
        }
    }

}