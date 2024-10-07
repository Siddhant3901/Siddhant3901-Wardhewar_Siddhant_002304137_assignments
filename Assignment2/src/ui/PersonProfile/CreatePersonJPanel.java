/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.PersonProfile;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Person;
import model.PersonProfile;

/**
 *
 * @author siddh
 */
public class CreatePersonJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    PersonProfile personProfile;

    /**
     * Creates new form CreatePersonJPanel
     */
    public CreatePersonJPanel(JPanel container, PersonProfile directory) {
        initComponents();
        
        userProcessContainer = container;
        personProfile = directory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFname = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        txtLname = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        HomeAddJPanel = new javax.swing.JPanel();
        txtHStreetAdd = new javax.swing.JTextField();
        lblHStreetAdd = new javax.swing.JLabel();
        txtHUnNo = new javax.swing.JTextField();
        lblHUnNo = new javax.swing.JLabel();
        txtHCity = new javax.swing.JTextField();
        lblHCity = new javax.swing.JLabel();
        txtHzip = new javax.swing.JTextField();
        lblHzip = new javax.swing.JLabel();
        txtHstate = new javax.swing.JTextField();
        lblHstate = new javax.swing.JLabel();
        txtHPno = new javax.swing.JTextField();
        lblHPno = new javax.swing.JLabel();
        WorkAddJPanel = new javax.swing.JPanel();
        txtWStreetAdd = new javax.swing.JTextField();
        lblWStreetAdd = new javax.swing.JLabel();
        txtWUnNo = new javax.swing.JTextField();
        lblWUnNo = new javax.swing.JLabel();
        txtWCity = new javax.swing.JTextField();
        lblWCity = new javax.swing.JLabel();
        txtWzip = new javax.swing.JTextField();
        lblWzip = new javax.swing.JLabel();
        txtWstate = new javax.swing.JTextField();
        lblWstate = new javax.swing.JLabel();
        txtWPno = new javax.swing.JTextField();
        lblWPno = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));

        txtFname.setBackground(new java.awt.Color(204, 204, 204));
        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });

        lblFname.setForeground(new java.awt.Color(255, 255, 255));
        lblFname.setText(" First Name");

        txtLname.setBackground(new java.awt.Color(204, 204, 204));
        txtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLnameActionPerformed(evt);
            }
        });

        lblLname.setForeground(new java.awt.Color(255, 255, 255));
        lblLname.setText("Last Name");

        txtSsn.setBackground(new java.awt.Color(204, 204, 204));
        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        lblSsn.setForeground(new java.awt.Color(255, 255, 255));
        lblSsn.setText("Social Security Number");

        txtAge.setBackground(new java.awt.Color(204, 204, 204));
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("Age");

        HomeAddJPanel.setBackground(new java.awt.Color(153, 153, 153));
        HomeAddJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtHStreetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHStreetAddActionPerformed(evt);
            }
        });

        lblHStreetAdd.setText("Street Address");

        lblHUnNo.setText("Unit Number");

        txtHCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHCityActionPerformed(evt);
            }
        });

        lblHCity.setText("City");

        txtHzip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHzipActionPerformed(evt);
            }
        });

        lblHzip.setText("Zip Code");

        lblHstate.setText("State");

        lblHPno.setText("Phone Number");

        javax.swing.GroupLayout HomeAddJPanelLayout = new javax.swing.GroupLayout(HomeAddJPanel);
        HomeAddJPanel.setLayout(HomeAddJPanelLayout);
        HomeAddJPanelLayout.setHorizontalGroup(
            HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeAddJPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHStreetAdd)
                    .addComponent(lblHCity)
                    .addComponent(txtHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHzip)
                    .addComponent(txtHzip, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHPno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHPno)
                    .addComponent(txtHstate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHstate)
                    .addComponent(lblHUnNo)
                    .addComponent(txtHUnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        HomeAddJPanelLayout.setVerticalGroup(
            HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeAddJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(HomeAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblHStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HomeAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblHUnNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHUnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeAddJPanelLayout.createSequentialGroup()
                        .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHstate)
                            .addComponent(lblHCity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHPno)
                    .addComponent(lblHzip))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HomeAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        WorkAddJPanel.setBackground(new java.awt.Color(153, 153, 153));
        WorkAddJPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Work Address", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        txtWStreetAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWStreetAddActionPerformed(evt);
            }
        });

        lblWStreetAdd.setText("Street Address");

        lblWUnNo.setText("Unit Number");

        txtWCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWCityActionPerformed(evt);
            }
        });

        lblWCity.setText("City");

        lblWzip.setText("Zip Code");

        lblWstate.setText("State");

        lblWPno.setText("Phone Number");

        javax.swing.GroupLayout WorkAddJPanelLayout = new javax.swing.GroupLayout(WorkAddJPanel);
        WorkAddJPanel.setLayout(WorkAddJPanelLayout);
        WorkAddJPanelLayout.setHorizontalGroup(
            WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkAddJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWStreetAdd)
                    .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWCity)
                    .addComponent(txtWzip, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWzip))
                .addGap(38, 38, 38)
                .addGroup(WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWPno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWPno)
                    .addComponent(txtWstate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWstate)
                    .addComponent(lblWUnNo)
                    .addComponent(txtWUnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        WorkAddJPanelLayout.setVerticalGroup(
            WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkAddJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWStreetAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWUnNo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWUnNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWstate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(WorkAddJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWzip)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WorkAddJPanelLayout.createSequentialGroup()
                        .addComponent(lblWPno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWPno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Person Profile");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBack.setText("<<< Back");
        btnBack.setOpaque(true);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFname)
                                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLname)
                                    .addComponent(txtLname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(HomeAddJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(WorkAddJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSsn)
                                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAge)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnBack)
                        .addGap(545, 545, 545)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(726, 726, 726)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(540, 540, 540))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(lblTitle))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFname)
                    .addComponent(lblLname)
                    .addComponent(lblSsn)
                    .addComponent(lblAge))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(WorkAddJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomeAddJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(116, 116, 116)
                .addComponent(btnCreate)
                .addGap(724, 724, 724))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHStreetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHStreetAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHStreetAddActionPerformed

    private void txtHCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHCityActionPerformed

    private void txtWStreetAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWStreetAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWStreetAddActionPerformed

    private void txtWCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWCityActionPerformed

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLnameActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        

    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String FName = txtFname.getText();
        String LName = txtLname.getText();
        int Ssn = Integer.parseInt(txtSsn.getText());
        double Age = Double.parseDouble(txtAge.getText());
        String HStreetAdd = txtHStreetAdd.getText();
        String HUnNo = txtHUnNo.getText();
        String HCity = txtHCity.getText();
        String Hstate = txtHstate.getText();
        long Hzip = Long.parseLong(txtHzip.getText());
        int HPno = Integer.parseInt(txtHPno.getText());
        
        String WStreetAdd = txtWStreetAdd.getText();
        String WUnNo = txtWUnNo.getText();
        String WCity = txtWCity.getText();
        String Wstate = txtWstate.getText();
        long  Wzip = Long.parseLong(txtWzip.getText());
        int WPno = Integer.parseInt(txtWPno.getText());
        
        if(FName.isBlank() || LName.isBlank() || HStreetAdd.isBlank() || HUnNo.isBlank() || HCity.isBlank() || Hstate.isBlank()||WStreetAdd.isBlank() || WUnNo.isBlank() || WCity.isBlank() || Wstate.isBlank()){
        JOptionPane.showMessageDialog(this, "Please enter all the fields", "Incomplete", JOptionPane.ERROR_MESSAGE);
        return;
        }
         Person p = personProfile.addPerson();
         
         p.setFName(FName);
         p.setLName(LName);
         p.setAge(Age);
         p.setSsn(Ssn);
         p.setAddress(HStreetAdd,HUnNo,HCity,Hstate,Hzip,HPno,WStreetAdd,WUnNo,WCity,Wstate,Wzip,WPno);
         
         JOptionPane.showMessageDialog(this, "This Person Profile is sucessully stored", "Success",JOptionPane.INFORMATION_MESSAGE);
         
         txtFname.setText("");
         txtLname.setText("");
         txtAge.setText("");
         txtSsn.setText("");
         txtHStreetAdd.setText("");
         txtHUnNo.setText("");
         txtHCity.setText("");
         txtHstate.setText("");
         txtHzip.setText("");
         txtWStreetAdd.setText("");
         txtWUnNo.setText("");
         txtWCity.setText("");
         txtWstate.setText("");
         txtWzip.setText("");
         

         
        
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtHzipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHzipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHzipActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomeAddJPanel;
    private javax.swing.JPanel WorkAddJPanel;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblHCity;
    private javax.swing.JLabel lblHPno;
    private javax.swing.JLabel lblHStreetAdd;
    private javax.swing.JLabel lblHUnNo;
    private javax.swing.JLabel lblHstate;
    private javax.swing.JLabel lblHzip;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWCity;
    private javax.swing.JLabel lblWPno;
    private javax.swing.JLabel lblWStreetAdd;
    private javax.swing.JLabel lblWUnNo;
    private javax.swing.JLabel lblWstate;
    private javax.swing.JLabel lblWzip;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtHCity;
    private javax.swing.JTextField txtHPno;
    private javax.swing.JTextField txtHStreetAdd;
    private javax.swing.JTextField txtHUnNo;
    private javax.swing.JTextField txtHstate;
    private javax.swing.JTextField txtHzip;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtWCity;
    private javax.swing.JTextField txtWPno;
    private javax.swing.JTextField txtWStreetAdd;
    private javax.swing.JTextField txtWUnNo;
    private javax.swing.JTextField txtWstate;
    private javax.swing.JTextField txtWzip;
    // End of variables declaration//GEN-END:variables
}
