/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulasjava.sistema.banco;

/**
 *
 * @author Dell
 */
public class Pessoa {
    private String nome;
    private String apelido;
    private String dataNascimento;
    private String endereco;
    private int nuit;
    private String bi;
    private String genero;

    public Pessoa(String nome, String apelido, String dataNascimento, String endereco, int nuit, String bi, String genero) {
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.nuit = nuit;
        this.bi = bi;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
