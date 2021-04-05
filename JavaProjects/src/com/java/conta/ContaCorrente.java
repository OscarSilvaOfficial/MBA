package com.java.conta;

import java.time.LocalDate;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String nome, LocalDate nascimento, String documento, double saldo) {
        super(numero, nome, nascimento, documento,saldo);
    }

    @Override
    public void sac(int valor) {
        valor += valor * 0.1;
        super.sac(valor);
    }

}
