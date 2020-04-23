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
public class c_datapengaduan {
    v_datapengaduan view;
    
        public c_datapengaduan(v_datapengaduan view){
            this.view = view;
            this.view.setVisible(true);
            this.view.keluar(new tbkeluar());
            this.view.profile(new profile());
            this.view.dashboard(new dashadmin());
            this.view.datauser(new datauser());
            this.view.datadokter(new datadokter());
            this.view.pembayaran(new pembayaran());
        }

    private class pembayaran implements ActionListener {


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

    private class datauser implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
         controller.c_datauser datauser = new controller.c_datauser(new v_datauser());
            view.setVisible(false);
        }
    }

    private class dashadmin implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
            controller.c_dashadmin dashadmin = new controller.c_dashadmin(new v_dashadmin());
            view.setVisible(false);
        }
    }

    private class profile implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
            controller.c_profile profile = new controller.c_profile(new v_profile());
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
}
