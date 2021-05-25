/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibapplikation;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.WordUtils;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class WindowAdminRegAgent extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public WindowAdminRegAgent(InfDB idb) {
        initComponents();
        this.idb = idb;
        
        txtaMessage.setEditable(false);
        setPrivileges();
        setArea();

        //ta bort nedan och lägg till i actionBtn när klar
        getNewAgentId();
        getNewPw();
        getSystemDate();

    }

    private void setPrivileges() {

        ArrayList<String> privilegeList = new ArrayList<String>();
        privilegeList.add("Standard");
        privilegeList.add("Administratör");

        for (String element : privilegeList) {
            cbPrivileges.addItem(element);
        }

    }

    private void setArea() {
        try {
            String query = "SELECT benamning FROM omrade";
            ArrayList<String> result = idb.fetchColumn(query);
            for (String element : result) {
                cbAreas.addItem(element);
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private String getNewAgentId() {
        int lastNr = 0;
        String newId = "";

        try {
            String query = "SELECT agent_id FROM agent";
            ArrayList<String> result = idb.fetchColumn(query);
            int[] intResult = new int[result.size()];
            System.out.println("intResult = " + intResult.length);

            for (int i = 0; i < result.size(); i++) {
                intResult[i] = Integer.parseInt(result.get(i));
            }
            for (int element : intResult) {
                if (element >= lastNr) {
                    lastNr = element;
                }
            }
            int newIdInt = lastNr + 1;
            newId = String.valueOf(newIdInt);

            System.out.println("Nytt agent ID: " + newId);

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

        return newId;

    }

    private String getNewPw() {
        String newPw = RandomStringUtils.randomAlphanumeric(6);

        System.out.println("Lösen: " + newPw);

        return newPw;
    }

    private String getPrivileges() {
        String privilege = "";
        String getListItem = cbPrivileges.getSelectedItem().toString();
        System.out.println("Variabeln getListItem = " + getListItem);

        switch (getListItem) {
            case "Standard":
                privilege = "N";
                break;
            case "Administratör":
                privilege = "J";
                break;

        }

        System.out.println("Agent behörighet: " + privilege);
        return privilege;
    }

    private String getSystemDate() {
        LocalDate localDate = LocalDate.now();
        String currentDate = String.valueOf(localDate);
        System.out.println("Datum: " + currentDate);

        return currentDate;
    }

    private String getAreaId() {
        String areaId = "";
        Object getListItem = cbAreas.getSelectedItem();
        String area = String.valueOf(getListItem);
        String query = "SELECT omrades_id FROM omrade WHERE benamning = " + "'" + area + "'";

        try {
            String getAreaId = idb.fetchSingle(query);
            areaId = getAreaId;
            System.out.println("Områdes ID: " + "(" + areaId + ")");

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        return areaId;
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
        lblTitle = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        cbPrivileges = new javax.swing.JComboBox<>();
        cbAreas = new javax.swing.JComboBox<>();
        txtPhone = new javax.swing.JTextField();
        spMessageBox = new javax.swing.JScrollPane();
        txtaMessage = new javax.swing.JTextArea();
        lblName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblPrivileges = new javax.swing.JLabel();
        lblWorkArea = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jpBackground.setBackground(new java.awt.Color(40, 40, 40));
        jpBackground.setPreferredSize(new java.awt.Dimension(400, 350));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Registrera Agent");

        btnSave.setText("Spara ändringar");
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

        txtName.setColumns(5);

        cbPrivileges.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        cbAreas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        txtPhone.setColumns(6);

        spMessageBox.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spMessageBox.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spMessageBox.setPreferredSize(new java.awt.Dimension(178, 86));

        txtaMessage.setBackground(new java.awt.Color(79, 79, 79));
        txtaMessage.setColumns(10);
        txtaMessage.setForeground(new java.awt.Color(255, 255, 255));
        txtaMessage.setRows(5);
        spMessageBox.setViewportView(txtaMessage);

        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Namn:");

        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Telefon:");

        lblPrivileges.setForeground(new java.awt.Color(255, 255, 255));
        lblPrivileges.setText("Behörighet:");

        lblWorkArea.setForeground(new java.awt.Color(255, 255, 255));
        lblWorkArea.setText("Arbetar på område:");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblPhone)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPrivileges)
                                    .addComponent(cbPrivileges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWorkArea)
                                    .addComponent(cbAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMenu)
                                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                                        .addComponent(btnSave)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 26, Short.MAX_VALUE)))))
                .addGap(47, 47, 47))
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPrivileges)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbPrivileges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWorkArea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(lblMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        getPrivileges();
        getAreaId();
        lblMessage.setForeground(new Color(255, 96, 96, 255));
        String getName = txtName.getText();
        String name = WordUtils.capitalize(getName);

        String phone = txtPhone.getText();
        System.out.println("Agent namn: " + name);
        System.out.println("Agent telefonnr: " + phone);

        if (Validation.validationTxtPhone(txtPhone, lblMessage) //kolla om databasen får ett värde om man endast skriver mellanslag
                && Validation.validationTxt(txtName, lblMessage, "Ange namn")
                && Validation.validationCb(cbPrivileges, lblMessage)
                && Validation.validationCb(cbAreas, lblMessage)) {

            try {
                String agentId = getNewAgentId();
                String newPw = getNewPw();

                //String queryTest ="INSERT INTO alien (alien_id, namn, plats, ansvarig_agent)\n" +
                //                  "VALUES (6, " + "'" + name + "'" + ", " + "'" + getLocationId() + "'" + ", '1')";
                String query = "INSERT INTO agent (agent_id, namn, telefon, anstallningsdatum, administrator, losenord, omrade)\n"
                        + "VALUES (" + agentId + ", "
                        + "'" + name + "'" + ", "
                        + "'" + phone + "'" + ", "
                        + "'" + getSystemDate() + "'" + ", "
                        + "'" + getPrivileges() + "'" + ", "
                        + "'" + newPw + "'" + ", "
                        + "'" + getAreaId() + "'" + ")";

                idb.insert(query);
                //idb.insert(queryBoglodite);
                
                lblMessage.setForeground(Color.green);
                lblMessage.setText("Registrering slutförd!");
                txtaMessage.setText("Registrerad agent\n"
                        + "---------------------------\n"
                        + "ID: " + agentId + "\n"
                        + "\n"
                        + "Namn: " + name + "\n"
                        + "\n"
                        + "Lösenord: " + newPw + "\n"
                        + "\n"
                        + "Telefon: " + phone + "\n"
                        + "\n"
                        + "Behörighet: " + getPrivileges() + "\n"
                        + "\n"
                        + "Arbetar på: " + cbAreas.getSelectedItem());
                
                

            } catch (InfException ex) {
                System.out.println("Databasfel" + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Random fel" + ex.getMessage());
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
    private javax.swing.JComboBox<String> cbAreas;
    private javax.swing.JComboBox<String> cbPrivileges;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPrivileges;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWorkArea;
    private javax.swing.JScrollPane spMessageBox;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextArea txtaMessage;
    // End of variables declaration//GEN-END:variables
}