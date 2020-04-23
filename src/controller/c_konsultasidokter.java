/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_dashdokter;
import view.v_konsultasidokter;
import view.v_login;
import view.v_profile;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_konsultasidokter {
    v_konsultasidokter view;
    
        public c_konsultasidokter(v_konsultasidokter view){
            this.view = view;
            this.view.setVisible(true);
            this.view.keluar(new tbkeluar());
            this.view.profile(new profile());
            this.view.dashboard(new dashdokter());
        }

    private class dashdokter implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
            controller.c_dashdokter dashdokter = new controller.c_dashdokter(new v_dashdokter());
          view.setVisible(false);
        }
    }

    private class tbkeluar implements ActionListener {

      
        @Override
        public void actionPerformed(ActionEvent e) {
             //To change body of generated methods, choose Tools | Templates.
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
