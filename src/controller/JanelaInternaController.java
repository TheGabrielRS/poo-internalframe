/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import visao.JanelaInterna;

/**
 *
 * @author gabrielsa
 */
public class JanelaInternaController {
    
    private JanelaInterna janela = new JanelaInterna();
    
    public JanelaInterna inicia(){
        this.setActionListeners();
        this.janela.setVisible(true);
        return this.janela;
    }
    
    public void setActionListeners(){
        this.janela.getButtonGravar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gravar();
            }
        });
    }

    public void gravar(){
        System.out.println("gravar");
    }
    
    public void limpar(){
        System.out.println("limpar");
    }
    
    
    
    public JanelaInterna getJanela() {
        setActionListeners();
        return janela;
    }   
}
