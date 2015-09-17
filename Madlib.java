import java.util.Scanner;

public class MadLib{
   public static void main(String args[]){
   
   Scanner scnr = new Scanner(System.in);
   
   String color = "";
   String superlative = "";
   String adjectiveOne = "";
   String bodyPartOne = "";
   String bodyPartTwo = "";
   String noun = "";
   String animal = "";
   String adjectiveTwo = "";
   String adjectiveThree = "";
   String adjectiveFour = "";
   
   System.out.println("Enter a color: ");
   color = scnr.nextLine();
   System.out.println("Enter a superlative. (Ending in 'est'): ");
   superlative = scnr.nextLine();
   System.out.println("Enter an adjective: ");
   adjectiveOne = scnr.nextLine();
   System.out.println("Enter a plural body part: ");
   bodyPartOne = scnr.nextLine();
   System.out.println("Enter a noun: ");
   noun = scnr.nextLine();
   System.out.println("Enter a body part:" );
   bodyPartTwo = scnr.nextLine();
   System.out.println("Enter a plural animal: ");
   animal = scnr.nextLine();
   System.out.println("Enter an adjective: ");
   adjectiveTwo = scnr.nextLine();
   System.out.println("Enter an adjective: ");
   adjectiveThree = scnr.nextLine();
   System.out.println("Enter an adjective: ");
   adjectiveFour = scnr.nextLine();
   
   System.out.println("The " + color + " Dragon is the " + superlative + " Dragon of all.");
   System.out.println("It has " + adjectiveOne + " " + bodyPartOne + ", and has a " + bodyPartTwo + " shaped like a " + noun + ".");
   System.out.println("It loves to eat " + animal + ",although it will feast on nearly anything.");
   System.out.println("It is " + adjectiveTwo + " and " + adjectiveThree + ".");
   System.out.println("You must be " + adjectiveFour + " around it, or you may end up is's next meal.");
   }
}      