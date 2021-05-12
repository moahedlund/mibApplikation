/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import oru.inf.InfDB;

/**
 *
 * @author Blazl
 */
public class WindowAlienStart extends javax.swing.JFrame {

    private InfDB idb;
    private String alienId;
    private String username;

    /**
     * Creates new form MainWindow
     */
    public WindowAlienStart(InfDB idb, String alienId, String username) {
        initComponents();
        this.idb = idb;
        this.alienId = alienId;
        this.username = username;
        lblUsername.setText(username + "!");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        btnChangePw = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        lblMenu = new javax.swing.JLabel();
        btn3 = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setPreferredSize(new java.awt.Dimension(100, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("\"Alien\"");
        background.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 100, -1));

        btnChangePw.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangePw.setText("Byt lösenord");
        btnChangePw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwActionPerformed(evt);
            }
        });
        background.add(btnChangePw, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, -1));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setText("Logga ut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        background.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 190, -1));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn2.setText("jButton1");
        background.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 190, -1));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn1.setText("Se områdeschef");
        background.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 190, -1));

        lblMenu.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblMenu.setForeground(new java.awt.Color(255, 255, 255));
        lblMenu.setText("Meny");
        background.add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 117, 38));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn3.setText("jButton1");
        background.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 190, -1));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Välkommen ");
        background.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        alienId = "";
        setVisible(false);
        new MainWindowLogin(idb).setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnChangePwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwActionPerformed
        // TODO add your handling code here:
        new WindowAlienChangePw(idb, alienId).setVisible(true);
        
        
    }//GEN-LAST:event_btnChangePwActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btnChangePw;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
