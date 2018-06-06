/*
  SNHU - IT145
  Elijah Almestica
  Program name: Grocery Sorter (Java)
  4.9.1: Enumerations: Grocery items

 */
package grocerysorter;

import java.util.Scanner;

public class GrocerySorter {
   public enum GroceryItem {GR_APPLES, GR_BANANAS, GR_JUICE, GR_WATER};

    public static void main(String[] args) {
       GroceryItem userItem = GroceryItem.GR_APPLES;

      
      if(userItem == GroceryItem.GR_APPLES) {
         System.out.println("Fruit");
      }
      else if(userItem == GroceryItem.GR_BANANAS) {
       System.out.println("Fruit");
      }
      else if(userItem == GroceryItem.GR_JUICE) {
       System.out.println("Drink");
      }
      else if(userItem == GroceryItem.GR_WATER) {
       System.out.println("Drink");
      }

      return;
   }
}
