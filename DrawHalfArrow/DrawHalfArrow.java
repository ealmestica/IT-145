/* SNHU - IT145
   Elijah Almestica
   Program name: Draw Half Arrow (Java)
*/

package drawhalfarrow;
import java.util.Scanner; 

public class DrawHalfArrow {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
      //Initialized variables
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      int h = 0;
      int w = 0;
      int ah = 0;
      int aw = 0;
     
      //User inputs of the dimensions of the arrow
      System.out.println("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();
      
      System.out.println("Enter arrow head width: ");
      arrowHeadWidth = scnr.nextInt();
      
      //Keeps prompting user for dimensions of arrow until the value is larger than the arrow base width
      while (arrowHeadWidth <= arrowBaseWidth) {
         System.out.println("Enter arrow head width: ");
         arrowHeadWidth = scnr.nextInt();
      }
      
      //Draw arrow base using nested for loops
      for(h = 1; h <= arrowBaseHeight; ++h) {
         for(w = 1; w <= arrowBaseWidth; ++w) {
         System.out.print("*");
         }
      System.out.print("\n");
      }
      //Draw arrow head using nested for loops
      for (ah = 0; ah < arrowHeadWidth; ++ah) {
         for (aw = arrowHeadWidth; aw > ah; --aw) { 
         System.out.print("*");
         }
         System.out.print("\n");
      }
      
      return;
   }
}
