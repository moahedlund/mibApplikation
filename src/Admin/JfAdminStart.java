/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Admin.JfAdminManageAgent;
import Admin.JfAdminEquipmentStock;
import mibapplikation.MainWindowLogin;
import Agent_and_Admin.JfAreaChief;
import Agent_and_Admin.JfChangePw;
import Agent_and_Admin.JfEquipment;
import Agent_and_Admin.JfListAliens;
import Agent_and_Admin.JfRegAlien;
import java.awt.Window;
import oru.inf.InfDB;

/**
 *
 * @author Blazl
 */
public class JfAdminStart extends javax.swing.JFrame {

    private InfDB idb;
    private String agentId;
    private String username;

    /**
     * Creates new form JfStart for admin
     */
    public JfAdminStart(InfDB idb, String agentId, String username) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        this.username = username;
        lblWelcome.setText("Välkommen admin " + username + "!");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        btnOwnEquipment = new javax.swing.JButton();
        btnFindAreaChief = new javax.swing.JButton();
        btnRegAlien = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnChangePw = new javax.swing.JButton();
        btnChangeAlien = new javax.swing.JButton();
        btnListAlien = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        btnEquipmentStore = new javax.swing.JButton();
        btnChangeAgent = new javax.swing.JButton();
        btnRegAgent = new javax.swing.JButton();
        btnChangeAuthority = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galaxal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        jpBackground.setBackground(new java.awt.Color(40, 40, 40));

        btnOwnEquipment.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnOwnEquipment.setText("Egen utrustning");
        btnOwnEquipment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOwnEquipmentActionPerformed(evt);
            }
        });

        btnFindAreaChief.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnFindAreaChief.setText("Sök områdeschef");
        btnFindAreaChief.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindAreaChiefActionPerformed(evt);
            }
        });

        btnRegAlien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegAlien.setText("Registrera alien");
        btnRegAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAlienActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setText("Logga ut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnChangePw.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangePw.setText("Byt lösenord");
        btnChangePw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwActionPerformed(evt);
            }
        });

        btnChangeAlien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeAlien.setText("Korrigera alien");
        btnChangeAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAlienActionPerformed(evt);
            }
        });

        btnListAlien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnListAlien.setText("Listor för aliens");
        btnListAlien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListAlienActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Välkommen Admin");

        btnEquipmentStore.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnEquipmentStore.setText("Hantera utrustningslager");
        btnEquipmentStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipmentStoreActionPerformed(evt);
            }
        });

        btnChangeAgent.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeAgent.setText("Korrigera agent");
        btnChangeAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAgentActionPerformed(evt);
            }
        });

        btnRegAgent.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnRegAgent.setText("Registera agent");
        btnRegAgent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAgentActionPerformed(evt);
            }
        });

        btnChangeAuthority.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangeAuthority.setText("Hantera befogenheter");
        btnChangeAuthority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAuthorityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnChangePw, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnListAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChangeAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegAlien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFindAreaChief, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEquipmentStore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeAgent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnChangeAuthority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOwnEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegAlien)
                    .addComponent(btnRegAgent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangeAgent)
                    .addComponent(btnChangeAlien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListAlien)
                    .addComponent(btnChangeAuthority))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindAreaChief)
                    .addComponent(btnOwnEquipment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEquipmentStore)
                .addGap(59, 59, 59)
                .addComponent(btnChangePw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogout)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwActionPerformed
        new JfChangePw(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnChangePwActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        System.gc();
        for (Window element : Window.getWindows()){
            element.dispose();
        }
        
        new MainWindowLogin(idb).setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOwnEquipmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOwnEquipmentActionPerformed
        new JfEquipment(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnOwnEquipmentActionPerformed

    private void btnEquipmentStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipmentStoreActionPerformed
        new JfAdminEquipmentStock(idb).setVisible(true);
    }//GEN-LAST:event_btnEquipmentStoreActionPerformed

    private void btnRegAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAlienActionPerformed
        new JfRegAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnRegAlienActionPerformed

    private void btnChangeAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAgentActionPerformed
        new JfAdminManageAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnChangeAgentActionPerformed

    private void btnRegAgentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAgentActionPerformed
        new JfAdminRegAgent(idb).setVisible(true);
    }//GEN-LAST:event_btnRegAgentActionPerformed

    private void btnChangeAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAlienActionPerformed
        new JfAdminManageAlien(idb).setVisible(true);
    }//GEN-LAST:event_btnChangeAlienActionPerformed

    private void btnListAlienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListAlienActionPerformed
        new JfListAliens(idb).setVisible(true);
    }//GEN-LAST:event_btnListAlienActionPerformed

    private void btnChangeAuthorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAuthorityActionPerformed
        new JfAdminManageAuthority(idb).setVisible(true);
    }//GEN-LAST:event_btnChangeAuthorityActionPerformed

    private void btnFindAreaChiefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindAreaChiefActionPerformed
        new JfAreaChief(idb).setVisible(true);
    }//GEN-LAST:event_btnFindAreaChiefActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeAgent;
    private javax.swing.JButton btnChangeAlien;
    private javax.swing.JButton btnChangeAuthority;
    private javax.swing.JButton btnChangePw;
    private javax.swing.JButton btnEquipmentStore;
    private javax.swing.JButton btnFindAreaChief;
    private javax.swing.JButton btnListAlien;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOwnEquipment;
    private javax.swing.JButton btnRegAgent;
    private javax.swing.JButton btnRegAlien;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}
