/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;
import java.util.*;
import moving.domain.*;
/**
 *
 * @author ritik
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things){
        ArrayList<Box> packed = new ArrayList<Box>();
        packed.add(new Box(this.boxesVolume));
        int index=0;
        for(Thing thing:things){
            if(!packed.get(index).addThing(thing)){
                packed.add(new Box(this.boxesVolume));
                index++;
                packed.get(index).addThing(thing);
            }
            else{
                packed.get(index).addThing(thing);
            }
        }
        return packed;
    }
}
