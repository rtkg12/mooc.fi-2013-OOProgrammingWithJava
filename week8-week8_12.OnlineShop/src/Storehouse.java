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

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
    
    public Storehouse(){
        this.prices = new HashMap<String, Integer>();
        this.stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        
        if(this.prices.containsKey(product)){
            return this.prices.get(product);
        }
        
        else{
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }
        else 
            return 0;
    }
    
    public boolean take(String product){
        if(this.stock.containsKey(product) && this.stock.get(product)>0){
            this.stock.replace(product, this.stock.get(product)-1);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        
        for(String product:this.prices.keySet() ){
            products.add(product);
        }
        return products;
    } 
}
