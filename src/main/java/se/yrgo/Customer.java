package se.yrgo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int CustomerID;
    private String name;
    private String email;
    List<ShoppingCart> orderHistory;
    public Customer(int CustomerID, String name, String email) {
        this.CustomerID = CustomerID;
        this.name = name;
        this.email = email;
        this.orderHistory = new ArrayList<>();
    }
    public int getCustomerID() {
        return CustomerID;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    /**
     * all prodcuts are put into the orderHistory list and can be shown here using
     * this method.
     * @return a formatted string with all the information
     */
    public String orderHistory(){
        if(orderHistory.isEmpty()){
            return "No history to be shown";
        }
        return String.format("Order History: %nName: %s%nEmail: %s%n" +
                "Items: %s&n",name,email,orderHistory);
    }

    /**
     * Method for placing orders.
     * add a Product into a list.
     *
     // * @param product
     * @throws IllegalArgumentException
     */
    public void placeOrder(ShoppingCart cart) throws IllegalArgumentException  {
        if(cart == null){
            throw new IllegalArgumentException("Cart doesn't exist!");
        }
        orderHistory.add(cart);
    }
    public String toString(){
        return String.format("ID: %d%nName: %s%nEmail: %s%n",getCustomerID(),getName(),getEmail());
    }
}
