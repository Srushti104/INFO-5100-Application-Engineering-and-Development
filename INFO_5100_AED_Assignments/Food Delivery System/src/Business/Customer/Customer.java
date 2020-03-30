/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Customer {
    
    private String name;
     private String Username;
    private List<Order> custOrders;
    
    public Customer(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getCustOrders() {
        if(custOrders == null)
        {
            custOrders = new ArrayList();
        }
        return custOrders;
    }

    public void setCustOrders(List<Order> custOrders) {
        this.custOrders = custOrders;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    

    @Override
    public String toString() {
        return this.getName();
    }
  
}
