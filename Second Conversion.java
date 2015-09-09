

public class SecondConversion{
   public static void main(String[] args){
   
   int SECONDS = 7986;
   int min = 0;
   int hours = 0;
   int sec = 0;
   
   min = SECONDS / 60;
   hours = min / 60;
   sec = SECONDS % 60;
   
   System.out.print("Hours-" + hours + " Minutes-" + min + " Sec-" + sec);
   }
 }  
   

   