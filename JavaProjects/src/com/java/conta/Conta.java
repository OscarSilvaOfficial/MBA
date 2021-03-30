package com.java.conta;

import java.time.LocalDate;

public class Conta {

    private int numero;
    private String nome;
    private LocalDate nascimento;
    private String documento;
    private double saldo;

    public Conta() {
    }

    public Conta(int numero, String nome, LocalDate nascimento, String documento, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.nascimento = nascimento;
        this.documento = documento;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getDocumento() {
        return documento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void sac(int valor) {
        this.saldo -= valor;
    }

    public void transferir(int valor, Conta contaDestino) {
        this.sac(valor);
        contaDestino.saldo += valor;
    }
}
