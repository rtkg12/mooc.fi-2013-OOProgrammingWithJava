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

public class Participants {
    private ArrayList<Jumper> participants;
    
    public Participants(){
        this.participants = new ArrayList<Jumper>();
    }
    
    public void add(String name){
        this.participants.add(new Jumper(name));
    }
    
    public void sort(){
        Collections.sort(participants);
    }
    
    public void printParticipants(){
        sort();
        for(Jumper jumper: this.participants){
            System.out.println(("  " + (this.participants.indexOf(jumper)+1)) + ". " + jumper.getName() + " (" + jumper.Points() + " points)" );
        }
    }
    
    public void printRoundResults(int round){
        for(Jumper jumper: this.participants){
            jumper.jump();
            
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getJumpLength(round));
            System.out.println("    judge votes: " + Arrays.toString(jumper.getVotes(round)));
            
        }
    }
    
    public void printFinalResults(int rounds){
        Collections.sort(this.participants);
        Collections.reverse(this.participants);
        System.out.println("Position    Name");
        for(Jumper jumper:this.participants){
            System.out.println(this.participants.indexOf(jumper)+1 + "           " + jumper.getName() + " (" + jumper.Points() + " points)");
            System.out.print("            jump lengths: ");
            for(int i=1; i<rounds;i++){
                System.out.print(jumper.getJumpLength(i) + " m, ");
            }
            System.out.println(jumper.getJumpLength(rounds) + " m");
            
        }
    }
}
