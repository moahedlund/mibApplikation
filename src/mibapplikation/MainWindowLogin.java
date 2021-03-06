package mibapplikation;

import Alien.JfAlienStart;
import Agent.JfAgentStart;
import Admin.JfAdminStart;
import org.apache.commons.text.WordUtils;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 * Login fönster som validerar en inloggning och öppnar rätt fönster för
 * användaren.
 *
 * @author Grupp 8
 */
public class MainWindowLogin extends javax.swing.JFrame {

    private InfDB idb;

    public MainWindowLogin(InfDB idb) {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtfUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        pwPassword = new javax.swing.JPasswordField();
        lblMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Galaxal");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Icons/astronomy.png")).getImage());
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(79, 79, 79));

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));

        txtfUsername.setColumns(4);

        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Användarnamn");

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Lösenord");

        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        pwPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwPasswordActionPerformed(evt);
            }
        });

        lblMessage.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblMessage.setForeground(new java.awt.Color(255, 96, 96));
        lblMessage.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPassword)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfUsername)
                    .addComponent(pwPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnLogin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lblMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(pwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessage)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setText("G A L A X A L");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (Validation.validationTxt(txtfUsername, lblMessage, "Ange användarnamn")
                && Validation.validationTxt(pwPassword, lblMessage, "Ange lösenord")) {
            try {
                String username = txtfUsername.getText();
                char[] pwArray = pwPassword.getPassword();
                String password = new String(pwArray);

                String queryAgent = "SELECT agent_id FROM agent WHERE namn = " + "'" + username + "'" + "AND losenord = " + "'" + password + "'";
                String resultAgent = idb.fetchSingle(queryAgent);
                String queryAgentPw = "SELECT losenord FROM agent WHERE agent_id = '" + resultAgent + "'";
                String resultAgentPw = idb.fetchSingle(queryAgentPw);

                String queryAdmin = "SELECT administrator FROM agent WHERE agent_id = " + "'" + resultAgent + "'";
                String resultAdmin = idb.fetchSingle(queryAdmin);

                String queryAlien = "SELECT alien_id FROM alien WHERE namn = " + "'" + username + "'" + "AND losenord = " + "'" + password + "'";
                String resultAlien = idb.fetchSingle(queryAlien);
                String queryAlienPw = "SELECT losenord FROM alien WHERE alien_id = '" + resultAlien + "'";
                String resultAlienPw = idb.fetchSingle(queryAlienPw);

                if (password.equals(resultAgentPw) || password.equals(resultAlienPw)) {
                    if (resultAgent != null) {
                        if (resultAdmin.equals("J")) {
                            setVisible(false);
                            //Gör om första bokstaven till versal.
                            username = WordUtils.capitalize(username);
                            new JfAdminStart(idb, resultAgent, username).setVisible(true);
                        } else {
                            setVisible(false);
                            username = WordUtils.capitalize(username);
                            new JfAgentStart(idb, resultAgent, username).setVisible(true);
                        }
                    } else if (resultAlien != null) {
                        setVisible(false);

                        username = WordUtils.capitalize(username);
                        new JfAlienStart(idb, resultAlien, username).setVisible(true);
                    }
                } else {
                    lblMessage.setText("Fel användarnamn eller lösenord");
                    pwPassword.setText("");
                    pwPassword.requestFocus();
                }

                password = "";
                pwArray = null;

            } catch (InfException ex) {
                System.out.println("Databasfel" + ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Random fel" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    /**
     * Metod för att kunna trycka på enter i lösenordsfältet.
     *
     * Standard actionTrigger för JPasswordfield är att trycka på enter. När
     * pwPassword är i fokus och enter tangenten trycks ner kallas metoden
     * doClick(). doClick() agerar som ett musklick på det objekt den kallas på.
     */
    private void pwPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwPasswordActionPerformed

        btnLogin.doClick();
    }//GEN-LAST:event_pwPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField pwPassword;
    private javax.swing.JTextField txtfUsername;
    // End of variables declaration//GEN-END:variables

}
