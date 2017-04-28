/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author GabrielRS
 */
public class Usuario {
    
    private String nome;
    private String cpf;
    private char   sexo;
    private String dataNasc;
    private String endereco;
    private String profissao;

    public Usuario() {
    }

    public Usuario(String nome, String cpf, char sexo, String dataNasc, String endereco, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.profissao = profissao;
    }
    
    
    
    
}
