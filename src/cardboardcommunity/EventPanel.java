/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardboardcommunity;

import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author rnkambara
 */
public class EventPanel extends javax.swing.JPanel {
    int event_id;
    String location;
    String startTime;
    String endTime;
    String title;
    List<String> attending;
    
    /**
     * Creates new form BasePanel
     */
    public EventPanel() {
        initComponents();
    }
    
    public void refresh() throws SQLException{
        labelEvent.setText(title);
        locationText.setText(location);
        startText.setText(startTime);
        endText.setText(endTime);
        
        for(String attender : attending)
        {
            listAttending.add(attender);
        }
    }
    
    public static Collection<Component> readPanels(Connection con, String whereClause) throws SQLException
    {
     Statement s1 = con.createStatement();
        Statement s2 = con.createStatement();
        s1.executeQuery("SELECT E.EVENT_ID, TITLE, LOCATION, START_TIME, END_TIME FROM EVENT E, ATTENDING A WHERE " + whereClause + " AND E.EVENT_ID = A.EVENT_ID");
        s2.executeQuery("SELECT EVENT_ID, ATTENDING_EMAIL " +
                        "FROM ATTENDING NATURAL JOIN (SELECT EVENT_ID " +
                                                     "FROM ATTENDING WHERE + " + whereClause + " )");  
       
        /**
         "SELECT MEMBER_EMAIL, GROUP_ID " +
                        "FROM MEMBER_OF NATURAL JOIN (SELECT GROUP_ID " +
                                                     "FROM MEMBER_OF " +
                                                     "WHERE " + whereClause +" )"
         **/
        
        HashMap<Integer, Component> map = new HashMap<>();
        ResultSet groupRes = s1.getResultSet();
        
        while (groupRes.next())
        {
            EventPanel p = new EventPanel(); 
            p.event_id = groupRes.getInt("EVENT_ID");
            p.title = groupRes.getString("TITLE");
            p.location = groupRes.getString("LOCATION");
            p.startTime = groupRes.getString("START_TIME");
            p.endTime = groupRes.getString("END_TIME");
            p.attending = new ArrayList<String>();
            map.put(p.event_id, p);
        }
        
        ResultSet memberRes = s2.getResultSet();
        while (memberRes.next())
        {
            EventPanel p = (EventPanel)map.get(memberRes.getInt("EVENT_ID"));
            p.attending.add(memberRes.getString("ATTENDING_EMAIL")); 
        }
        
        for (Component p : map.values())
        {
            ((EventPanel)p).refresh();
        }
        return map.values();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jSeparator2 = new javax.swing.JSeparator();
        basicDatePickerUI1 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        basicDatePickerUI2 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        basicDatePickerUI3 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        basicDatePickerUI4 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        basicDatePickerUI5 = new org.jdesktop.swingx.plaf.basic.BasicDatePickerUI();
        leftPanelOrange = new javax.swing.JPanel();
        labelDefaultImage = new javax.swing.JLabel();
        buttonWithdraw = new java.awt.Button();
        defaultEventIcon = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        labelEvent = new javax.swing.JTextArea();
        labelDescription = new javax.swing.JLabel();
        label_attending = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        listAttending = new java.awt.List();
        labelLocation = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        startText = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        locationText = new javax.swing.JTextArea();
        labelTime1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        endText = new javax.swing.JTextArea();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.addTab("tab2", jTabbedPane3);

        setBackground(new java.awt.Color(101, 95, 123));
        setFont(new java.awt.Font("Liberation Mono", 0, 15)); // NOI18N
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        leftPanelOrange.setBackground(new java.awt.Color(218, 2, 0));
        leftPanelOrange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        leftPanelOrange.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        leftPanelOrange.add(labelDefaultImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonWithdraw.setBackground(new java.awt.Color(218, 2, 0));
        buttonWithdraw.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        buttonWithdraw.setForeground(new java.awt.Color(254, 254, 254));
        buttonWithdraw.setLabel("Withdraw");
        buttonWithdraw.setName(""); // NOI18N
        buttonWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonWithdrawActionPerformed(evt);
            }
        });
        leftPanelOrange.add(buttonWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, 30));
        buttonWithdraw.getAccessibleContext().setAccessibleName("button_withdraw");

        defaultEventIcon.setIcon(new javax.swing.ImageIcon("images/default_event.png")); // NOI18N
        leftPanelOrange.add(defaultEventIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jScrollPane5.setBackground(new java.awt.Color(101, 95, 123));
        jScrollPane5.setBorder(null);
        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane5.setViewportBorder(null);
        jScrollPane5.setEnabled(false);
        jScrollPane5.setOpaque(false);

        labelEvent.setBackground(new java.awt.Color(218, 2, 0));
        labelEvent.setColumns(20);
        labelEvent.setFont(new java.awt.Font("Waree", 1, 15)); // NOI18N
        labelEvent.setForeground(new java.awt.Color(254, 254, 254));
        labelEvent.setLineWrap(true);
        labelEvent.setRows(5);
        labelEvent.setText("Board Game");
        labelEvent.setWrapStyleWord(true);
        labelEvent.setBorder(null);
        jScrollPane5.setViewportView(labelEvent);

        leftPanelOrange.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 50));

        add(leftPanelOrange, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 240));

        labelDescription.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelDescription.setForeground(new java.awt.Color(253, 251, 251));
        labelDescription.setText("Description");
        add(labelDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, -1));

        label_attending.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        label_attending.setForeground(new java.awt.Color(253, 251, 251));
        label_attending.setText("Attending");
        add(label_attending, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 110, -1));

        labelTime.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelTime.setForeground(new java.awt.Color(253, 251, 251));
        labelTime.setText("Start Time : ");
        add(labelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, 20));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 320, 10));

        listAttending.setBackground(new java.awt.Color(254, 254, 254));
        listAttending.setFont(new java.awt.Font("Waree", 1, 12)); // NOI18N
        listAttending.setForeground(new java.awt.Color(1, 1, 1));
        listAttending.setMultipleMode(true);
        listAttending.setName(""); // NOI18N
        listAttending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAttendingActionPerformed(evt);
            }
        });
        add(listAttending, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, 200, 180));

        labelLocation.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelLocation.setForeground(new java.awt.Color(253, 251, 251));
        labelLocation.setText("Location: ");
        add(labelLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 140, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 110, 10));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(254, 254, 254));
        jTextArea1.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(112, 110, 110));
        jTextArea1.setText("Tell us about your event!");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 300, 60));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        startText.setBackground(new java.awt.Color(254, 254, 254));
        startText.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        startText.setForeground(new java.awt.Color(112, 110, 110));
        startText.setText("Start Time here...");
        jScrollPane2.setViewportView(startText);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 180, 30));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        locationText.setBackground(new java.awt.Color(254, 254, 254));
        locationText.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        locationText.setForeground(new java.awt.Color(112, 110, 110));
        locationText.setText("Location goes here...");
        jScrollPane3.setViewportView(locationText);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 180, 30));

        labelTime1.setFont(new java.awt.Font("Waree", 1, 14)); // NOI18N
        labelTime1.setForeground(new java.awt.Color(253, 251, 251));
        labelTime1.setText("End Time : ");
        add(labelTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, 20));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        endText.setBackground(new java.awt.Color(254, 254, 254));
        endText.setFont(new java.awt.Font("Waree", 0, 15)); // NOI18N
        endText.setForeground(new java.awt.Color(112, 110, 110));
        endText.setText("End Time here...");
        jScrollPane4.setViewportView(endText);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 180, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonWithdrawActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_buttonWithdrawActionPerformed

    private void listAttendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAttendingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listAttendingActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI1;
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI2;
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI3;
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI4;
    private org.jdesktop.swingx.plaf.basic.BasicDatePickerUI basicDatePickerUI5;
    private java.awt.Button buttonWithdraw;
    private javax.swing.JLabel defaultEventIcon;
    private javax.swing.JTextArea endText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelDefaultImage;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JTextArea labelEvent;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelTime1;
    private javax.swing.JLabel label_attending;
    private javax.swing.JPanel leftPanelOrange;
    private java.awt.List listAttending;
    private javax.swing.JTextArea locationText;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private javax.swing.JTextArea startText;
    // End of variables declaration//GEN-END:variables
}
