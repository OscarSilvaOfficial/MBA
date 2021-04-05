package com.operators;

import com.hello.Saudacao;

public class Main {

    public static void main(String[] args) {
        int n1 = 25;
        double n2 = 25.1, re = (n1) + n2;
        Saudacao saudacao = new Saudacao();

        re++;
        System.out.println(re);
        System.out.println(saudacao.s());
    }

}
