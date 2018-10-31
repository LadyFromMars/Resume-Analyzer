


import java.io.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



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
    String library = keyWordsAPI.library1;

    String resume = " ShouldBe Shouldnot script java python mockito scrum junit framework teamplayer team lider! Code efficient role family degree business, unit test snowboarding family ";

    String job = "java script Perl linux unix quality, optimizing testing scrum regression bugs resolution results phase framework exploratory blabla";







    // searching for matches

    String[] words = library.split(" ");

    List<String> wordsList = Arrays.asList(words);







      // Modifuing resume (input) + matches

    String[] matches = resume.replace("!","").replace(",","").replace("/","").replace("?","").replace(".","").toLowerCase().split(" ");

    String[] result = {" "};


    for (String match : matches) {
        /* System.out.println(match + " occurs " +
         Collections.frequency(wordsList, match) + " times");*/

        //add matches to results
        if(Collections.frequency(wordsList, match)>=1){
         result = add(result, match);}

    }




      // Modifying job description(input) + matches(same)

      String[] equals = job.replace("!","").replace(",","").replace("/","").replace("?","").replace(".","").toLowerCase().split(" ");

      String[] result2 = {" "};



      for (String equal : equals) {
          /* System.out.println(match + " occurs " +
           Collections.frequency(wordsList, match) + " times");*/

          //add matches to results
          if(Collections.frequency(wordsList, equal)>=1){
           result2 = add(result2, equal);}

      }





      //outprint the results of KEYWORDS PARSE

      System.out.println("Key words in resume:");

    for (String element:result) {
        System.out.println( element );
    }

    System.out.println();
    System.out.println("Key words in job description:");

  for (String element:result2) {
      System.out.println( element );
  }




  // Matches btwn Job Description (result2) and resume (result)

  String[] twins = result;
  String[] jobTwin = result2;
  List<String> resultList = Arrays.asList(jobTwin);



  String[] total = {" "};
  String[] missed = {" "};

  for (String twin : twins) {
      //System.out.println(match + " occurs " +
       //Collections.frequency(wordsList, match) + " times");*/

      //add matches to results
      if(Collections.frequency(resultList, twin)>=1){
       total = add(total, twin);}
       else {
        missed = add(missed, twin);
       }

  }


    //outprint the results (matches btw resume and job description)

    System.out.println();
    System.out.println("Common words in job description and resume:");

  for (String element:total) {
      System.out.println( element );
  }

      //outprint the MISmatches btw resume and job description)

    System.out.println();
    System.out.println("You need to add this keywords to your resume:");

    for (String element:missed) {
    System.out.println( element );
    }

}

}
