
package Jframes;

import Components.Tablee;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author soggs
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    public AdminPage() {
        initComponents();
Toolkit toolkit = getToolkit()  ;
Dimension size = toolkit.getScreenSize();
setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
this.dispose();
this.setUndecorated(true); // to set the jframe tranparent
this.setBackground(new Color(0, 0, 0, 0));
this.setVisible(true);

connect();


    }
    

     void connect(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricbill","root","lordoflords");
        String SQL = "SELECT * FROM electricbill.customerdata;";
     //String SQL =  "INSERT INTO `electricbill`.`customerdata` (`kID`, `Name`, `PhoneNo`, `Email`, `Address`) VALUES ('sooo', 'suryansh', '9079856', 'suryansh', 'pratap');";
       
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(SQL);
        ResultSetMetaData rsmd =rs.getMetaData();
        DefaultTableModel model = (DefaultTableModel)tablee.getModel();
        
        int col = rsmd.getColumnCount();
        String colName[] = new String[col];
        for(int i=0;i<col;i++)
            colName[i] = rsmd.getColumnName(i+1);
            model.setColumnIdentifiers(colName);
            String kID ,name,username,phoneno,address;
        
      while(rs.next()){
                kID = rs.getString(1);
                name = rs.getString(2);
                username = rs.getString(3);
                phoneno = rs.getString(4);
                address = rs.getString(5);
                String[] row = {kID,name,username,phoneno,address};
                
                model.addRow(row);
       
            }
        }
     
    
    catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}   
    

    
    

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table1 = new Components.Tablee();
        panelBorder1 = new Components.PanelBorder();
        panelBorder2 = new Components.PanelBorder();
        panelBorder4 = new Components.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        panelBorder3 = new Components.PanelBorder();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        gradient1 = new Gradients.Gradient_Admin_blue();
        jLabel4 = new javax.swing.JLabel();
        gradient_Admin_Purple2 = new Gradients.Gradient_Admin_Purple();
        gradient_Admin_Yellow1 = new Gradients.Gradient_Admin_Yellow();
        jLabel2 = new javax.swing.JLabel();
        panelBorder5 = new Components.PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablee = new Components.Tablee();
        sidepanel1 = new Gradients.Sidepanel();
        jLabel6 = new javax.swing.JLabel();
        gradient_Admin_Purple1 = new Gradients.Gradient_Admin_Purple();
        Signout = new javax.swing.JLabel();
        gradient_Admin_Purple4 = new Gradients.Gradient_Admin_Purple();
        jLabel7 = new javax.swing.JLabel();
        gradient_Admin_Purple5 = new Gradients.Gradient_Admin_Purple();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBorder1.setMaximumSize(new java.awt.Dimension(1186, 621));
        panelBorder1.setMinimumSize(new java.awt.Dimension(1186, 621));

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelBorder2.setBackground(new java.awt.Color(204, 204, 204));
        panelBorder2.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder2.setMaximumSize(new java.awt.Dimension(1186, 621));
        panelBorder2.setMinimumSize(new java.awt.Dimension(1186, 621));
        panelBorder2.setPreferredSize(new java.awt.Dimension(1186, 621));
        panelBorder2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBorder4.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder4.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close_def.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        panelBorder4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 0, -1, -1));

        panelBorder2.add(panelBorder4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1310, 30));

        panelBorder3.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder3.setForeground(new java.awt.Color(255, 255, 255));
        panelBorder3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gradient1.setPreferredSize(new java.awt.Dimension(333, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payer %");

        javax.swing.GroupLayout gradient1Layout = new javax.swing.GroupLayout(gradient1);
        gradient1.setLayout(gradient1Layout);
        gradient1Layout.setHorizontalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        gradient1Layout.setVerticalGroup(
            gradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jLayeredPane1.add(gradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, 229));

        gradient_Admin_Purple2.setPreferredSize(new java.awt.Dimension(333, 252));

        javax.swing.GroupLayout gradient_Admin_Purple2Layout = new javax.swing.GroupLayout(gradient_Admin_Purple2);
        gradient_Admin_Purple2.setLayout(gradient_Admin_Purple2Layout);
        gradient_Admin_Purple2Layout.setHorizontalGroup(
            gradient_Admin_Purple2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        gradient_Admin_Purple2Layout.setVerticalGroup(
            gradient_Admin_Purple2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        jLayeredPane1.add(gradient_Admin_Purple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 6, -1, 229));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Average Bill");

        javax.swing.GroupLayout gradient_Admin_Yellow1Layout = new javax.swing.GroupLayout(gradient_Admin_Yellow1);
        gradient_Admin_Yellow1.setLayout(gradient_Admin_Yellow1Layout);
        gradient_Admin_Yellow1Layout.setHorizontalGroup(
            gradient_Admin_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Yellow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        gradient_Admin_Yellow1Layout.setVerticalGroup(
            gradient_Admin_Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Yellow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jLayeredPane1.add(gradient_Admin_Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 6, -1, -1));

        panelBorder3.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, 242));

        panelBorder5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setText("Info aboutall customers");

        jScrollPane1.setBorder(null);

        tablee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablee);

        javax.swing.GroupLayout panelBorder5Layout = new javax.swing.GroupLayout(panelBorder5);
        panelBorder5.setLayout(panelBorder5Layout);
        panelBorder5Layout.setHorizontalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        panelBorder5Layout.setVerticalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelBorder3.add(panelBorder5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 254, -1, 438));

        panelBorder2.add(panelBorder3, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 48, -1, 692));

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\Profile.png")); // NOI18N
        jLabel6.setText("Welcome");

        Signout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Signout.setForeground(new java.awt.Color(255, 255, 255));
        Signout.setText("Sign out");

        javax.swing.GroupLayout gradient_Admin_Purple1Layout = new javax.swing.GroupLayout(gradient_Admin_Purple1);
        gradient_Admin_Purple1.setLayout(gradient_Admin_Purple1Layout);
        gradient_Admin_Purple1Layout.setHorizontalGroup(
            gradient_Admin_Purple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Signout, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gradient_Admin_Purple1Layout.setVerticalGroup(
            gradient_Admin_Purple1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Signout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bill Sample");

        javax.swing.GroupLayout gradient_Admin_Purple4Layout = new javax.swing.GroupLayout(gradient_Admin_Purple4);
        gradient_Admin_Purple4.setLayout(gradient_Admin_Purple4Layout);
        gradient_Admin_Purple4Layout.setHorizontalGroup(
            gradient_Admin_Purple4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        gradient_Admin_Purple4Layout.setVerticalGroup(
            gradient_Admin_Purple4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Help");

        javax.swing.GroupLayout gradient_Admin_Purple5Layout = new javax.swing.GroupLayout(gradient_Admin_Purple5);
        gradient_Admin_Purple5.setLayout(gradient_Admin_Purple5Layout);
        gradient_Admin_Purple5Layout.setHorizontalGroup(
            gradient_Admin_Purple5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        gradient_Admin_Purple5Layout.setVerticalGroup(
            gradient_Admin_Purple5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradient_Admin_Purple5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout sidepanel1Layout = new javax.swing.GroupLayout(sidepanel1);
        sidepanel1.setLayout(sidepanel1Layout);
        sidepanel1Layout.setHorizontalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gradient_Admin_Purple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradient_Admin_Purple5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gradient_Admin_Purple4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidepanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        sidepanel1Layout.setVerticalGroup(
            sidepanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addComponent(gradient_Admin_Purple1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(gradient_Admin_Purple4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(gradient_Admin_Purple5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        panelBorder2.add(sidepanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 1323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(684, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close.png"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close_def.png"));
        
    }//GEN-LAST:event_jLabel1MouseExited

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Signout;
    private Gradients.Gradient_Admin_blue gradient1;
    private Gradients.Gradient_Admin_Purple gradient_Admin_Purple1;
    private Gradients.Gradient_Admin_Purple gradient_Admin_Purple2;
    private Gradients.Gradient_Admin_Purple gradient_Admin_Purple3;
    private Gradients.Gradient_Admin_Purple gradient_Admin_Purple4;
    private Gradients.Gradient_Admin_Purple gradient_Admin_Purple5;
    private Gradients.Gradient_Admin_Yellow gradient_Admin_Yellow1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private Components.PanelBorder panelBorder1;
    private Components.PanelBorder panelBorder2;
    private Components.PanelBorder panelBorder3;
    private Components.PanelBorder panelBorder4;
    private Components.PanelBorder panelBorder5;
    private Gradients.Sidepanel sidepanel1;
    private Components.Tablee table1;
    private Components.Tablee tablee;
    // End of variables declaration//GEN-END:variables
}
