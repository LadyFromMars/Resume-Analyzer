
import java.io.*;
import java.util.*;

public class nounParse {

    // add new element to an Array

public static String[] add(String[] originalArray, String newItem)
{
    int currentSize = originalArray.length;
    int newSize = currentSize + 1;
    String[] tempArray = new String[ newSize ];
    for (int i=0; i < currentSize; i++)
    {
        tempArray[i] = originalArray [i];
    }
    tempArray[newSize- 1] = newItem;
    return tempArray;
}


// MAIN

public static void main (String[] args) {

    //input
String library = "We all love fairy tales. This guide offers recommended stories by age, teaching ideas, discussion questions, and useful links.";


    String text = "fairy love legend evil age tales";


    // searching for matches

    String[] words = library.split(" ");

    List<String> wordsList = Arrays.asList(words);

    String[] matches = text.split(" ");
    String[] result = {" "};
     String [] missed = {" "};

    for (String match : matches) {
        /* System.out.println(match + " occurs " +
         Collections.frequency(wordsList, match) + " times");*/

        //add matches to results
        if(Collections.frequency(wordsList, match)>=1){
         result = add(result, match);}

    }


      //outprint the results

      System.out.println("Matching elements:");

    for (String element:result) {
        System.out.println( element );
    }



}

}
