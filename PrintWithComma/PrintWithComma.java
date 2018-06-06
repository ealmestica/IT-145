/*
 * SNHU - IT145
 * Elijah Almestica
 * 7.4.5: Printing array elements separated by commas.
 */
package printwithcomma;

public class PrintWithComma {
   public static void main (String [] args) {
      final int NUM_VALS = 4;
      int[] hourlyTemp = new int[NUM_VALS];
      int i = 0;

      hourlyTemp[0] = 90;
      hourlyTemp[1] = 92;
      hourlyTemp[2] = 94;
      hourlyTemp[3] = 95;

      
      System.out.print(hourlyTemp[0]);

      for(i = 1; i < NUM_VALS; ++i) {
         System.out.print(", " + hourlyTemp[i]);
      }     


      System.out.println("");

      return;
   }
}