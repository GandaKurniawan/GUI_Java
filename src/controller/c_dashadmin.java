/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_dashadmin;
import view.v_datadokter;
import view.v_datapembayaran;
import view.v_datapengaduan;
import view.v_datauser;
import view.v_login;
import view.v_profile;


/**
 *
 * @author Ganda Kurniawan
 */
public class c_dashadmin {
    v_dashadmin view;
    
    public c_dashadmin(v_dashadmin view) {
        this.view = view;
        this.view.setVisible(true);
        this.view.keluar(new tbkeluar());
        this.view.profile(new profile());
        this.view.datauser(new datauser() );
        this.view.datadokter(new datadokter());
        this.view.pembayaran(new pembayaranvoucher());
        this.view.pengaduan(new pengaduan());
    }

    private class pengaduan implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             controller.c_datapengaduan datapengaduan = new controller.c_datapengaduan(new v_datapengaduan());
          view.setVisible(false);
        }
    }

    private class pembayaranvoucher implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             controller.c_datapembayaran datapembayaran = new controller.c_datapembayaran(new v_datapembayaran());
          view.setVisible(false);
        }
    }

    private class datadokter implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             controller.c_datadokter datadokter = new controller.c_datadokter(new v_datadokter());
          view.setVisible(false);
        }
    }

    private  class datauser implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_datauser datauser = new controller.c_datauser(new v_datauser());
            view.setVisible(false);
        }
    }

    private class tbkeluar implements ActionListener {

        
        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
            view.setVisible(false);
        }
    }

    private class profile implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_profile profile = new controller.c_profile(new v_profile());
            view.setVisible(false);
        }
    }
}
