package com.banco;

public class App 
{
    public static void main( String[] args )
    {
        Conta Myconta = new Conta("Inter", 001, "Rafael", 4);
        Conta conta1 = new Conta("NuBank", 123, "Jaime", 1000);

        Myconta.informação();
        Myconta.depositar(70);
        Myconta.transferir(45,conta1);
        Myconta.sacar(50);
    }
}
