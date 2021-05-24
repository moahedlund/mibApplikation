/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAgentAlienDates extends javax.swing.JFrame {

    private String alienId;
    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAgentAlienDates(InfDB idb) {
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
        lblChangePw = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtfStartDate = new javax.swing.JTextField();
        txtfEndDate = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtListAliens = new javax.swing.JTextArea();
        lblMessageFormat = new javax.swing.JLabel();
        lblMessageFormat2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblChangePw.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblChangePw.setForeground(new java.awt.Color(255, 255, 255));
        lblChangePw.setText("Registrerade aliens för en period");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        btnSave.setText("Visa aliens");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblStartDate.setForeground(new java.awt.Color(255, 255, 255));
        lblStartDate.setText("Från och med:");

        lblEndDate.setForeground(new java.awt.Color(255, 255, 255));
        lblEndDate.setText("Till och med:");

        txtListAliens.setBackground(new java.awt.Color(79, 79, 79));
        txtListAliens.setColumns(20);
        txtListAliens.setForeground(new java.awt.Color(255, 255, 255));
        txtListAliens.setRows(5);
        jScrollPane1.setViewportView(txtListAliens);

        lblMessageFormat.setForeground(new java.awt.Color(255, 255, 255));
        lblMessageFormat.setText("Datumet ska skrivas in i ");

        lblMessageFormat2.setForeground(new java.awt.Color(255, 255, 255));
        lblMessageFormat2.setText("formatet: YYYY-MM-DD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChangePw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenu)
                            .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(lblEndDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfEndDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMessageFormat)
                            .addComponent(lblMessageFormat2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblChangePw, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMessageFormat)
                        .addGap(2, 2, 2)
                        .addComponent(lblMessageFormat2)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartDate))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtfEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEndDate))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)))
                .addGap(18, 18, 18)
                .addComponent(lblMessage)
                .addGap(22, 22, 22)
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int alienCounter = 0;
        lblMessage.setText("");
        txtListAliens.setText("");

        if (Validation.validationTxt(txtfStartDate, lblMessage, "Ange ett fr.o.m. datum")
                && Validation.validationTxt(txtfEndDate, lblMessage, "Ange ett t.o.m. datum")
                && Validation.validationTxtDate(txtfStartDate, lblMessage)
                && Validation.validationTxtDate(txtfEndDate, lblMessage)) {

            /*Behöver ytterligare en validation som kan ge ett felmeddleande om man skriver in något annat 
            än ett datum i rätt format i text-rutorna och om det inte finns några alien för den perioden*/
            //Konvertera de inkommande string-värdena till datum av klassen LocalDate. 
            LocalDate startDate = LocalDate.parse(txtfStartDate.getText());
            LocalDate endDate = LocalDate.parse(txtfEndDate.getText());

            int checkDate = startDate.compareTo(endDate);
            if (checkDate > 0) {
                lblMessage.setText("Startdatumet är större än slutdatumet");
            } else {
                try {
                    String qAlienInfo = "Select namn, alien_id, registreringsdatum from Alien";
                    ArrayList<HashMap<String, String>> alienInfo = idb.fetchRows(qAlienInfo);

                    txtListAliens.append(" ID\t NAMN \n"
                                         + "-------\t-------\n");

                    for (HashMap<String, String> element : alienInfo) {
                        LocalDate date = LocalDate.parse(element.get("registreringsdatum"));
                        String namn = element.get("namn");
                        String id = element.get("alien_id");

                        int sizeStart = date.compareTo(startDate);
                        int sizeEnd = date.compareTo(endDate);

                        if (sizeStart >= 0 && sizeEnd <= 0) {
                            alienCounter++;
                            txtListAliens.append(" " + id + "\t " + namn + "\n");
                        }

                    }

                    if (alienCounter == 0) {
                        lblMessage.setText("Det finns inga registrerade aliens för de här datumen");
                    }
                } catch (InfException ex) {
                    System.out.println("Databasfel" + ex.getMessage());
                } catch (Exception ex) {
                    System.out.println("Random fel" + ex.getMessage());
                }
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblChangePw;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblMessageFormat;
    private javax.swing.JLabel lblMessageFormat2;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JTextArea txtListAliens;
    private javax.swing.JTextField txtfEndDate;
    private javax.swing.JTextField txtfStartDate;
    // End of variables declaration//GEN-END:variables
}
