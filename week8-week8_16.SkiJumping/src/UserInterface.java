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

public class UserInterface {
    private Scanner reader;
    private Participants participants;
    private int round;
    
    public UserInterface(){
        this.reader = new Scanner(System.in);
        this.participants = new Participants();
        this.round = 0;
    }
    
    public UserInterface(String input){
        this.reader = new Scanner(input);
        this.participants = new Participants();
        this.round = 0;
    }
    
    public void start(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        inputNames();
        System.out.println("The tournament begins!");
        play();
    }
    
    public void inputNames(){
        String name="";
        
        while(true){
            System.out.print("  Participant name:");
            name = this.reader.nextLine();
            if(name.equals("")){
                break;
            }
            this.participants.add(name);

        }
        
    }
    
    public void play(){
        String input;
        
        while(true){
            System.out.print("Write \"jump\" to jump; otherwise you quit:");
            input = this.reader.nextLine();
            if(!input.equals("jump")){
                quit();
                break;
            }
            this.round++;
            System.out.println("");
            System.out.println("Round " + this.round);
            System.out.println("");
            System.out.println("Jumping order:");
            this.participants.printParticipants();
            System.out.println("");
            System.out.println("Results of round " + this.round);
            //System.out.println("");
            this.participants.printRoundResults(round);
        
        }
    }
    
    public void quit(){
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        this.participants.printFinalResults(round);
        
        
    }
    
   
}
