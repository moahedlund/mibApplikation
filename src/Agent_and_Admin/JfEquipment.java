/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agent_and_Admin;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import mibapplikation.Validation;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author strom
 */
public class JfEquipment extends javax.swing.JFrame {

    private String agentId;
    private InfDB idb;

    /**
     * Creates new form WindowAlienChangePw
     */
    public JfEquipment(InfDB idb, String agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
        txtaMyEquipment.setEditable(false);
        listMyEquipment();
        setWeapons();
        setComms();
        setTech();
    }

    public void listMyEquipment() {
        try {
            txtaMyEquipment.setText("");
            String query
                    = "SELECT benamning\n"
                    + "FROM utrustning\n"
                    + "JOIN innehar_utrustning USING (utrustnings_id)\n"
                    + "JOIN agent USING (agent_id)\n"
                    + "WHERE agent_id = " + "'" + agentId + "'";

            ArrayList<String> result = idb.fetchColumn(query);

            for (String element : result) {
                txtaMyEquipment.append(" • " + element + "\n");
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

    }

    private void setWeapons() {
        try {
            String query = "SELECT benamning FROM utrustning JOIN vapen USING (utrustnings_id)";
            ArrayList<String> result = idb.fetchColumn(query);
            for (String element : result) {
                cbWeapons.addItem(element);
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        listMyEquipment();
    }

    private void setComms() {
        try {
            String query = "SELECT benamning FROM utrustning JOIN kommunikation USING (utrustnings_id)";
            ArrayList<String> result = idb.fetchColumn(query);
            for (String element : result) {
                cbComms.addItem(element);
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
    }

    private void setTech() {
        try {
            String query = "SELECT benamning FROM utrustning JOIN teknik USING (utrustnings_id)";
            ArrayList<String> result = idb.fetchColumn(query);
            for (String element : result) {
                cbTech.addItem(element);
            }
        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
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
        lblName = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaMyEquipment = new javax.swing.JTextArea();
        cbWeapons = new javax.swing.JComboBox<>();
        cbComms = new javax.swing.JComboBox<>();
        cbTech = new javax.swing.JComboBox<>();
        lblWeapon = new javax.swing.JLabel();
        lblCommunication = new javax.swing.JLabel();
        lblTech = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();
        lblYourEquipment = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Galaxal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Utrustning");

        btnAdd.setText("LÄGG TILL");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnMenu.setText("MENY");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtaMyEquipment.setBackground(new java.awt.Color(79, 79, 79));
        txtaMyEquipment.setColumns(20);
        txtaMyEquipment.setForeground(new java.awt.Color(255, 255, 255));
        txtaMyEquipment.setRows(5);
        jScrollPane1.setViewportView(txtaMyEquipment);

        cbWeapons.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        cbWeapons.setName(""); // NOI18N

        cbComms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        cbTech.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));

        lblWeapon.setForeground(new java.awt.Color(255, 255, 255));
        lblWeapon.setText("Vapen");

        lblCommunication.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunication.setText("Kommunikation");

        lblTech.setForeground(new java.awt.Color(255, 255, 255));
        lblTech.setText("Teknik");

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 50, 50));
        lblMessage.setText(" ");

        lblYourEquipment.setForeground(new java.awt.Color(255, 255, 255));
        lblYourEquipment.setText("Din nuvarande utrustning:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(cbWeapons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbComms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbTech, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTech, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCommunication, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblYourEquipment)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnMenu)))
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(lblYourEquipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWeapon, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(cbWeapons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCommunication)
                        .addGap(3, 3, 3)
                        .addComponent(cbComms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTech)
                        .addGap(2, 2, 2)
                        .addComponent(cbTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnAdd))
                    .addComponent(jScrollPane1))
                .addGap(28, 28, 28)
                .addComponent(lblMessage)
                .addGap(19, 19, 19)
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //LAGGAS TILL FÖR AGENT_ID
        //KONTROLLERA VILKA BOXAR SOM ÄR VALDA
        //REGISTERA DAGEN
        lblMessage.setForeground(new Color(255, 50, 50));
        try {
            LocalDate getDate = LocalDate.now();
            String date = getDate.toString();
            if (!Validation.validationCb(cbWeapons, lblMessage, " ")
                    && !Validation.validationCb(cbComms, lblMessage, " ")
                    && !Validation.validationCb(cbTech, lblMessage, " ")) {
                lblMessage.setText("Du måste välja minst 1 utrustning");
            } else {
                if (!cbWeapons.getSelectedItem().equals("-----")) {

                    String qEquipId = "SELECT utrustnings_id FROM utrustning WHERE benamning = '" + cbWeapons.getSelectedItem() + "'";
                    String utrustningsId = idb.fetchSingle(qEquipId);

                    String qAddEquip
                            = "INSERT INTO innehar_utrustning(agent_id, utrustnings_id, utkvitteringsdatum)\n"
                            + "VALUES (" + agentId + "," + utrustningsId + ",'" + date + "')";
                    idb.insert(qAddEquip);
                }
                if (!cbComms.getSelectedItem().equals("-----")) {

                    String qEquipId = "SELECT utrustnings_id FROM utrustning WHERE benamning = '" + cbComms.getSelectedItem() + "'";
                    String utrustningsId = idb.fetchSingle(qEquipId);

                    String qAddEquip
                            = "INSERT INTO innehar_utrustning(agent_id, utrustnings_id, utkvitteringsdatum)\n"
                            + "VALUES (" + agentId + "," + utrustningsId + ",'" + date + "')";
                    idb.insert(qAddEquip);
                }
                if (!cbTech.getSelectedItem().equals("-----")) {

                    String qEquipId = "SELECT utrustnings_id FROM utrustning WHERE benamning = '" + cbTech.getSelectedItem() + "'";
                    String utrustningsId = idb.fetchSingle(qEquipId);

                    String qAddEquip
                            = "INSERT INTO innehar_utrustning(agent_id, utrustnings_id, utkvitteringsdatum)\n"
                            + "VALUES (" + agentId + "," + utrustningsId + ",'" + date + "')";
                    idb.insert(qAddEquip);
                }
                lblMessage.setForeground(new Color(50, 255, 50));
                lblMessage.setText("Utrusting har registrerats");
            }

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
            lblMessage.setText("Du kan ej låna 2 av samma sort");
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }
        listMyEquipment();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbComms;
    private javax.swing.JComboBox<String> cbTech;
    private javax.swing.JComboBox<String> cbWeapons;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCommunication;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTech;
    private javax.swing.JLabel lblWeapon;
    private javax.swing.JLabel lblYourEquipment;
    private javax.swing.JTextArea txtaMyEquipment;
    // End of variables declaration//GEN-END:variables
}
