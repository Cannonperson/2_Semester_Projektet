/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actors;

import Items.Cart;
import Items.Item;
import Items.RecommendedList;

/**
 *
 * @author Cannonperson
 */
public class Customer extends User{
    
    private String address;
    private RecommendedList recommendedList;
    private Cart cart;
    
    public Customer(String username, String name, String password) {
        super(username, name, password);
    }
    
    public Item getCurrentItemViewed(){
        Item item = new Item();
        return item;
    }
    
}
