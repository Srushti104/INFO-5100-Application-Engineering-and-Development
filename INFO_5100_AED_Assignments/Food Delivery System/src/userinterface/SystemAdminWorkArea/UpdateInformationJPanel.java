/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane; 
import javax.swing.JPanel;

/**
 *
 * @author srush
 */
public class UpdateInformationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateInformationJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    String user;
    String username;
    
    public UpdateInformationJPanel(JPanel userProcessContainer, EcoSystem system, String user, String username) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        this.username = username;
        this.populate();
        
    }
    
    private void populate(){
        if (this.user.equals("Customer")) {
            usernameJTextField.setText(this.username);
            for (Customer c : system.getCustomerDirectory().getCustomerList()) {
                if (c.getUsername() != null) {
                    if (c.getUsername().equals(this.username)) {
                        Customer cust = c;
                        nameJTextField.setText(cust.getName());
                    }
                }
            }

            for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
                if (ua.getUsername().equals(this.username)) {
                    UserAccount userAccount = ua;
                    passwordField.setText(userAccount.getPassword());
                }
            }
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

        UpdatePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        submitJButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Username");

        submitJButton2.setText("Submit");
        submitJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Name");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Update Information");

        javax.swing.GroupLayout UpdatePanelLayout = new javax.swing.GroupLayout(UpdatePanel);
        UpdatePanel.setLayout(UpdatePanelLayout);
        UpdatePanelLayout.setHorizontalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createSequentialGroup()
                .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdatePanelLayout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(UpdatePanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(backJButton)
                        .addGap(172, 172, 172)
                        .addComponent(submitJButton2)))
                .addGap(221, 221, 221))
            .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UpdatePanelLayout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(UpdatePanelLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(52, 52, 52)
                            .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(UpdatePanelLayout.createSequentialGroup()
                            .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(UpdatePanelLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdatePanelLayout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(292, Short.MAX_VALUE)))
        );
        UpdatePanelLayout.setVerticalGroup(
            UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdatePanelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(185, 185, 185)
                .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton2))
                .addGap(158, 158, 158))
            .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(UpdatePanelLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(UpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(221, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(UpdatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButton2ActionPerformed

       String name = nameJTextField.getText();
       String password = String.valueOf(passwordField.getPassword());
       Customer c = null;
       UserAccount ua = null;
        if(this.user.equals("Customer"))
        {
            for(Customer cust:system.getCustomerDirectory().getCustomerList())
            {
                if(cust.getUsername().equals(this.username))
                {
                   c = cust;
                   c.setName(name);
                   break;
                }
            }
              for(UserAccount user:system.getUserAccountDirectory().getUserAccountList())
            {
                if(user.getUsername().equals(this.username))
                {
                   ua = user;
                   ua.setPassword(password);
                   break;
                }
            }
                          JOptionPane.showMessageDialog(null, "Field updated successfully.");
        }
        else
        {
            
            JOptionPane.showMessageDialog(null, "//");
        }
        
      
        nameJTextField.setText("");
        usernameJTextField.setText("");
        passwordField.setText("");
     
    }//GEN-LAST:event_submitJButton2ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageAllCustomersJPanel manageAllCust = (ManageAllCustomersJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UpdatePanel;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton submitJButton1;
    private javax.swing.JButton submitJButton2;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
