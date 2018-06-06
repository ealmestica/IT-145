/*
 SNHU - IT145
 Elijah Almestica
 Program name: Parsing strings(Java)
 
 */
package parsestrings;

import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Scanner inSS = null;
      String stringInput = "?";
      String firstWord = "?";
      String secondWord = "?";
      boolean inputDone = false;
      
      while(!inputDone) {
         System.out.println("Enter input string: ");
         stringInput = scnr.nextLine();
        
      if(stringInput.equals("q")) {
         inputDone = true;
      } 
      else if(stringInput.indexOf(",") < 0 ) { 
         System.out.println("Error: No comma in string");
      }
      else {
         inSS = new Scanner(stringInput);
         firstWord = inSS.next();
         secondWord = inSS.next();
         System.out.println("First word: "  + firstWord.replace(",", ""));
         System.out.println("Second word: "  + secondWord.replace(" ", ""));
      }
    }
  
     return;
  }
}