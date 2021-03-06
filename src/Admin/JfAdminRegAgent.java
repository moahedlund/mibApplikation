package Admin;

import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import mibapplikation.Validation;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.text.WordUtils;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * Fönster för att registrera och lägga till en agent i databasen.
 *
 * @author Grupp 8
 */
public class JfAdminRegAgent extends javax.swing.JFrame {

    private InfDB idb;

    public JfAdminRegAgent(InfDB idb) {
        initComponents();
        this.idb = idb;

        //Gör att man endast kan selecta text, men ej skriva i textrutan.
        txtaMessage.setEditable(false);
        setPrivileges();
        setArea();
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

        } catch (InfException ex) {
            System.out.println("Databasfel" + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Random fel" + ex.getMessage());
        }

        return newId;
    }

    private String getNewPw() {
        //Returnerar en slumpmässigt sträng som innehåller bokstäver och siffror.
        String newPw = RandomStringUtils.randomAlphanumeric(6);

        return newPw;
    }

    private String getPrivileges() {
        String privilege = "";
        String getListItem = cbPrivileges.getSelectedItem().toString();

        switch (getListItem) {
            case "Standard":
                privilege = "N";
                break;
            case "Administratör":
                privilege = "J";
                break;

        }

        return privilege;
    }

    private String getSystemDate() {
        //LocalDate hanterar format för datum. Metoden .now returnerar
        //ditt systems nuvarande datum.
        LocalDate localDate = LocalDate.now();
        String currentDate = String.valueOf(localDate);

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
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jpBackground.setBackground(new java.awt.Color(40, 40, 40));
        jpBackground.setPreferredSize(new java.awt.Dimension(400, 350));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Registrera Agent");

        btnSave.setText("REGISTRERA");
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
        lblMessage.setForeground(new java.awt.Color(255, 50, 50));
        lblMessage.setText(" ");

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addComponent(btnMenu)
                                .addGap(0, 318, Short.MAX_VALUE))
                            .addGroup(jpBackgroundLayout.createSequentialGroup()
                                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone)
                                    .addComponent(cbPrivileges, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbAreas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                                        .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(lblPhone)
                                            .addComponent(lblPrivileges)
                                            .addComponent(lblWorkArea)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpBackgroundLayout.createSequentialGroup()
                                        .addGap(0, 20, Short.MAX_VALUE)
                                        .addComponent(spMessageBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(47, 47, 47))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
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
        //Ger texten i lblMessage en ny färg.
        lblMessage.setForeground(new Color(255, 50, 50));
        String getName = txtName.getText();
        //Metod som omvandlar färsta bokstaven för varje ord till versal.
        String name = WordUtils.capitalize(getName);

        String phone = txtPhone.getText();

        if (Validation.validationTxtPhone(txtPhone, lblMessage) //kolla om databasen får ett värde om man endast skriver mellanslag
                && Validation.validationTxt(txtName, lblMessage, "Ange namn")
                && Validation.validationCb(cbPrivileges, lblMessage, "Ange behörighet")
                && Validation.validationCb(cbAreas, lblMessage, "Ange område")) {

            try {
                String agentId = getNewAgentId();
                String newPw = getNewPw();

                String query = "INSERT INTO agent (agent_id, namn, telefon, anstallningsdatum, administrator, losenord, omrade)\n"
                        + "VALUES (" + agentId + ", "
                        + "'" + name + "'" + ", "
                        + "'" + phone + "'" + ", "
                        + "'" + getSystemDate() + "'" + ", "
                        + "'" + getPrivileges() + "'" + ", "
                        + "'" + newPw + "'" + ", "
                        + "'" + getAreaId() + "'" + ")";
                String queryFieldAgent = "INSERT INTO faltagent (agent_id)\n"
                        + "VALUES (" + agentId + ")";

                idb.insert(query);
                idb.insert(queryFieldAgent);

                lblMessage.setForeground(new Color(50, 255, 50));
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
                        + "Behörighet: " + cbPrivileges.getSelectedItem() + "\n"
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
        setVisible(false);
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
