
import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int i = 0;          // Loop counter iterates numRolls times
      
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

            // Count number of sixs and sevens
              if (rollTotals[0] == 2) {
               rollTotals[0] = rollTotals[2] + 1;
            }
             else if (rollTotals[0] == 3) {
               rollTotals[1] = rollTotals[3] + 1;
            } 
            else if (rollTotals[0] == 4) {
               rollTotals[2] = rollTotals[4] + 1;
            }
             else if (rollTotals[0] == 5) {
               rollTotals[3] = rollTotals[5] + 1;
            }  
              else if (rollTotals[0] == 6) {
               rollTotals[4] = rollTotals[6] + 1;
            }
            else if (rollTotals[0] == 7) {
               rollTotals[5] = rollTotals[7] + 1;
            }
             else if (rollTotals[0] == 8) {
               rollTotals[6] = rollTotals[8] + 1;
            }
             else if (rollTotals[0] == 9) {
               rollTotals[7] = rollTotals[9] + 1;
            }
             else if (rollTotals[0] == 10) {
               rollTotals[8] = rollTotals[10] + 1;
            }
             else if (rollTotals[0] == 11) {
               rollTotals[9] = rollTotals[11] + 1;
            }
             else if (rollTotals[0] == 12) {
               rollTotals[10] = rollTotals[12] + 1;
            }
            System.out.println("Roll " + (i+1) + " is " + 
                  rollTotals[0] + " (" + die1 + 
                  "+" + die2 + ")");
         }
         

         // Print statistics on dice rolls
         System.out.println("\nDice roll statistics:");
         System.out.println("2s: " + rollTotals[2]);
         System.out.println("3s: " + rollTotals[3]);
         System.out.println("4s: " + rollTotals[4]);
         System.out.println("5s: " + rollTotals[5]);
         System.out.println("6s: " + rollTotals[6]);
         System.out.println("7s: " + rollTotals[7]);
         System.out.println("8s: " + rollTotals[8]);
         System.out.println("9s: " + rollTotals[9]);
         System.out.println("10s: " + rollTotals[10]);
         System.out.println("11s: " + rollTotals[11]);
         System.out.println("12s: " + rollTotals[12]);

         System.out.println("Dice roll histogram; ");
    
         System.out.print("2: ");
         for (int histVar = 1; histVar <= rollTotals[2]; histVar++){
            System.out.print("*");
           } 
         
         System.out.println();
         System.out.print("3: ");
         for (int histVar = 1; histVar <= rollTotals[3]; histVar++){
            System.out.print("*");
           } 
         
         System.out.println();
         System.out.print("4: ");
         for (int histVar = 1; histVar <= rollTotals[4]; histVar++){
            System.out.print("*");
           }
           
         System.out.println(); 
         System.out.print("5: ");
         for (int histVar = 1; histVar <= rollTotals[5]; histVar++){
            System.out.print("*");
           } 
         
         System.out.println();
         System.out.print("6: ");
         for (int histVar = 1; histVar <= rollTotals[6]; histVar++){
            System.out.print("*");
           }  
        
         System.out.println();
         System.out.print("7: ");
         for (int histVar = 1; histVar <= rollTotals[7]; histVar++){
            System.out.print("*");
           } 
        
         System.out.println();
         System.out.print("8: ");
         for (int histVar = 1; histVar <= rollTotals[8]; histVar++){
            System.out.print("*");
           } 
           
         System.out.println();
         System.out.print("9: ");
         for (int histVar = 1; histVar <= rollTotals[9]; histVar++){
            System.out.print("*");
           } 

         System.out.println();
         System.out.print("10: ");
         for (int histVar = 1; histVar <= rollTotals[10]; histVar++){
            System.out.print("*");
           } 
         
         System.out.println();
         System.out.print("11: ");
         for (int histVar = 1; histVar <= rollTotals[11]; histVar++){
            System.out.print("*");
           } 
         System.out.println();
         System.out.print("12: ");
         for (int histVar = 1; histVar <= rollTotals[12]; histVar++){
            System.out.print("*");
           } 
         System.out.println();
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
