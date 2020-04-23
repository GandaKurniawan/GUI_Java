/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.m_user;
import view.v_bantuan;
import view.v_login;
import view.v_dashboard;
import view.v_daftar;

/**
 *
 * @author Ganda Kurniawan
 */

public class c_login {
    v_login view;
//    private Connection Con;
//    private final String sql= "select Id from user where Username=? and Password =?";
//    
//    public void login(m_user m) throws SQLException{
//        try {
//            PreparedStatement st =  Con.prepareStatement(sql);
//            st.setString(1, m.getUsername());
//            st.setString(2, m.getPassword());
//            st.setString(3, m.getTelephone());
//            ResultSet rs = st.executeQuery();
//            
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"Eror : No connection ", "Erorr", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//    public c_login(){
//    }
    public c_login(v_login view) {
        
        
        this.view = view;
        this.view.setVisible(true);
        this.view.masuk(new tbmasuk());
        this.view.daftar(new tbdaftar());
        this.view.help(new tbhelp());
        
        
    }

 
    private class tbhelp implements ActionListener {

//        public tbhelp() {
//        }

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          controller.c_bantuan bantuan = new controller.c_bantuan(new v_bantuan());
          view.setVisible(false); 
        }
    }

    private class tbdaftar implements ActionListener {

       

        @Override
        public void actionPerformed(ActionEvent e) {
//            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            controller.c_daftar daftar = new controller.c_daftar(new v_daftar());
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
}
