/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_dashboard;
import view.v_detailproduk;
import view.v_tips;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_detailproduk {
    v_detailproduk view;
    
        public c_detailproduk(v_detailproduk view){
            this.view = view;
            this.view.setVisible(true);
            this.view.back(new back());
            this.view.lihattips(new lihattips());
            
        }

    private class lihattips implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_tips tips = new controller.c_tips(new v_tips());
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
