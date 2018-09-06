/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ritik
 */
public class Main {
    public static void main(String[] args){
       Box box = new Box(10);
       Box box2 = new Box(5);

        box2.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box2.add( new Book("Robert Martin", "Clean Code", 1) );
        box.add( new Book("Kent Beck", "Test Driven Development", 0.7) );

        box.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        
        box2.add(box);
        //box2.add(box2);

        System.out.println( box );
        System.out.println( box2 );

    }
}
