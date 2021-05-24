/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;


import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAdminDeleteAgent extends javax.swing.JFrame {

    private String alienId;
    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAdminDeleteAgent(InfDB idb) {
        initComponents();
        this.idb= idb;
        jPanel2.setVisible(false);

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
        btnDelete = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lblAgent = new javax.swing.JLabel();
        txtfAgentInput = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaPrint = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaMessageTitle = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Ta bort agent");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnDelete.setText("TA BORT");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblAgent.setForeground(new java.awt.Color(255, 255, 255));
        lblAgent.setText("Ange agentens namn eller id:");

        txtfAgentInput.setColumns(6);

        jPanel2.setBackground(new java.awt.Color(79, 79, 79));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        txtaPrint.setBackground(new java.awt.Color(40, 40, 40));
        txtaPrint.setColumns(20);
        txtaPrint.setForeground(new java.awt.Color(255, 255, 255));
        txtaPrint.setRows(5);
        txtaPrint.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtaPrint);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtaMessageTitle.setBackground(new java.awt.Color(40, 40, 40));
        txtaMessageTitle.setColumns(20);
        txtaMessageTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtaMessageTitle.setRows(5);
        txtaMessageTitle.setText("Följande aliens behöver tilldelas\nny kontaktperson innan \nagenten kan tas bort");
        txtaMessageTitle.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtaMessageTitle);

        jButton1.setText("Ändra info om aliens");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete)
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfAgentInput, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(277, 277, 277))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAgent)
                        .addGap(12, 12, 12)
                        .addComponent(txtfAgentInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(lblMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMenu)
                        .addGap(21, 21, 21))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private String getAgentId() {
        String agentId = "";
        try {
            String qAgentId = "SELECT agent_id FROM agent WHERE namn = '" + txtfAgentInput.getText() + "' OR agent_id = '" + txtfAgentInput.getText() + "'";
            String resultAgentId = idb.fetchSingle(qAgentId);
            System.out.println(resultAgentId);
            if(resultAgentId != null){
                agentId = resultAgentId;
            }
            
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        System.out.println(agentId);
        return agentId;
    }

    private int checkInput() {
        int loops = 0;
        try {
            String qAgentId = "SELECT agent_id FROM agent WHERE namn = '" + txtfAgentInput.getText() + "' OR agent_id = '" + txtfAgentInput.getText() + "'";
            ArrayList<String> agentIdList = idb.fetchColumn(qAgentId);
        

            for (String element : agentIdList) {
                loops++;
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        return loops;

    }
  
    private void deleteAgent() {
        // Ta bort från agentlistan
        // Ta bort från fältagent, områdeschef, kontorschef
        // Ta bort från innahar_fordon
        // Ta bort från innehar_utrustning
        // Ändra ansvarig agent för alien 
        
        
        
        String agentId = getAgentId();
        
        
        try {
            jPanel2.setVisible(true);
            String qAlien = "SELECT alien_id, namn FROM alien WHERE ansvarig_agent = '" + agentId + "'";
            ArrayList<HashMap<String,String>> result = idb.fetchRows(qAlien);
            if(result.size() > 0){
            
                for(HashMap<String,String> element : result){
                txtaPrint.append(" -" + element.get("alien_id") + " " + element.get("namn") + "\n");
            }
            }
//            String qSquid = "DELETE FROM squid WHERE alien_id = '" + alienId + "'";
//            idb.delete(qSquid);

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }


    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        lblMessage.setText(" ");
        lblMessage.setForeground(Color.RED);

        if(Validation.validationTxt(txtfAgentInput, lblMessage, "Ange agentnamn eller id")){
            if (checkInput() > 1) {
                lblMessage.setText("Det finns mer än en agent med detta namn, vänligen ange id");

            } else if (getAgentId().equals("")) {
                lblMessage.setText("Agent namnet eller id:t finns inte registrerat");

            } else {
                deleteAgent();

                lblMessage.setForeground(Color.GREEN);
                lblMessage.setText("Agenten har tagits bort!");

            }
        }
 
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAgent;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtaMessageTitle;
    private javax.swing.JTextArea txtaPrint;
    private javax.swing.JTextField txtfAgentInput;
    // End of variables declaration//GEN-END:variables
}
