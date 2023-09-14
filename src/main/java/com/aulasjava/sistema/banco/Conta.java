/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.sistema.banco;

/**
 *
 * @author Dell
 */
public class Conta {
    private double saldo;
    private int senha;
    private int nib;
    private String dataCriacao;
    private String[] movimentos;
    private Cliente titular;

    public Conta(double saldo, int senha, int nib, String dataCriacao, String[] movimentos) {
        this.saldo = saldo;
        this.senha = senha;
        this.nib = nib;
        this.dataCriacao = dataCriacao;
        this.movimentos = movimentos;
    }
    
    public double verificarSaldo(int numeroConta) {
        //CODIGO
        return this.saldo;
    }
    
    public int verificarNIB(int numeroConta) {
        //CODIGO
        return this.nib;
    }
    
    public Cliente dadosTitularConta(int numeroConta) {
        //CODIGO
        return this.titular;
    }
    
    public double efectuarDeposito(double montante, int numeroConta) {
        //CODIGO
        return this.saldo;
    }
    
    public double efectuarLevantamento(double montante, int numeroConta) {
        //CODIGO
        return this.saldo;
    }
    
    public double efectuarTransferencia(double montante, int numeroContaSaida, int nibEntrada) {
        //CODIGO
        return this.saldo;
    }
    
    public String[] verExtracto(int numeroConta) {
        //CODIGO
        return null;
    }
}
