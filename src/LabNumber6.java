import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/16/2017.
 */
public class LabNumber6 {
    public static void main(String[] args) {

        System.out.println("Welcome to the Pig Latin Translator!");
        System.out.println();


        System.out.print("Enter a word to be translated: ");
        Scanner scan = new Scanner(System.in);

        String pigTrans = scan.nextLine();
        pigTrans = pigTrans.toLowerCase();


        char v = pigTrans.charAt(0);
        if (v == 'a' || v == 'e' || v == 'o' || v == 'i' || v == 'u') {
            System.out.println("Vowel: " + pigTrans);
            //process Pig Latin with vowel

            String newPig = pigTrans + "way";
            System.out.print("Your translated word is: " + newPig);

        } else {
            System.out.println("Consonant: " + pigTrans);
            for (int i = 0; i < pigTrans.length(); i++) {

                char p = pigTrans.charAt(i);
                if (p == 'a' || p == 'e' || p == 'o' || p == 'i' || p == 'u') {
                    //process pig Latin with consonant
                    String newPig = pigTrans.substring(i);
                    newPig += pigTrans.substring(0, i);
                    System.out.println("Your translated word is: " + newPig + "ay");
                    break;
                }

                //}
                //find the vowel
                //loop through the word

                //test THIS letter if it's a vowel
                //if it is
                //build a new word
                //start with the vowel through the end

                //add the beginning up to, not including, the vowel

                //but first must take the consonant(s) at the beginning of word and put at end.


//        if (v == 'e')
//        if (v == 'i')
//        if (v == 'o')
//        if (v == 'u')


//            how do I extract the first letter(if not a vowel) then move the the rear????
//            Also, if the word begins with a vowel - just need to add the "way"


                //String convertTonewPig = pigTrans + "way"; //this is wrong and inefficient!!! change it....
                //System.out.println(pigTrans);


            }
        }
    }
    }