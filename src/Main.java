import java.util.Arrays;

public class Main{
    // Create pig latin
    public static void main(String[] args){
        // Create if for consonant and vowel word rules
        String word = "Pig";
        char[] wordArray = word.toCharArray();
        char firstLetter;

        if(wordArray[0] == 'A' || wordArray[0] == 'E' || wordArray[0] == 'I'
                || wordArray[0] == 'O' || wordArray[0] == 'U'){
            System.out.println("This starts with a vowel");
        }else{
            System.out.println("This starts with a consonant");
            firstLetter = wordArray[0];
            wordArray[0] = '\0';
            for(char i : wordArray){
                System.out.print(i);
            }
            System.out.print(firstLetter + "ay");
        }
    }
}
