/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_detailproduk;
import view.v_tips;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_tips {
    v_tips view;
    
    public c_tips(v_tips view){
        this.view=view;
        this.view.setVisible(true);
        this.view.btnexit(new exit());
    }

    private class exit implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_detailproduk detailproduk = new controller.c_detailproduk(new v_detailproduk());
            view.setVisible(false);
        }
    }
}
