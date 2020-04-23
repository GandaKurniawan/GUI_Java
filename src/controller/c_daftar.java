/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_daftar;
import view.v_login;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_daftar {
    v_daftar view;
    
    public c_daftar(v_daftar view){
        this.view = view;
        this.view.setVisible(true);
        this.view.daftar(new tbdaftar());
        this.view.back(new tbback());
        
    }

    private class tbback implements ActionListener {

//        public tbback() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
            view.setVisible(false);
        }
    }

    private class tbdaftar implements ActionListener {

//        public tbdaftar() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_login login = new controller.c_login(new v_login());
            view.setVisible(false);
            
        }
    }
    
}
