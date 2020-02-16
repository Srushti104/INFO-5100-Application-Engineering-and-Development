/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.CustomerDirectory;
import Business.SupplierDirectory;
import Business.Users.Admin;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author AEDSpring2019
 */
public class AdminCreateScreen extends javax.swing.JPanel {

    /**
     * Creates new form AdminScreen
     */
    private JPanel panelRight;
    private Admin admin;

    public AdminCreateScreen(JPanel panelRight, Admin admin) {
        initComponents();
        this.panelRight = panelRight;
        this.admin = admin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        btnCreate = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        txtPword = new javax.swing.JTextField();
        txtRePword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        radioCustomer = new javax.swing.JRadioButton();
        radioSupplier = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("username:");

        jLabel2.setText("password:");

        jLabel3.setText("re-enter password :");

        buttonGroup.add(radioCustomer);
        radioCustomer.setText("Customer");
        radioCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCustomerActionPerformed(evt);
            }
        });

        buttonGroup.add(radioSupplier);
        radioSupplier.setText("Supplier");

        btnBack.setText("< BACK");
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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioSupplier)
                                    .addComponent(radioCustomer)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnBack)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRePword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioSupplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate)
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        if (userNamePattern() == false) {
            jLabel1.setForeground(Color.red);
            txtUser.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
            return;
            
        } else {
            
            jLabel1.setForeground(Color.BLACK);
            txtUser.setBorder(BorderFactory.createLineBorder(Color.black));
        }
        if (passwordPattern() == false) {
            jLabel2.setForeground(Color.red);
            txtPword.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, "
                                                    + "one lower case letter, one digit and one special character $, *, # or &.");
            return;
            
        } else {
            
            jLabel2.setForeground(Color.BLACK);
            txtPword.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        if (rePasswordPattern() == false) {
            jLabel3.setForeground(Color.red);
            txtRePword.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Passwords do not match");
            return;
            
        } else {

            jLabel3.setForeground(Color.BLACK);
            txtRePword.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        if (radioSupplier.isSelected() == true) {
            String newSupplierId = txtUser.getText();
            String newSupPassword = txtPword.getText();
            SupplierDirectory supDir = admin.getSuppDir();
            Supplier s = supDir.addSupplier(newSupPassword, newSupplierId);

//            CreateProduct createProdPanel = new CreateProduct(this.panelRight, s.getDirectory());
//            this.panelRight.add("CreateProduct", createProdPanel);
//            CardLayout layout = (CardLayout) this.panelRight.getLayout();
//            layout.next(panelRight);
        }

        if (radioCustomer.isSelected() == true) {
            String newCustomerId = txtUser.getText();
            String newPassword = txtPword.getText();
            DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
            Date date = new Date();
            String dateEntered = dateFormat.format(date);

            CustomerDirectory cusDir = admin.getCustDir();
            Customer c = cusDir.addCustomer(newPassword, newCustomerId);
            c.setDateCreated(dateEntered);
            JOptionPane.showMessageDialog(null, "Customer added successfully");
            txtUser.setText("");
            txtPword.setText("");
            txtRePword.setText("");

        }


    }//GEN-LAST:event_btnCreateActionPerformed

    private void radioCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCustomerActionPerformed
        // TODO add your handling code here:
        radioCustomer.setSelected(false);
    }//GEN-LAST:event_radioCustomerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        CardLayout layout = (CardLayout) panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);

        Component[] comps = this.panelRight.getComponents();
        for (Component comp : comps) {
            if (comp instanceof AdminMainScreen) {
                AdminMainScreen adminMainScreen = (AdminMainScreen) comp;
                adminMainScreen.populateCust(admin.getCustDir());
                adminMainScreen.populateSup(admin.getSuppDir());
            }
        }
        layout.previous(panelRight);
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean userNamePattern() {
        Pattern p = Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(txtUser.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean passwordPattern() {
        Pattern p = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = p.matcher(txtPword.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean rePasswordPattern() {
        String password = txtPword.getText();
        String rePassword = txtRePword.getText();
        if (password.equals(rePassword)) {
            return true;
        } else {
            return false;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton radioCustomer;
    private javax.swing.JRadioButton radioSupplier;
    private javax.swing.JTextField txtPword;
    private javax.swing.JTextField txtRePword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}