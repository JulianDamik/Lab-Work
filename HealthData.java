import java.util.Scanner;

public class HealthData {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userAgeYears = 0;
      int userAgeDays  = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      int beatsPerMin = 0;
      double numOfSneezes = 0;
      int calsBurned = 0;
      
      System.out.println("Enter your age in years: ");
      userAgeYears = scnr.nextInt();
      
      userAgeDays = userAgeYears * 365;
      hours = userAgeDays * 24;
      minutes = hours * 60;
      seconds = minutes * 60;
      beatsPerMin = minutes * 72;
      numOfSneezes = userAgeDays * 1.2;
      calsBurned = userAgeDays * 1620;
      

      System.out.println("You are " + userAgeDays + " days old.");
      System.out.println("You are about " + hours + " hours old.");
      System.out.println("You are about " + minutes + " minutes old.");
      System.out.println("You are about " + seconds + " seconds old.");
      System.out.println("Your heart has beated about " + beatsPerMin + " times.");
      System.out.println("You have sneezed about " + numOfSneezes + " times in your life.");
      System.out.println("You have burned about " + calsBurned + " in your life.");



      
      return;
   }
}
