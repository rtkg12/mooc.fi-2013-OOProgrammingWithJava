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

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;
    
    public Hand(){
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card card:hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
    @Override
    public int compareTo(Hand hand2){
        int thishandvalue=0;
        for(Card card:this.hand){
            thishandvalue+=card.getValue();
        }
        
        int comparedhandvalue=0;
        for(Card card:hand2.hand){
            comparedhandvalue+=card.getValue();
        }
        
        return thishandvalue-comparedhandvalue;
    }
}
