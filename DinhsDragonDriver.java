// Julian Damik
import java.util.Scanner;

public class DinhsDragonDriver{
   public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);
   
   String color = " ";
   int health = 0;
   int age = 0;
   
   int i;
   
   System.out.println("How many dragons do you want to create?");
   i = scnr.nextInt();
   
   DinhsDragon[] dragonArray = new DinhsDragon[i];
   
   for(int j = 0; j < i; j++){
      dragonArray[j] = new DinhsDragon();
      
      System.out.println("What color is Dragon" + (j+1) + "?");
      color = scnr.next();
      System.out.println("What is Dragon" + (j+1) + "'s health points? (Whole Number)");
      health = scnr.nextInt();
      System.out.println("How old is Dragon" + (j+1) + "? (Whole Number)");
      age = scnr.nextInt();
      System.out.println();
      
      dragonArray[j].setColor(color);
      dragonArray[j].setHealth(health);
      dragonArray[j].setAge(age);
      }
   
   for(int j = 0; j < i; j++){
      System.out.println("Dragon" + (j+1) + "'s color: " + dragonArray[j].getColor() + ".");
      System.out.println("Dragon" + (j+1) + "'s health: " + dragonArray[j].getHealth() + " HP.");
      System.out.println("Dragon" + (j+1) + "'s age: " + dragonArray[j].getAge() + " Years.");
      System.out.println();
      }
      
   }
}