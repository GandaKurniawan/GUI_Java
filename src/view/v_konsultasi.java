/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Ganda Kurniawan
 */
public class v_konsultasi extends javax.swing.JFrame {

    /**
     * Creates new form v_konsultasi
     */
    public v_konsultasi() {
        initComponents();
    }
    
    public void masuk (ActionListener action) {
        dashboard.addActionListener(action);
    }

      public void keluar (ActionListener action) {
        btnlogout.addActionListener(action);
    }
    
    public void profile (ActionListener action){
        profile.addActionListener(action);
    }
    
    public void compare (ActionListener action){
        compare.addActionListener(action);
    }
    
    public void chat (ActionListener action) {
        chat.addActionListener(action);
        chat1.addActionListener(action);
    }
    public void pengaduan (ActionListener action) {
        pengaduan.addActionListener(action);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dashboard = new javax.swing.JButton();
        compare = new javax.swing.JButton();
        konsultasi = new javax.swing.JButton();
        profile = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        chat = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        pengaduan = new javax.swing.JButton();
        chat1 = new javax.swing.JButton();
        profile_dokter = new javax.swing.JLabel();
        profile_dokter1 = new javax.swing.JLabel();
        profile_dokter2 = new javax.swing.JLabel();
        profile_dokter3 = new javax.swing.JLabel();
        profile_dokter4 = new javax.swing.JLabel();
        profile_dokter5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(228, 228, 228));

        dashboard.setBackground(new java.awt.Color(228, 228, 228));
        dashboard.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        dashboard.setForeground(new java.awt.Color(0, 51, 51));
        dashboard.setText("Dashboard");
        dashboard.setBorder(null);

        compare.setBackground(new java.awt.Color(228, 228, 228));
        compare.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        compare.setForeground(new java.awt.Color(0, 51, 51));
        compare.setText("Compare");
        compare.setBorder(null);

        konsultasi.setBackground(new java.awt.Color(228, 228, 228));
        konsultasi.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        konsultasi.setForeground(new java.awt.Color(0, 51, 51));
        konsultasi.setText("Konsultasi");
        konsultasi.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(compare, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(konsultasi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(compare, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(konsultasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 160, 210));

        profile.setBackground(new java.awt.Color(0, 51, 51));
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/profile.png"))); // NOI18N
        profile.setBorder(null);
        profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileActionPerformed(evt);
            }
        });
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 30, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 480, 10));

        chat.setBackground(new java.awt.Color(148, 188, 241));
        chat.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        chat.setForeground(new java.awt.Color(255, 255, 255));
        chat.setText("Chat");
        chat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 80, 30));

        btnlogout.setBackground(new java.awt.Color(148, 188, 241));
        btnlogout.setFont(new java.awt.Font("Poppins SemiBold", 1, 10)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 50, 30));

        pengaduan.setBackground(new java.awt.Color(255, 0, 51));
        pengaduan.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        pengaduan.setText("Pengaduan");
        pengaduan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(pengaduan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 90, 30));

        chat1.setBackground(new java.awt.Color(148, 188, 241));
        chat1.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        chat1.setForeground(new java.awt.Color(255, 255, 255));
        chat1.setText("Chat");
        chat1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(chat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 253, 80, 30));

        profile_dokter.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter.setText("Pengalaman : 5 Tahun");
        jPanel1.add(profile_dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        profile_dokter1.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter1.setText("Pengalaman : 2 Tahun");
        jPanel1.add(profile_dokter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        profile_dokter2.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter2.setText("Tempat Praktik : RS Soebandi Jember");
        jPanel1.add(profile_dokter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        profile_dokter3.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter3.setText("Nama : Dr. Ganda Kurniawan");
        jPanel1.add(profile_dokter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        profile_dokter4.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter4.setText("Tempat Praktik : Klinik Ela Farma Jakarta");
        jPanel1.add(profile_dokter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        profile_dokter5.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        profile_dokter5.setText("Nama : Dr. Alida Rosa");
        jPanel1.add(profile_dokter5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/konsultasi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(796, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void profileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_profileActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(v_konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(v_konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(v_konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(v_konsultasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new v_konsultasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton chat;
    private javax.swing.JButton chat1;
    private javax.swing.JButton compare;
    private javax.swing.JButton dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton konsultasi;
    private javax.swing.JButton pengaduan;
    private javax.swing.JButton profile;
    private javax.swing.JLabel profile_dokter;
    private javax.swing.JLabel profile_dokter1;
    private javax.swing.JLabel profile_dokter2;
    private javax.swing.JLabel profile_dokter3;
    private javax.swing.JLabel profile_dokter4;
    private javax.swing.JLabel profile_dokter5;
    // End of variables declaration//GEN-END:variables
}