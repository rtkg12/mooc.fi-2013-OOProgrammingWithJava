
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }
    
    private static void printWithSmileys(String characterString){
        if(characterString.length()%2!=0){
            characterString = characterString + " ";
        }
        int smileyLength = (characterString.length()+6)/2;
        printLoop(smileyLength);
        System.out.println(":) " + characterString + " :)");
        printLoop(smileyLength);

    }
    
    public static void printSmiley(){
        System.out.print(":)");
    }
    
    public static void printLoop(int count){
        for(int i=0; i<count; i++){
            printSmiley();
        }
        System.out.println("");
    }

}
