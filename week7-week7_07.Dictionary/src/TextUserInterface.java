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

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void add(){
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();
        System.out.print("Translation: ");
        String translation = this.reader.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(word));
    }
    
    public void start(){
        System.out.print("Statement: ");
        String input = this.reader.nextLine();
        
        if(input.equals("quit")){
            System.out.println("Cheers!");
        }
        else if(input.equals("add")){
            add();
            start();
        }
        else if(input.equals("translate")){
            translate();  
            start();
        }
        else{
            System.out.println("Unknown statement");
            start();
        }
    }
}
