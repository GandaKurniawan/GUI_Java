/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_profile;
import view.v_ubahprofile;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_ubahprofile {
    v_ubahprofile view;
    
    public c_ubahprofile (v_ubahprofile view){
        this.view = view;
        this.view.setVisible(true);
        this.view.back(new back());
        this.view.simpanprofile(new tbsimpanprofile());
    }

    private class tbsimpanprofile implements ActionListener {

        

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_profile profile = new controller.c_profile(new v_profile());
            view.setVisible(false);
        }
    }

    private class back implements ActionListener {

//        public back() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_profile profile = new controller.c_profile(new v_profile());
            view.setVisible(false);
        }
    }
    
}
