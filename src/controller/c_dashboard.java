/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_compare;
import view.v_login;
import view.v_dashboard;
import view.v_detailproduk;
import view.v_profile;
import view.v_konsultasi;
/**
 *
 * @author Ganda Kurniawan
 */
public class c_dashboard {
    v_dashboard view;
    
     public c_dashboard(v_dashboard view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.keluar(new tbkeluar());
        this.view.profile(new profile());
        this.view.compare(new compare());
        this.view.konsultasi(new konsultasi());
        this.view.read(new read());
        
       
    }

    private class read implements ActionListener {

//        public read() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_detailproduk detailproduk = new controller.c_detailproduk(new v_detailproduk());
            view.setVisible(false);
        }
    }

    private class konsultasi implements ActionListener {

//        public konsultasi() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_konsultasi konsultasi = new controller.c_konsultasi(new v_konsultasi());
            view.setVisible(false);
        }
    }

    private class compare implements ActionListener {

//        public compare() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_compare compare = new controller.c_compare(new v_compare());
            view.setVisible(false);
        }
    }

    private class profile implements ActionListener {

//        public profile() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          controller.c_profile profile = new controller.c_profile(new v_profile());
          view.setVisible(false);
        }
    }

    private  class tbkeluar implements ActionListener {

//        public tbkeluar() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
            view.setVisible(false);
        }
    }
}
