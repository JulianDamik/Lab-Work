
import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int i = 0;          // Loop counter iterates numRolls times
      int j = 0;
      
      int[] rollTotals = new int[13];
      
      int die1 = 0;       // Dice values
      int die2 = 0;       // Dice values
      int numRolls = 0;

      System.out.println("Enter number of rolls: ");
      numRolls = scnr.nextInt();
  
   while (numRolls > 1){
      if (numRolls >= 1) {
         // Roll dice numRoll times
         for (i = 0; i < numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            rollTotals[0] = die1 + die2;

            rollTotals[rollTotals[0]]++;
                   
            System.out.println("Roll " + (i+1) + " is " + 
                  rollTotals[0] + " (" + die1 + 
                  "+" + die2 + ")");
         }
         
         // Print statistics on dice rolls
         System.out.println("\nDice roll statistics:");
         for(j = 2; j < 12; j++){
            System.out.println(j + "s: " + rollTotals[j]);
         }
         
         System.out.println("Dice roll histogram; ");
    
         for(j = 2; j < rollTotals.length; j++){
            System.out.print(j + ": ");
            for (int histVar = 1; histVar <= rollTotals[j]; histVar++){
               System.out.print("*");
           } 
            System.out.println();
          }
         }
       
      else {
         System.out.println("Invalid rolls. Try again.");
      }
      numRolls = 0;
      System.out.println("Enter number of rolls: ");
      numRolls = scnr.nextInt();
     }
     
          return;
   }
  }
