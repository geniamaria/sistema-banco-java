/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.sistema.banco;

/**
 *
 * @author Dell
 */
public class Cliente extends Pessoa {
    private String id;
    private String dataCadastro;
    private Conta infoConta;

    public Cliente(String dataCadastro, Conta infoConta, String nome, String apelido, String dataNascimento, String endereco, int nuit, String bi, String genero) {
        super(nome, apelido, dataNascimento, endereco, nuit, bi, genero);
        this.dataCadastro = dataCadastro;
        this.infoConta = infoConta;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Conta getInfoConta() {
        return infoConta;
    }

    public void setInfoConta(Conta infoConta) {
        this.infoConta = infoConta;
    }
    
    
}
