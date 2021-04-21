package com.java.conta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteConta {

    public static Conta oscar = new ContaCorrente(123, "Oscar", LocalDate.now(), "456", 1000);

    public static void print(List<Object> num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        for (int i=0; i <= 10; i++){
            oscar.sac(100);
        }

        List<Object> extrato = new ArrayList<>();
        List<Object> test = new ArrayList<>();

        int c = 0;

        try {
            while(oscar.getSaldo() < 0) {
                oscar.depositar(10);
                extrato.add(oscar.getSaldo());
                c++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        print(extrato);


    }

}
