import java.util.Scanner;

public class SecondConversion{
   public static void main(String[] args){
   Scanner scnr = new Scanner(System.in);

   int seconds = 0;
   int min = 0;
   int hours = 0;
   int sec = 0;
   
   System.out.println("Please enter a number in seconds: ");
   seconds = scnr.nextLine;
   
   min = seconds / 60;
   hours = min / 60;
   sec = seconds % 60;
   
   System.out.print("Hours-" + hours + " Minutes-" + min + " Sec-" + sec);
   }
 }  
   

   