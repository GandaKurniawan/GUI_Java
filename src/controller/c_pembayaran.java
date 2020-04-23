/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_livechat;
import view.v_pembayaran;
import view.v_pilihdurasi;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_pembayaran {
    v_pembayaran view;
    
    public c_pembayaran (v_pembayaran view){
        this.view = view;
        this.view.setVisible(true);
        this.view.back(new back());
        this.view.oke(new oke());
    }

    private class oke implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_livechat livechat = new controller.c_livechat(new v_livechat());
            view.setVisible(false);
        }
    }

    private class back implements ActionListener {

//        public back() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_pilihdurasi pilihdurasi = new controller.c_pilihdurasi(new v_pilihdurasi());
            view.setVisible(false);
        }
    }
}
