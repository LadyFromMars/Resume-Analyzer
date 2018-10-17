
import java.io.*;
import java.util.*;

public class wordParse {

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
    String resume = "Engaged, creative computer science professional with 15+ years experience. Seeking to leverage exemplary leadership skills, analytical skills, and coding skills as a project manager for Cisco Systems.";


    String jobDescription = "creative experience science leadership coding";


    // searching for matches

    String[] words = resume.split(" ");

    List<String> wordsList = Arrays.asList(words);

    String[] matches = jobDescription.split(" ");
    String[] result = {" "};
     String [] missed = {" "};

    for (String match : matches) {
       /* System.out.println(match + " occurs " +
         Collections.frequency(wordsList, match) + " times"); */

        //add matches to results and non-matches to missed

        if(Collections.frequency(wordsList, match)>=1){
         result = add(result, match);}
         else {
        missed = add(missed, match);
         }

    }


      //outprint the results

      System.out.println("Matching elements:");

    for (String element:result) {
        System.out.println( element );
    }


    //add words not in a text

   System.out.println("Not Matching elements:");

    for (String element:missed) {
        System.out.println( element );
    }



}

}
