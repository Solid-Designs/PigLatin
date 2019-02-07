import java.util.Arrays;

public class Main{
    // Create pig latin
    public static void main(String[] args){
        // Create if for consonant and vowel word rules
        String word = "Egg";
        char[] wordArray = word.toCharArray();
        char firstLetter = wordArray[0];

        if(firstLetter == 'A' || wordArray[0] == 'E' || wordArray[0] == 'I'
                || wordArray[0] == 'O' || wordArray[0] == 'U'){
            System.out.println("This starts with a vowel");
            System.out.println(word + "ay");
        }else{
            System.out.println("This starts with a consonant");
            // Make the first character null/empty
            wordArray[0] = '\0';

            for(char i : wordArray){
                System.out.print(i);
            }
            System.out.print(firstLetter + "ay");
        }
    }
}
