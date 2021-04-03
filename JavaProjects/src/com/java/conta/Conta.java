package com.java.conta;

import java.time.LocalDate;

public class Conta {

    protected int numero;
    protected String nome;
    protected LocalDate nascimento;
    protected String documento;
    protected double saldo;

    public Conta() {
    }

    public Conta(int numero, String nome, LocalDate nascimento, String documento, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.nascimento = nascimento;
        this.documento = documento;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void test() {
        System.out.println("ok");
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
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
}
