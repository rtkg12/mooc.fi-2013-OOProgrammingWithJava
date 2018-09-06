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

public class Suitcase {
    private ArrayList<Thing> suitcase;
    private int weightLimit;
    
    public Suitcase(int limit){
        this.suitcase = new ArrayList<Thing>();
        this.weightLimit = limit;
        
    }
    
    public void addThing(Thing thing){
        
        if(totalWeight()+thing.getWeight()<=this.weightLimit ){
            this.suitcase.add(thing);
        }
    }
    
    public int totalWeight(){
        int totalWeight=0;
        for(Thing things: suitcase){
            totalWeight += things.getWeight();
        }
        return totalWeight;
    }
    
    public void printThings(){
        for(Thing thing: this.suitcase){
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing(){
        if(this.suitcase.size()!=0){
        Thing heaviest = this.suitcase.get(0);
        for(Thing thing: this.suitcase){
            if(thing.getWeight()>heaviest.getWeight()){
                heaviest = thing;
            }
        }
        return heaviest;
        }
        return null;
    }
    
    public String toString(){
        int totalWeight=totalWeight();
        int count=this.suitcase.size();
        
        
        if(count==0){
            return "empty (0 kg)";
        }
        
        else if(count==1){
            return count + " thing (" + totalWeight + " kg)";

        }
        
        return count + " things (" + totalWeight + " kg)";
    }
}
