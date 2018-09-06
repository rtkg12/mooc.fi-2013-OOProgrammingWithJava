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

public class Jumper implements Comparable<Jumper>{
    private String name;
    private ArrayList<Integer> lengths;
    private ArrayList<int[]> votes; 
    
    public Jumper(String name){
        this.name=name;
        this.lengths = new ArrayList<Integer>();
        this.votes = new ArrayList<int[]>();
    }
    
    public String getName(){
        return this.name;
    }
    
    public int Points(){
        int points = 0;
        for(int length:this.lengths){
            points+=length;
        }
        
        for(int[] vote1:this.votes){
            int[] vote = arraySort(vote1);
            for(int i=1;i<4; i++){
                points+=vote[i];
            }
        }
        return points;
    }
    
    public void jump(){
        this.lengths.add((int)(Math.random()*60 + 60));
        vote();
    }
    
    public int[] arraySort(int[] array){
        int[] array2 = array.clone();
        int swaps = 99;
        
        while(swaps!=0){
            swaps = 0;
            for(int i=0; i<array2.length-1; i++){
                if(array2[i]>array2[i+1]){
                    swaps++;
                    int temp = array2[i];
                    array2[i]=array2[i+1];
                    array2[i+1]=temp;
                }
            }
        }
        return array2;
    }
    
    public void vote(){
        int[] votes = new int[5];
        
        for(int i=0; i<votes.length;i++){
            votes[i] = (int) (Math.random()*10 + 10);
        }
        
        this.votes.add(votes);
    }
    
    public int getJumpLength(int round){
        return this.lengths.get(round-1);
    }
    
    public int[] getVotes(int round){
        return this.votes.get(round-1);
    }
    
    @Override
    public int compareTo(Jumper jumper2){
        return this.Points()-jumper2.Points();
    }
}
