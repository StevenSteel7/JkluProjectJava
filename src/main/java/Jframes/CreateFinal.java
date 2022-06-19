/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Jframes;

import Code.API;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Character.isDigit;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;


/**
 *
 * @author soggs
 */


public class CreateFinal extends javax.swing.JFrame {
    Random rand = new Random();
    int OTP = rand.nextInt(999999);
    int check;


    protected CreateFinal() {
     initComponents();
     Verify_Code.setVisible(false);
     verify.setVisible(false);
     Send_sms_Code.setVisible(true);
        Toolkit toolkit = getToolkit()  ;
Dimension size = toolkit.getScreenSize();
setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);

this.dispose();
this.setUndecorated(true); // to set the jframe tranparent
this.setBackground(new Color(0, 0, 0, 0));
this.setVisible(true);}

CreateFinal(String nme, String usernme, String pass, String addres) {
initComponents();
Toolkit toolkit = getToolkit()  ;
Dimension size = toolkit.getScreenSize();
setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);

        
this.dispose();
this.setUndecorated(true); // to set the jframe tranparent
this.setBackground(new Color(0, 0, 0, 0));
this.setVisible(true);
 
        
    }

 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new Components.PanelBorder();
        panelBorder3 = new Components.PanelBorder();
        Close = new javax.swing.JLabel();
        panelBorder2 = new Components.PanelBorder();
        panelBorder4 = new Components.PanelBorder();
        phoneNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        month = new javax.swing.JComboBox<>();
        day = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ConnectionType = new javax.swing.JComboBox<>();
        verify = new javax.swing.JLabel();
        Verify_Code = new javax.swing.JTextField();
        backToLogin = new javax.swing.JLabel();
        Send_sms_Code = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1186, 621));

        panelBorder1.setMaximumSize(new java.awt.Dimension(1186, 621));
        panelBorder1.setMinimumSize(new java.awt.Dimension(1186, 621));

        Close.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close_def.png")); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close)
                .addContainerGap())
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Close)
                .addContainerGap())
        );

        phoneNo.setFont(jLabel1.getFont());
        phoneNo.setText("Enter Phone Number");
        phoneNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneNoMouseClicked(evt);
            }
        });
        phoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoActionPerformed(evt);
            }
        });
        phoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneNoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneNoKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter Phone Number");

        month.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        day.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayActionPerformed(evt);
            }
        });

        year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", " " }));
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Male", "Female", " " }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Pick Your Gender");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter Your D.O.B.");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Connection type");

        ConnectionType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConnectionType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accha ", "Bura", "thiek thiek" }));

        verify.setIcon(new javax.swing.ImageIcon("G:\\JkluProjectJava\\src\\main\\java\\Icons\\Verify.png")); // NOI18N
        verify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verifyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verifyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verifyMouseExited(evt);
            }
        });

        Verify_Code.setText("Code");
        Verify_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verify_CodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder4Layout = new javax.swing.GroupLayout(panelBorder4);
        panelBorder4.setLayout(panelBorder4Layout);
        panelBorder4Layout.setHorizontalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                            .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                            .addGap(135, 135, 135))
                        .addGroup(panelBorder4Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(127, 127, 127)))
                    .addGroup(panelBorder4Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder4Layout.createSequentialGroup()
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(phoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                    .addComponent(ConnectionType, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                        .addComponent(verify, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder4Layout.createSequentialGroup()
                        .addComponent(Verify_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        panelBorder4Layout.setVerticalGroup(
            panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(ConnectionType))
                .addGap(31, 31, 31)
                .addGroup(panelBorder4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Verify_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verify, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backToLogin.setIcon(new javax.swing.ImageIcon("G:\\JkluProjectJava\\src\\main\\java\\Icons\\BackToLogin.png")); // NOI18N
        backToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToLoginMouseClicked(evt);
            }
        });

        Send_sms_Code.setIcon(new javax.swing.ImageIcon("G:\\JkluProjectJava\\src\\main\\java\\Icons\\send_code.png")); // NOI18N
        Send_sms_Code.setText("jButton1");
        Send_sms_Code.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Send_sms_CodeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(panelBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Send_sms_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backToLogin)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(panelBorder4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(Send_sms_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(backToLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoActionPerformed

    }//GEN-LAST:event_phoneNoActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthActionPerformed

    private void dayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void phoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNoKeyPressed

    }//GEN-LAST:event_phoneNoKeyPressed

    private void phoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNoKeyTyped
   
   
    }//GEN-LAST:event_phoneNoKeyTyped

    private void phoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneNoKeyReleased
  String pwd = new String (phoneNo.getText()); 
        if (!isDigit(pwd.charAt(pwd.length()-1))){
    if(pwd.length()==1){
        phoneNo.setText("");
    }
    else{
    phoneNo.setText(pwd.substring(0,pwd.length()-2));}
    
}
   if(pwd.length()>11)
   {
       phoneNo.setText(pwd.substring(0,pwd.length()-2));
   }
   
   if(pwd.length()==10){
       verify.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\Verify_def.png"));
   }
        
        

    }//GEN-LAST:event_phoneNoKeyReleased

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited

        Close.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close_def.png"));
    }//GEN-LAST:event_CloseMouseExited

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered

        Close.setIcon(new javax.swing.ImageIcon("G:\\Java\\New Folder\\ElectricBillGen\\src\\main\\java\\Icons\\close.png"));
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void phoneNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneNoMouseClicked
        phoneNo.setText("");
    }//GEN-LAST:event_phoneNoMouseClicked

    private void verifyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyMouseEntered
  
    }//GEN-LAST:event_verifyMouseEntered

    private void verifyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyMouseExited
 
    }//GEN-LAST:event_verifyMouseExited

    private void backToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToLoginMouseClicked
