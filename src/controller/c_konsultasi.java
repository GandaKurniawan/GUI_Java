/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_compare;
import view.v_dashboard;
import view.v_konsultasi;
import view.v_login;
import view.v_pengaduan;
import view.v_pilihdurasi;
import view.v_profile;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_konsultasi {
   v_konsultasi view;
   
   public c_konsultasi(v_konsultasi view){
       this.view = view;
       this.view.setVisible(true);
       this.view.masuk(new tbmasuk());
       this.view.keluar(new tbkeluar());
        this.view.profile(new profile());
        this.view.compare(new compare());
        this.view.chat(new chat());
        this.view.pengaduan(new pengaduan());
   }

    private class pengaduan implements ActionListener {

//        public pengaduan() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           controller.c_pengaduan pengaduan = new controller.c_pengaduan(new v_pengaduan());
           view.setVisible(false);
        }
    }

    private class chat implements ActionListener {

//        public chat() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_pilihdurasi pilihdurasi = new controller.c_pilihdurasi(new v_pilihdurasi());
            view.setVisible(false);
        }
    }

    private class tbmasuk implements ActionListener {

//        public tbmasuk() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_dashboard dashboard = new controller.c_dashboard(new v_dashboard());
            view.setVisible(false);
        }
    }

    private class tbkeluar implements ActionListener {

//        public tbkeluar() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
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
}
