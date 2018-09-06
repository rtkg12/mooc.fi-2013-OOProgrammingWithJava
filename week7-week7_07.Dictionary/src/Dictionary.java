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

public class Dictionary {
    private HashMap<String, String> dictionary;
    
    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }
    
    public String translate(String word){
        if(this.dictionary.containsKey(word)){
            return this.dictionary.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }
    
    public int amountOfWords(){
        int count=0;
        for(String word: this.dictionary.keySet()){
            count++;
        }
        return count;
    }
    
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();
        
        for(String word: this.dictionary.keySet()){
            String value = word + " = " + this.dictionary.get(word);
            translationList.add(value);
        }
        return translationList;
    }
}
