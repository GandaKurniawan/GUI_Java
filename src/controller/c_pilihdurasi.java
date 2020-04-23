/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_konsultasi;
import view.v_pembayaran;
import view.v_pilihdurasi;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_pilihdurasi {
    v_pilihdurasi view;
    
    public c_pilihdurasi(v_pilihdurasi view){
        this.view = view ;
        this.view.setVisible(true);
        this.view.back(new back());
        this.view.pilih(new pilihdurasi());
    }

    private class pilihdurasi implements ActionListener {

//        public pilihdurasi() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_pembayaran pembayaran = new controller.c_pembayaran(new v_pembayaran());
            view.setVisible(false);
        }
    }

    private class back implements ActionListener {

//        public back() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_konsultasi konsultasi = new controller.c_konsultasi(new v_konsultasi());
            view.setVisible(false);
        }
    }
}
