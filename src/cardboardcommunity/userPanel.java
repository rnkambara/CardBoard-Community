package cardboardcommunity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rnkambara
 */
public class userPanel extends javax.swing.JPanel {

    /**
     * Creates new form userPanel
     */
    public userPanel() {
        initComponents();
    }
    String username;
    String email;

    public void refresh()
    {
        usernameText.setText(username);
        emailText.setText(email);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        usernameText = new javax.swing.JTextArea();
        buttonRid = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        labelBoardgame = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        emailText = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(101, 95, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(40, 166, 211));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("images/default_profile.jpg")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jScrollPane3.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setViewportBorder(null);
        jScrollPane3.setEnabled(false);
        jScrollPane3.setOpaque(false);

        usernameText.setBackground(new java.awt.Color(40, 166, 211));
        usernameText.setColumns(20);
        usernameText.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        usernameText.setForeground(new java.awt.Color(254, 254, 254));
        usernameText.setLineWrap(true);
        usernameText.setRows(5);
        usernameText.setText("Username");
        usernameText.setWrapStyleWord(true);
        usernameText.setBorder(null);
        jScrollPane3.setViewportView(usernameText);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 50));

        buttonRid.setActionCommand("Edit");
        buttonRid.setBackground(new java.awt.Color(40, 166, 211));
        buttonRid.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        buttonRid.setForeground(new java.awt.Color(254, 254, 254));
        buttonRid.setLabel("Edit");
        buttonRid.setName(""); // NOI18N
        buttonRid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRidActionPerformed(evt);
            }
        });
        jPanel3.add(buttonRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 30));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 230));

        jScrollPane1.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportBorder(null);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setOpaque(false);

        labelBoardgame.setBackground(new java.awt.Color(40, 166, 211));
        labelBoardgame.setColumns(20);
        labelBoardgame.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        labelBoardgame.setForeground(new java.awt.Color(254, 254, 254));
        labelBoardgame.setLineWrap(true);
        labelBoardgame.setRows(5);
        labelBoardgame.setText("email goes here...");
        labelBoardgame.setWrapStyleWord(true);
        labelBoardgame.setBorder(null);
        jScrollPane1.setViewportView(labelBoardgame);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 50));

        jScrollPane2.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setOpaque(false);

        emailText.setBackground(new java.awt.Color(101, 95, 123));
        emailText.setColumns(20);
        emailText.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        emailText.setForeground(new java.awt.Color(254, 254, 254));
        emailText.setLineWrap(true);
        emailText.setRows(5);
        emailText.setText("Email goes here...");
        emailText.setWrapStyleWord(true);
        emailText.setBorder(null);
        jScrollPane2.setViewportView(emailText);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 300, 30));

        jLabel3.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Password : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Waree", 1, 18)); // NOI18N
        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.setEchoChar('.');
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 150, 30));

        jLabel4.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Email : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void buttonRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRidActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_buttonRidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonRid;
    private javax.swing.JTextArea emailText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea labelBoardgame;
    private javax.swing.JTextArea usernameText;
    // End of variables declaration//GEN-END:variables
}
