import java.util.Scanner;

public class TweetDecoderPart2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";
      String userTweet = "";
      String convertTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.nextLine();

      if (origTweet.equalsIgnoreCase("LOL")) {
         System.out.println("LOL = laughing out loud");
         }
      else if ((origTweet.equalsIgnoreCase("LLO"))||(origTweet.equalsIgnoreCase("OLL"))){
            System.out.println("Did you mean LOL? LOL = laughing out loud");
      }
      else if (origTweet.equalsIgnoreCase("BFN")) {
         System.out.println("BFN = bye for now");
      }
      else if ((origTweet.equalsIgnoreCase("BNF"))||(origTweet.equalsIgnoreCase("NFB"))){
            System.out.println("Did you mean BFN? BFN = bye for now");
      }
      else if (origTweet.equalsIgnoreCase("FTW")) {
         System.out.println("FTW = for the win");
      }
       else if ((origTweet.equalsIgnoreCase("FWT"))||(origTweet.equalsIgnoreCase("TWF"))){
            System.out.println("Did you mean FTW? FTW = for the win");
      }
      else if (origTweet.equalsIgnoreCase("IRL")) {
         System.out.println("IRL = in real life");
      }
       else if ((origTweet.equalsIgnoreCase("RIL"))||(origTweet.equalsIgnoreCase("LRI"))){
            System.out.println("Did you mean IRL? IRL = in real life");
      }
      else if (origTweet.equalsIgnoreCase("DM")) {
         System.out.println("DM = direct message");
      }
       else if (origTweet.equalsIgnoreCase("MD")){
            System.out.println("Did you mean DM? DM = Direct message");
      }
      else if (origTweet.equalsIgnoreCase("FF")) {
         System.out.println("FF = follow friday");
      }
      else if (origTweet.equalsIgnoreCase("RT")) {
         System.out.println("RT = retweet");
      }
       else if (origTweet.equalsIgnoreCase("TR")){
            System.out.println("Did you mean RT? RT = Retweet");
      }
        else {
         System.out.println("Sorry, don't know that one.");
      }
      //part 3
      System.out.println("Please enter a Tweet. 140 characters or less: ");
      userTweet = scnr.nextLine();
     
      if (userTweet.length() < 141){
         System.out.println(userTweet);
         }
      else{
         System.out.println("Your Tweet is too long");
         }
         
      if (userTweet.indexOf("LOL") != -1){
         System.out.println("LOL = laughing out loud");
         }
      if (userTweet.indexOf("BFN") != -1){
         System.out.println("BFN = bye for now");
         }
      if (userTweet.indexOf("FTW") != -1){
         System.out.println("FTW = for the win");
         }
      if (userTweet.indexOf("IRL") != -1){
         System.out.println("IRL = in real life");
         }
      if (userTweet.indexOf("DM") != -1){
         System.out.println("DM = direct message");
         }
      if (userTweet.indexOf("FF") != -1){
         System.out.println("FF = for friday");
         }
      if (userTweet.indexOf("RT") != -1){
         System.out.println("RT = retweet");
         }

      //part 4  
      if (userTweet.indexOf("LOL") != -1){
        convertTweet = userTweet.replace("LOL", "laughing out loud");
        }
      if (userTweet.indexOf("BFN") != -1){
        convertTweet = convertTweet.replace("BFN", "bye for now");
        }
      if (userTweet.indexOf("FTW") != -1){
        convertTweet = convertTweet.replace("FTW", "for the win");
        }
      if (userTweet.indexOf("IRL") != -1){
        convertTweet = convertTweet.replace("IRL", "in real life");
        }
      if (userTweet.indexOf("DM") != -1){
        convertTweet = convertTweet.replace("DM", "direct message");
        }
      if (userTweet.indexOf("FF") != -1){
        convertTweet = convertTweet.replace("FF", "for friday");
        }
      if (userTweet.indexOf("RT") != -1){
        convertTweet = convertTweet.replace("RT", "retweet");
        }

      System.out.println("your converted Tweet: " + convertTweet);
     }
}
