/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;


import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAgentInfoAlien extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAgentInfoAlien(InfDB idb) {
        initComponents();
        
        this.idb = idb;
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
        lblTitle = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnShowInfo = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtfAlienInput = new javax.swing.JTextField();
        lblAlienName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaPrintAlienInfo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Se info om Alien");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnShowInfo.setText("VISA INFO");
        btnShowInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowInfoActionPerformed(evt);
            }
        });

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtfAlienInput.setColumns(6);
        txtfAlienInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfAlienInputActionPerformed(evt);
            }
        });

        lblAlienName.setForeground(new java.awt.Color(255, 255, 255));
        lblAlienName.setText("Ange aliens namn eller id:");

        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setRequestFocusEnabled(false);

        txtaPrintAlienInfo.setBackground(new java.awt.Color(79, 79, 79));
        txtaPrintAlienInfo.setColumns(20);
        txtaPrintAlienInfo.setForeground(new java.awt.Color(255, 255, 255));
        txtaPrintAlienInfo.setRows(5);
        txtaPrintAlienInfo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtaPrintAlienInfo.setEnabled(false);
        txtaPrintAlienInfo.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtaPrintAlienInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblAlienName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnShowInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtfAlienInput, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfAlienInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlienName))
                .addGap(10, 10, 10)
                .addComponent(btnShowInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(21, 21, 21))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowInfoActionPerformed
        txtaPrintAlienInfo.setText("");
        lblMessage.setText(" ");
        
      
        if(Validation.validationTxt(txtfAlienInput, lblMessage)){
            try {
                String qAlienId = "SELECT alien_id FROM alien WHERE namn = '" + txtfAlienInput.getText() + "' OR alien_id = '" + txtfAlienInput.getText() + "'";
                String alienId = idb.fetchSingle(qAlienId);
                
                
                if(alienId == null){
                    lblMessage.setText("Alien namet finns inte registrerat");
                }
                else{
                    txtaPrintAlienInfo.append("Alien id:\t" + alienId + "\n");
                    
                    String qAlienInfo = "SELECT namn, telefon, registreringsdatum FROM alien WHERE alien_id = '" + alienId + "'";
                    HashMap<String,String> alienInfo = idb.fetchRow(qAlienInfo);
                    txtaPrintAlienInfo.append("Namn:\t" + alienInfo.get("namn") + "\n");
                    txtaPrintAlienInfo.append("Telefon:\t" + alienInfo.get("telefon") + "\n");
                    txtaPrintAlienInfo.append("Registrerad:\t" + alienInfo.get("registreringsdatum") + "\n");

                    String qAlienPlats = "SELECT benamning FROM plats p JOIN alien a ON p.plats_id = a.plats WHERE alien_id = '" + alienId + "'";
                    String alienPlats = idb.fetchSingle(qAlienPlats);
                    String qAlienOmrade = "SELECT o.benamning FROM omrade o JOIN plats p ON o.omrades_id = p.finns_i WHERE p.benamning = '" + alienPlats + "'";
                    String alienOmrade = idb.fetchSingle(qAlienOmrade);
                    txtaPrintAlienInfo.append("Befinner sig:\t" + alienPlats + " (" + alienOmrade + ")" + "\n");

                    String qAlienKontakt = "SELECT ag.namn FROM agent ag JOIN alien al ON ag.agent_id = al.ansvarig_agent WHERE alien_id = '" + alienId + "'";
                    String alienKontakt = idb.fetchSingle(qAlienKontakt);
                    txtaPrintAlienInfo.append("Kontakt:\t" + alienKontakt + "\n");

                    String ras = Alien.getRace(alienId);
                    txtaPrintAlienInfo.append("Ras:\t" + ras + "\n");
                    
                    String alienEgenskap = "";
                    if(ras.equals("Squid")){
                        String qAlienSquid = "SELECT antal_armar FROM squid WHERE alien_id = '" + alienId + "'";
                        alienEgenskap = idb.fetchSingle(qAlienSquid);
                    }
                    else if (ras.equals("Boglodite")){
                        String qAlienBoglodite = "SELECT antal_boogies FROM boglodite WHERE alien_id = '" + alienId + "'";
                        alienEgenskap = idb.fetchSingle(qAlienBoglodite);
                    }
                    txtaPrintAlienInfo.append("Egenskap:\t" + alienEgenskap + " st armar\n");
                }
            }
            catch (InfException ex){
                System.out.println("Databasfel" + ex.getMessage());
            }
            catch (Exception ex){
                System.out.println("Random fel" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnShowInfoActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtfAlienInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfAlienInputActionPerformed
        // TODO add your handling code here:
        btnShowInfo.doClick();
    }//GEN-LAST:event_txtfAlienInputActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnShowInfo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlienName;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtaPrintAlienInfo;
    private javax.swing.JTextField txtfAlienInput;
    // End of variables declaration//GEN-END:variables
}
