/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ritik
 */
import java.util.*;
 
public class ShoppingBasket {
    private List<Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price){
        int count = 0;
        for(Purchase purchase: this.purchases){
            if (purchase.product().equals(product)){
                purchase.increaseAmount();
                count++;
            }
        }
       
        if(count==0){
            this.purchases.add(new Purchase(product, 1, price));
        }
    }
    
    
    public int price(){
        int totalprice = 0;
        
        for(Purchase purchase: this.purchases){
            totalprice = totalprice + purchase.price();
        }
        
        return totalprice;
    }
    
    public void print(){
        for(Purchase purchase: this.purchases){
            System.out.println(purchase);
        }
    }
}
