/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Items;

import java.util.ArrayList;

/**
 *
 * @author Cannonperson
 */
public class RecommendedList{
    
    ArrayList<Item> recommendedList;
    
    public void AddToList(Item item){
        recommendedList.add(item);
    }
    
    public ArrayList<Item> getList(){
        return recommendedList;
    }
    
    
}