String phone = phoneNo.getText();
    String Gender = (String) gender.getSelectedItem();
    String Day = (String) day.getSelectedItem();
    String Year = (String) year.getSelectedItem();
    String Month = (String) month.getSelectedItem();
    String Connectiontype = (String) ConnectionType.getSelectedItem();
    
    
    
 try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electricbill","root","lordoflords");
        //String SQL = "SELECT * FROM electricbill.customerdata;";
     String SQL =  "INSERT INTO `electricbill`.`customerdata` (`kID`, `Name`, `PhoneNo`, `Email`, `Address`) VALUES ('sooo', 'suryansh', '9079856', 'suryansh', 'pratap');";
        
        Statement st = con.createStatement();
       ResultSet rs = st.executeQuery(SQL);
        
        }
     
    
    catch (ClassNotFoundException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
    }    
    
    
    
    
    
        new Login().setVisible(true);
                this.dispose();      
        // TODO add your handling code here:
    }//GEN-LAST:event_backToLoginMouseClicked

    private void Send_sms_CodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Send_sms_CodeMouseClicked
        try {
            String recipent = phoneNo.getText();
            String FinalNumber = "+91" + recipent;
            String text= "Hello There, Your OTP is " + OTP;
            API.SendSMS(FinalNumber, text);
            Verify_Code.setVisible(true);
            verify.setVisible(true);
            Send_sms_Code.setVisible(false);
        } catch (Exception ex) {
            Logger.getLogger(Create1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Send_sms_CodeMouseClicked

    private void verifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verifyMouseClicked
        int OTPverification = Integer.parseInt(Verify_Code.getText());
        if(OTPverification == OTP) {
            System.out.print("Worked");
            check=1;
            
        }
        else {
        System.out.print(OTPverification);
        System.out.print(OTP);
        }
    }//GEN-LAST:event_verifyMouseClicked

    private void Verify_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verify_CodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Verify_CodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JComboBox<String> ConnectionType;
    private javax.swing.JButton Send_sms_Code;
    private javax.swing.JTextField Verify_Code;
    private javax.swing.JLabel backToLogin;
    private javax.swing.JComboBox<String> day;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> month;
    private Components.PanelBorder panelBorder1;
    private Components.PanelBorder panelBorder2;
    private Components.PanelBorder panelBorder3;
    private Components.PanelBorder panelBorder4;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JLabel verify;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
