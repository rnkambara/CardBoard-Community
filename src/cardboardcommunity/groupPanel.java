/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardcommunity;
import java.awt.Component;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author rnkambara
 */
public class groupPanel extends javax.swing.JPanel{
    int id;
    String name;
    String location;
    List<String> members;
    
   
    public void refresh() throws SQLException{
        labelGroupName.setText(name);
        locationTextArea.setText(location);
        
        for(String member : members)
        {
            membersList.add(member);
        }
    }
    
    public static Collection<Component> readPanels(Connection con, String whereClause) throws SQLException{
        Statement s1 = con.createStatement();
        Statement s2 = con.createStatement();
        s1.executeQuery("SELECT G.GROUP_ID, NAME, DEFAULT_LOCATION  " +
                        "FROM GAME_GROUP G, MEMBER_OF M " +
                        "WHERE " + whereClause + " AND G.GROUP_ID = M.GROUP_ID");
        
        s2.executeQuery("SELECT MEMBER_EMAIL, GROUP_ID " +
                        "FROM MEMBER_OF NATURAL JOIN (SELECT GROUP_ID " +
                                                     "FROM MEMBER_OF WHERE " + whereClause +" )");
       
        HashMap<Integer, Component> map = new HashMap<>();
        ResultSet groupRes = s1.getResultSet();
        while (groupRes.next()){
            Integer id = groupRes.getInt("GROUP_ID");
            groupPanel p = new groupPanel();
            p.id = id;
            map.put(id, p);
            p.name = groupRes.getString("NAME");
            p.location = groupRes.getString("DEFAULT_LOCATION");
            p.members = new ArrayList<String>();
        }
        ResultSet memberRes = s2.getResultSet();
        while (memberRes.next()){
            groupPanel p = (groupPanel)map.get(memberRes.getInt("GROUP_ID"));
            p.members.add(memberRes.getString("MEMBER_EMAIL")); 
        }
        for (Component p : map.values()){
            ((groupPanel)p).refresh();
        }
        return map.values();
    }
    
    /**
     * Creates new form groupPanel
     */
    public groupPanel() {
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
        buttonWithdraw = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        defaultGroupIcon = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        labelGroupName = new javax.swing.JTextArea();
        labelMember = new javax.swing.JLabel();
        membersList = new java.awt.List();
        labelLocation = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        labelGroupName1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        locationTextArea = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(101, 95, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanelOrange.setBackground(new java.awt.Color(25, 229, 198));
        leftPanelOrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        leftPanelOrange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        leftPanelOrange.add(labelDefaultImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonWithdraw.setBackground(new java.awt.Color(25, 229, 198));
        buttonWithdraw.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        buttonWithdraw.setForeground(new java.awt.Color(254, 254, 254));
        buttonWithdraw.setLabel("Withdraw");
        buttonWithdraw.setName(""); // NOI18N
        buttonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWithdrawActionPerformed(evt);
            }
        });
        leftPanelOrange.add(buttonWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, 30));
        leftPanelOrange.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        defaultGroupIcon.setIcon(new javax.swing.ImageIcon("/home/rnkambara/Documents/CardBoard-Community/images/default_group.jpeg")); // NOI18N
        leftPanelOrange.add(defaultGroupIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jScrollPane5.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setViewportBorder(null);
        jScrollPane5.setEnabled(false);
        jScrollPane5.setOpaque(false);

        labelGroupName.setBackground(new java.awt.Color(25, 229, 198));
        labelGroupName.setColumns(20);
        labelGroupName.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        labelGroupName.setForeground(new java.awt.Color(254, 254, 254));
        labelGroupName.setLineWrap(true);
        labelGroupName.setRows(5);
        labelGroupName.setText("Group Name");
        labelGroupName.setWrapStyleWord(true);
        labelGroupName.setBorder(null);
        jScrollPane5.setViewportView(labelGroupName);

        leftPanelOrange.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        add(leftPanelOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 230));

        labelMember.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelMember.setForeground(new java.awt.Color(253, 251, 251));
        labelMember.setText("Members");
        add(labelMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 110, -1));

        membersList.setBackground(new java.awt.Color(254, 254, 254));
        membersList.setFont(new java.awt.Font("Waree", 0, 12)); // NOI18N
        membersList.setMultipleMode(true);
        membersList.setName(""); // NOI18N
        membersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membersListActionPerformed(evt);
            }
        });
        add(membersList, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 320, 120));

        labelLocation.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelLocation.setForeground(new java.awt.Color(253, 251, 251));
        labelLocation.setText("Location: ");
        add(labelLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 140, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 110, 10));

        jTextPane1.setBackground(new java.awt.Color(101, 95, 123));
        jTextPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(101, 95, 123)));
        jTextPane1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(254, 254, 254));
        jTextPane1.setText(" Rating Here...");
        jScrollPane1.setViewportView(jTextPane1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 200, 30));

        jScrollPane4.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setViewportBorder(null);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setOpaque(false);

        labelGroupName1.setBackground(new java.awt.Color(25, 229, 198));
        labelGroupName1.setColumns(20);
        labelGroupName1.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        labelGroupName1.setForeground(new java.awt.Color(254, 254, 254));
        labelGroupName1.setLineWrap(true);
        labelGroupName1.setRows(5);
        labelGroupName1.setText("Group Name");
        labelGroupName1.setWrapStyleWord(true);
        labelGroupName1.setBorder(null);
        jScrollPane4.setViewportView(labelGroupName1);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 60));

        jScrollPane2.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setViewportBorder(null);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setOpaque(false);

        locationTextArea.setBackground(new java.awt.Color(101, 95, 123));
        locationTextArea.setColumns(20);
        locationTextArea.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        locationTextArea.setForeground(new java.awt.Color(254, 254, 254));
        locationTextArea.setLineWrap(true);
        locationTextArea.setRows(5);
        locationTextArea.setText("Location goes here...");
        locationTextArea.setWrapStyleWord(true);
        locationTextArea.setBorder(null);
        jScrollPane2.setViewportView(locationTextArea);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 290, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWithdrawActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonWithdrawActionPerformed

    private void membersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membersListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membersListActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonWithdraw;
    private javax.swing.JLabel defaultGroupIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel labelDefaultImage;
    private javax.swing.JTextArea labelGroupName;
    private javax.swing.JTextArea labelGroupName1;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel labelMember;
    private javax.swing.JPanel leftPanelOrange;
    private javax.swing.JTextArea locationTextArea;
    private java.awt.List membersList;
    // End of variables declaration//GEN-END:variables
}
