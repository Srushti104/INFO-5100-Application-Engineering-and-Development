/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author srush
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    JPanel userProcessContainer;
    Restaurant restaurant;
    UserAccount userAccount;
    Order order;
    DeliveryManDirectory deliveryManDirectory;
    public ManageOrdersJPanel(JPanel userProcessContainer, Restaurant restaurant, DeliveryManDirectory deliveryManDirectory, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurant = restaurant;
        this.deliveryManDirectory = deliveryManDirectory;
        this.userAccount = userAccount;
        btnAssign.setEnabled(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void populateTable()
    {
        if(this.restaurant.getWorkQueue().getWorkRequestList() != null)
        {
            DefaultTableModel dtm = (DefaultTableModel) restaurantOrdersTable.getModel();
            dtm.setRowCount(0);
            for (WorkRequest w : this.restaurant.getWorkQueue().getWorkRequestList()) 
            {
                if(w.getOrder() != null)
                {
                    Object row[] = new Object[5];
                    row[0] = w.getOrder().getOrderId();
                    Iterator itr = w.getOrder().getOrderMap().entrySet().iterator();
                    StringBuilder sb = new StringBuilder("");
                    while (itr.hasNext()) 
                    { 
                        Map.Entry mapElement = (Map.Entry)itr.next(); 
                        sb.append(mapElement.getKey()+", ");
                    } 
                    row[1]= sb;
                    row[2] = null;
                    if(w.getSender().getCustomer() == null)
                    {
                       row[3] = this.restaurant.getName();
                    }
                    else
                    {
                        row[3] = w.getSender().getCustomer().getName(); 
                    }
                    row[4] = w.getStatus();
                    dtm.addRow(row);
                }
  
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantOrdersTable = new javax.swing.JTable();
        btnAcceptOrder = new javax.swing.JButton();
        btnDeclineOrder = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        restaurantOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Ordered Items", "Message", "Sender", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(restaurantOrdersTable);

        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnDeclineOrder.setText("Decline Order");
        btnDeclineOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineOrderActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign to DeliveryMan");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(50, 50, 50)
                        .addComponent(btnAssign)
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAcceptOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeclineOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnAssign)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAcceptOrder)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDeclineOrder)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        btnAssign.setEnabled(true);
        int selectedRow = restaurantOrdersTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            Integer orderId= (Integer)restaurantOrdersTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: this.restaurant.getWorkQueue().getWorkRequestList())
            {
                if(wr.getOrder().getOrderId() == orderId)
                {
                  if(wr.getStatus().equalsIgnoreCase("Assinged to delivery Man"))
                   {
                        JOptionPane.showMessageDialog(null, "The order is already assigned for delivery");
                        break;
                   }
                  else if(wr.getStatus().equalsIgnoreCase("Decline"))
                  {
                      JOptionPane.showMessageDialog(null, "The order is already declined."); 
                      break;
                  }
                  else
                  {
                      if(wr.getStatus().equalsIgnoreCase("Accepted"))
                      {
                         JOptionPane.showMessageDialog(null, "The order is already accepted."); 
                        break; 
                      }
                      else
                      {
                          wr.setStatus("Accepted");
                          JOptionPane.showMessageDialog(null, "The order has been accepted.");
                          this.populateTable();
                          break;
                      }
                  }
                }
            }
        }
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnDeclineOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineOrderActionPerformed
        // TODO add your handling code here:
        btnAssign.setEnabled(false);
        int selectedRow = restaurantOrdersTable.getSelectedRow();
        if(selectedRow >= 0)
        {
           Integer orderId= (Integer)restaurantOrdersTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: this.restaurant.getWorkQueue().getWorkRequestList())
            {
                if(wr.getOrder().getOrderId() == orderId)
                {
                  wr.setStatus("Decline");
                  this.populateTable();
                  break;
                }
            }
        }
    }//GEN-LAST:event_btnDeclineOrderActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = restaurantOrdersTable.getSelectedRow();
        if(selectedRow >= 0)
        {
            Integer orderId= (Integer)restaurantOrdersTable.getValueAt(selectedRow, 0);
            for(WorkRequest wr: this.restaurant.getWorkQueue().getWorkRequestList())
            {
                if(wr.getOrder().getOrderId() ==  orderId)
                {
                    order = wr.getOrder();
                    break;
                }
            }
            AssignToDeliverymanJPanel assignPanel = new AssignToDeliverymanJPanel(userProcessContainer, order, this.deliveryManDirectory, this.restaurant, this.userAccount);
            userProcessContainer.add("assignPanel", assignPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a order to assign to delivery man.");
        }
        
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        AdminWorkAreaJPanel adminPanel = (AdminWorkAreaJPanel) component;
//        adminPanel.postEvent(e);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeclineOrder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable restaurantOrdersTable;
    // End of variables declaration//GEN-END:variables
}
