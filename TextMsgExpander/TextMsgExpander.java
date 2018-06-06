/* SNHU - IT145
  Elijah Almestica
  Program name: Text Msg Expander (Java)
*/
package textmsgexpander;

import java.util.Scanner;

public class TextMsgExpander {

    public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);
      
      //Variables
      String userInput = "LOL";
      
      //Get a line of user input into a string. Output that line. 
      System.out.println("Enter text: ");
      userInput = scnr.nextLine();
      System.out.println("You entered: " + userInput + "\n");
      /*
      Expand common text message abbreviations. 
      Output a message for each abbreviation that is expanded, 
      then output the expanded line.
      
      I used indexOf because if the string is in the sentence it will yield
      a number greater than zero and if number is not found it yields negative
      causing it to be false.
      */      
      // Find BFF and replace with best friends forever
       if (userInput.indexOf("BFF") >= 0) {
         userInput = userInput.replace("BFF", "best friend forever");
         System.out.println("Replaced \"BFF\" with \"best friend forever\".");
      }
      //Find IDK and replace with I don't know
      if (userInput.indexOf("IDK") >= 0) {
         userInput = userInput.replace("IDK", "I don't know");
         System.out.println("Replaced \"IDK\" with \"I don't know\".");
      }
      // Find JK and replace with just kidding
      if (userInput.indexOf("JK") >= 0) {
         userInput = userInput.replace("JK", "just kidding");
         System.out.println("Replaced \"JK\" with \"just kidding\".");       
      }
      // Find TMI and replace with too much information
       if (userInput.indexOf("TMI") >= 0) {
         userInput = userInput.replace("TMI", "too much information");
         System.out.println("Replaced \"TMI\" with \"too much information\".");
      }
      // Find TTYL and replace with talk to you later
       if (userInput.indexOf("TTYL") >= 0) {
         userInput = userInput.replace("TTYL", "talk to you later");
         System.out.println("Replaced \"TTYL\" with \"talk to you later\".");
      }
      // Display expanded line
      System.out.println("\nExpanded: "+userInput);
      
      return;
   }
}