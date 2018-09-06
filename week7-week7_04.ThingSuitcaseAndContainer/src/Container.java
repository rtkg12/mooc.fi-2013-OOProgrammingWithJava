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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> container;
    
    public Container(int limit){
        this.maxWeight = limit;
        this.container = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(totalWeight()+suitcase.totalWeight()<=this.maxWeight){
            this.container.add(suitcase);
        }
    }
    
    public int totalWeight(){
        int totalWeight =0;
        for(Suitcase suitcase: container){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for(Suitcase suitcase: this.container){
            suitcase.printThings();
        }
    }
    
    public String toString(){
        return this.container.size() + " suitcases ("+ totalWeight() + " kg)";
    }
}
