/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

/**
 *
 * @author Cannonperson
 */
public class Item {
    
    private String name;
    private String productID;
    private double price;
    private String category;
    private String picture;
    
    public Item getCurrentViewingItem(){
        Item item = new Item();
        return item;
    }
    
}
