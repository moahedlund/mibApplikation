/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alien;

import java.awt.Window;
import java.util.HashMap;
import mibapplikation.Database;
import mibapplikation.MainWindowLogin;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Blazl
 */
public class JfAlienStart extends javax.swing.JFrame {

    private InfDB idb;
    private String alienId;
    private String username;

    /**
     * Creates new form MainWindow
     */
    public JfAlienStart(InfDB idb, String alienId, String username) {
        initComponents();
        this.idb = idb;
        this.alienId = alienId;
        this.username = username;
        lblWelcome.setText("Välkommen " + username + "!");
        getAreaChief();
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
        btnChangePw = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        lblAgentName = new javax.swing.JLabel();
        lblAgentPhone = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galaxal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(40, 40, 40));
        background.setPreferredSize(new java.awt.Dimension(100, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnChangePw.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnChangePw.setText("Byt lösenord");
        btnChangePw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePwActionPerformed(evt);
            }
        });
        background.add(btnChangePw, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 190, 30));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout.setText("Logga ut");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        background.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 190, -1));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Välkommen ");
        background.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 350, -1));

        lblAgentName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAgentName.setForeground(new java.awt.Color(255, 255, 255));
        lblAgentName.setText("Områdeschef:");
        background.add(lblAgentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        lblAgentPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAgentPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblAgentPhone.setText("Telefon:");
        background.add(lblAgentPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        lblArea.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblArea.setForeground(new java.awt.Color(255, 255, 255));
        lblArea.setText("Du tillhör området:");
        background.add(lblArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        
        System.gc();
        for (Window element : Window.getWindows()){
            element.dispose();
        }
        
        new MainWindowLogin(idb).setVisible(true);
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnChangePwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePwActionPerformed
        // TODO add your handling code here:
        new JfAlienChangePw(idb, alienId).setVisible(true);
    }//GEN-LAST:event_btnChangePwActionPerformed
    private void getAreaChief() {
        try {
            String query
                    = "SELECT ag.Namn, ag.Telefon, o.Benamning\n"
                    + "FROM alien al\n"
                    + "JOIN plats p ON al.plats = p.plats_id\n"
                    + "JOIN omrade o ON p.finns_i = o.omrades_id\n"
                    + "JOIN omradeschef oc ON o.Omrades_ID = oc.Omrade\n"
                    + "JOIN agent ag ON oc.Agent_ID = ag.Agent_ID\n"
                    + "WHERE Alien_ID = " + "'" + alienId + "'";
            HashMap<String, String> result = idb.fetchRow(query);
            String agentName = result.get("Namn");
            String agentPhone = result.get("Telefon");
            String areaName = result.get("Benamning");

            lblAgentName.setText("Områdeschef: " + agentName);
            lblAgentPhone.setText("Telefon: " + agentPhone);
            lblArea.setText("Du tillhör området: " + areaName);
            
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }
    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnChangePw;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblAgentPhone;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblWelcome;
    // End of variables declaration//GEN-END:variables
}