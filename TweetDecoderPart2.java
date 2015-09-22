import java.util.Scanner;

public class TweetDecoderPart2 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";
      String userTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.next();

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

      System.out.println("Please enter a Tweet. 140 characters or less: ");
      userTweet = scnr.next();
     
      if (userTweet.length() <= 141){
         System.out.println(userTweet);
         }
      else{
         System.out.println("Your Tweet is too long");
         }
          return;
   }
}

