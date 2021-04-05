package com.java.conta;

import java.time.LocalDate;

public class TesteConta {

    public static void main(String[] args) {

        Conta oscar = new ContaCorrente(123, "Oscar", LocalDate.now(), "456", 1000);
//        Conta dinora = new ContaCorrente(789, "Dinorá", LocalDate.now(), "321", 500);

        oscar.sac(100);
        System.out.println(oscar.getSaldo());
//        System.out.println(dinora.getSaldo());
//
//        oscar.transferir(501, dinora);
//
//        System.out.println(oscar.getSaldo());
//        System.out.println(dinora.getSaldo());
//
//        Conta.test();
    }

}
