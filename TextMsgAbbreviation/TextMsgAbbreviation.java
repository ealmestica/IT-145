/* SNHU - IT145
  Elijah Almestica
  Program name: Text Msg Abbreviation (Java)
*/

package textmsgabbreviation;

import java.util.Scanner;

public class TextMsgAbbreviation {

    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String userInput = "LOL";
      
      System.out.println("Input an abbreviation: ");
      userInput = scnr.nextLine();
      
      // Display laughing out loud for LOL
      if (userInput.equals("LOL")) {
         System.out.println("laughing out loud");
      }
      //Display I dont't know for IDK
      else if (userInput.equals("IDK")) {
         System.out.println("I don't know");
      }
      // Display best friends forever for BFF
      else if (userInput.equals("BFF")) {
         System.out.println("best friends forever");
      }
      // Display in my humble opinion for IMHO
      else if (userInput.equals("IMHO")) {
         System.out.println("in my humble opinion");
      }
      // Display too much information for TMI
      else if (userInput.equals("TMI")) {
         System.out.println("too much information");
      }
      // Display unknown if input does not match given abbreviations
      else {
         System.out.println("Unknown");
      }
      
      return;
   }
}
