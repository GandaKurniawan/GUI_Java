/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.v_dashboard;
import view.v_login;
import view.v_bantuan;

/**
 *
 * @author Ganda Kurniawan
 */
public class c_bantuan {
      v_bantuan view;
      
      public c_bantuan (v_bantuan view){
          this.view = view;
          this.view.setVisible(true);
          this.view.btnexit(new tbkeluarhelp());
      }

    private class tbkeluarhelp implements ActionListener {

//        public tbkeluarhelp() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         controller.c_login login = new controller.c_login(new v_login());
         view.setVisible(false);
        }
    }
}
