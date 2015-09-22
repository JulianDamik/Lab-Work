import java.util.Scanner;

public class TweetDecoder {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String origTweet = "";

      System.out.println("Enter abbreviation from tweet: ");
      origTweet = scnr.next();

      if (origTweet.equals("LOL")) {
         System.out.println("LOL = laughing out loud");
         }
      else if ((origTweet.equals("LLO"))||(origTweet.equals("OLL"))){
            System.out.println("Did you mean LOL? LOL = laughing out loud");
      }
      else if (origTweet.equals("BFN")) {
         System.out.println("BFN = bye for now");
      }
      else if ((origTweet.equals("BNF"))||(origTweet.equals("NFB"))){
            System.out.println("Did you mean BFN? BFN = bye for now");
      }
      else if (origTweet.equals("FTW")) {
         System.out.println("FTW = for the win");
      }
       else if ((origTweet.equals("FWT"))||(origTweet.equals("TWF"))){
            System.out.println("Did you mean FTW? FTW = for the win");
      }
      else if (origTweet.equals("IRL")) {
         System.out.println("IRL = in real life");
      }
       else if ((origTweet.equals("RIL"))||(origTweet.equals("LRI"))){
            System.out.println("Did you mean IRL? IRL = in real life");
      }
      else if (origTweet.equals("DM")) {
         System.out.println("DM = direct message");
      }
       else if (origTweet.equals("MD")){
            System.out.println("Did you mean DM? DM = Direct message");
      }
      else if (origTweet.equals("FF")) {
         System.out.println("FF = follow friday");
      }
      else if (origTweet.equals("RT")) {
         System.out.println("RT = retweet");
      }
       else if (origTweet.equals("LLO")){
            System.out.println("Did you mean RT? RT = Retweet");
      }
        else {
         System.out.println("Sorry, don't know that one.");
      }

      return;
   }
}
