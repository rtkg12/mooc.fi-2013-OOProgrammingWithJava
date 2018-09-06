/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.*;
/**
 *
 * @author ritik
 */
public class Box implements Thing{
    private int maxCapacity;
    private ArrayList<Thing> box;
    
    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        int stored = getVolume();
        
        if(this.maxCapacity-stored>=thing.getVolume()){
            this.box.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int stored=0;
        
        for(Thing thing:this.box){
            stored+=thing.getVolume();
        }
        return stored;
    }
}
