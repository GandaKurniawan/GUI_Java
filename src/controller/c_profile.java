/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_dashboard;
import view.v_profile;
import view.v_ubahprofile;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_profile {
    v_profile view;
    
    public c_profile(v_profile view){
        this.view = view ;
        this.view.setVisible(true);
        this.view.back(new back());
        this.view.ubahprofile(new ubah());
    }

    private class ubah implements ActionListener {

        public ubah() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_ubahprofile ubahprofile = new controller.c_ubahprofile(new v_ubahprofile());
            view.setVisible(false);
        }
    }

    private class back implements ActionListener {

//        public back() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_dashboard dashboard = new controller.c_dashboard(new v_dashboard());
            view.setVisible(false);
        }
    }
}
