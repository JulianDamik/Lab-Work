
import java.util.Scanner;
import java.util.Random;

public class DiceStats {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random randGen = new Random();
      int i = 0;          // Loop counter iterates numRolls times
      int numRolls = 0;   // User defined number of rolls
      int numTwos = 0; 
      int numThrees = 0; 
      int numFours = 0; 
      int numFives = 0; 
      int numSixes = 0;   // Tracks number of 6s found
      int numSevens = 0;  // Tracks number of 7s found
      int numEights = 0; 
      int numNines = 0; 
      int numTens = 0; 
      int numElevens = 0; 
      int numTwelves = 0; 
      int die1 = 0;       // Dice values
      int die2 = 0;       // Dice values
      int rollTotal = 0;  // Sum of dice values


      System.out.println("Enter number of rolls: ");
      numRolls = scnr.nextInt();
   
      if (numRolls >= 1) {
         // Roll dice numRoll times
         for (i = 0; i < numRolls; ++i) {
            die1 = randGen.nextInt(6) + 1;
            die2 = randGen.nextInt(6) + 1;
            rollTotal = die1 + die2;

            // Count number of sixs and sevens
              if (rollTotal == 2) {
               numTwos = numTwos + 1;
            }
             else if (rollTotal == 3) {
               numThrees = numThrees + 1;
            } 
            else if (rollTotal == 4) {
               numFours = numFours + 1;
            }
             else if (rollTotal == 5) {
               numFives = numFives + 1;
            }  
              else if (rollTotal == 6) {
               numSixes = numSixes + 1;
            }
            else if (rollTotal == 7) {
               numSevens = numSevens + 1;
            }
             else if (rollTotal == 8) {
               numEights = numEights + 1;
            }
             else if (rollTotal == 9) {
               numNines = numNines + 1;
            }
             else if (rollTotal == 10) {
               numTens = numTens + 1;
            }
             else if (rollTotal == 11) {
               numElevens = numElevens + 1;
            }
             else if (rollTotal == 12) {
               numTwelves = numTwelves + 1;
            }
            System.out.println("Roll " + (i+1) + " is " + 
                  rollTotal + " (" + die1 + 
                  "+" + die2 + ")");
         }
         

         // Print statistics on dice rolls
         System.out.println("\nDice roll statistics:");
         System.out.println("2s: " + numTwos);
         System.out.println("3s: " + numThrees);
         System.out.println("4s: " + numFours);
         System.out.println("5s: " + numFives);
         System.out.println("6s: " + numSixes);
         System.out.println("7s: " + numSevens);
         System.out.println("8s: " + numEights);
         System.out.println("9s: " + numNines);
         System.out.println("10s: " + numTens);
         System.out.println("11s: " + numElevens);
         System.out.println("12s: " + numTwelves);

      } 
      else {
         System.out.println("Invalid rolls. Try again.");
      }
    
      

      return;
   }
}
