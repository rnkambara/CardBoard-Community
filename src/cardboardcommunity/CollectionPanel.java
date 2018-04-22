/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardcommunity;

/**
 *
 * @author rnkambara
 */
public class CollectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollectionPanel
     */
    public CollectionPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanelOrange = new javax.swing.JPanel();
        labelDefaultImage = new javax.swing.JLabel();
        labelBoardgame = new javax.swing.JLabel();
        buttonRid = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        labelRating = new javax.swing.JLabel();
        labelPlayerCount = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        labelEdition = new javax.swing.JLabel();
        labelGenre = new javax.swing.JLabel();
        labelPlaytime = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(13, 1, 54));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanelOrange.setBackground(new java.awt.Color(233, 155, 2));
        leftPanelOrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        leftPanelOrange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        leftPanelOrange.add(labelDefaultImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        labelBoardgame.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelBoardgame.setForeground(new java.awt.Color(253, 251, 251));
        labelBoardgame.setText("Boardgame");
        leftPanelOrange.add(labelBoardgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        buttonRid.setBackground(new java.awt.Color(233, 155, 2));
        buttonRid.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        buttonRid.setForeground(new java.awt.Color(254, 254, 254));
        buttonRid.setLabel("Rid");
        buttonRid.setName(""); // NOI18N
        buttonRid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRidActionPerformed(evt);
            }
        });
        leftPanelOrange.add(buttonRid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/rnkambara/Documents/cardboardCommunity/CardBoard-Community/images/default_boardgame.png")); // NOI18N
        leftPanelOrange.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        add(leftPanelOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 230));

        labelRating.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelRating.setForeground(new java.awt.Color(253, 251, 251));
        labelRating.setText("Rating: ");
        add(labelRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 110, -1));

        labelPlayerCount.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelPlayerCount.setForeground(new java.awt.Color(253, 251, 251));
        labelPlayerCount.setText("Playercount: ");
        add(labelPlayerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, -1));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 320, 20));

        labelEdition.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelEdition.setForeground(new java.awt.Color(253, 251, 251));
        labelEdition.setText("Edition: ");
        add(labelEdition, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 110, -1));

        labelGenre.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelGenre.setForeground(new java.awt.Color(253, 251, 251));
        labelGenre.setText("Genre: ");
        add(labelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 110, -1));

        labelPlaytime.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelPlaytime.setForeground(new java.awt.Color(253, 251, 251));
        labelPlaytime.setText("Playtime: ");
        add(labelPlaytime, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 110, -1));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 320, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 320, 20));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 320, 20));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 320, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonRid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelBoardgame;
    private javax.swing.JLabel labelDefaultImage;
    private javax.swing.JLabel labelEdition;
    private javax.swing.JLabel labelGenre;
    private javax.swing.JLabel labelPlayerCount;
    private javax.swing.JLabel labelPlaytime;
    private javax.swing.JLabel labelRating;
    private javax.swing.JPanel leftPanelOrange;
    // End of variables declaration//GEN-END:variables
}
