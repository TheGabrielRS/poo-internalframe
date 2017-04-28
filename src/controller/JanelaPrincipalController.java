/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.JanelaPrincipal;
import DAO.Gerenciador;
import util.HashMD5;

/**
 *
 * @author gabrielsa
 */
public class JanelaPrincipalController{
    
    private JanelaPrincipal janela = new JanelaPrincipal();
    private Gerenciador gerenciador = new Gerenciador();
    private HashMD5 hash = new HashMD5();
    
    
    public void inicia(){
        this.janela.setVisible(true);
        this.setActionListeners();
    }
    
    public void setActionListeners(){
        this.janela.getBtnAutenticar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autentica();
            }
        });
        this.janela.getBtnLimpar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpa();
            }
        });
    }
    
    public void autentica(){
        String usuario = this.janela.getTextField().getText();
        String senha = new String(this.janela.getPasswordField().getPassword());
        if(!usuario.isEmpty() && !senha.isEmpty()){
            gerenciador.connect();
            if(gerenciador.fazLogin(usuario, hash.encriptar(senha))){
                JanelaInternaController janelaInterna = new JanelaInternaController();
                janela.getContentPane().add(janelaInterna.getJanela());
                janelaInterna.inicia();
            }
        }else
        {
            System.out.println("animal");
        }
    }
    
    public void limpa(){
        this.janela.getTextField().setText("");
        this.janela.getPasswordField().setText("");
    }
    
}
